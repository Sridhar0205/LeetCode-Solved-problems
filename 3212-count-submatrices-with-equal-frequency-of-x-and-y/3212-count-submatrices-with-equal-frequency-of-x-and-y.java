class Solution {
    class Pair {
        int countX;
        int countY;

        public Pair(int x, int y) {
            countX = x;
            countY = y;
        }
        public String toString(){
            return this.countX + "#"+ this.countY;
        }
    }

    public int numberOfSubmatrices(char[][] arr) {
        Pair[][] sum = new Pair[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                Pair currentPair;
                if (arr[i][j] == 'X') {
                    currentPair = new Pair(1, 0);
                } else if (arr[i][j] == 'Y'){
                    currentPair = new Pair(0, 1);
                }else{
                    currentPair = new Pair(0, 0);
                }
                if (i == 0) {
                    if (j - 1 >= 0) {
                        sum[i][j] = new Pair(sum[i][j - 1].countX + currentPair.countX,
                                sum[i][j - 1].countY + currentPair.countY);
                    } else {
                        sum[i][j] = currentPair;
                    }
                } else if (j == 0) {
                    if (i - 1 >= 0) {
                        sum[i][j] = new Pair(sum[i - 1][j].countX + currentPair.countX,
                                sum[i - 1][j].countY + currentPair.countY);
                    } else {
                        sum[i][j] = currentPair;
                    }
                } else {
                    sum[i][j] = new Pair(
                            sum[i - 1][j].countX + sum[i][j - 1].countX - sum[i - 1][j - 1].countX + currentPair.countX,
                            sum[i - 1][j].countY + sum[i][j - 1].countY - sum[i - 1][j - 1].countY
                                    + currentPair.countY);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                if (sum[i][j].countX == sum[i][j].countY && sum[i][j].countX >= 1) {
                    count++;
                }
            }
        }
        return count;
    }
}