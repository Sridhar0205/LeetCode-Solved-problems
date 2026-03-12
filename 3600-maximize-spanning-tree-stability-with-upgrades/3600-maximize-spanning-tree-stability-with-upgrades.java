class Solution {
    static int[]par;
    static int[]rank;
    static void init(int n){
        par=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }
    void union(int a,int b){
        int parA=find(a);
        int parB=find(b);
        if(parA==parB)return;
        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }else if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }
        else{
            par[parA]=parB;
        }
    }
    int find(int a){
        if(par[a]==a)return a;
        return par[a]=find(par[a]);
    }
    public int maxStability(int n, int[][] edges, int k) {
        ArrayList<int[]>mustList=new ArrayList<>();
        ArrayList<int[]>edgeList=new ArrayList<>();
        for(int[]edge:edges){
            if(edge[3]==1)mustList.add(edge);
            else edgeList.add(edge);
        }
        Collections.sort(edgeList,(a,b)->b[2]-a[2]);

        init(n);
        int strength=Integer.MAX_VALUE;
        int includedEdges=0;
        for(int[]edge:mustList){
            if(find(edge[0])==find(edge[1])){
                return -1;
            }
            union(edge[0],edge[1]);
            strength=Math.min(strength,edge[2]);
            includedEdges++;
        }
        ArrayList<Integer>candidates=new ArrayList<>();
        //preserve the mininum if must ko set me dala ho

        for(int[]edge:edgeList){
            if(find(edge[0])==find(edge[1])){
                continue;
            }
            union(edge[0],edge[1]);
            candidates.add(edge[2]);
            includedEdges++;
        }
        for(int j=candidates.size()-1;j>=0;j--){
            if(k>0){
                candidates.set(j,candidates.get(j)*2);
                k--;
            }
            strength=Math.min(candidates.get(j),strength);
        }

        // System.out.println(Arrays.toString(par));
        // System.out.println(Arrays.toString(rank));
        // System.out.println("strength:"+strength);
        if(includedEdges==n-1)return strength;
        return -1;
    }
}