class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        int MOD = 1_000_000_007;

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        // base cases
        for (int i = 1; i <= Math.min(limit, zero); i++) {
            dp0[i][0] = 1;
        }

        for (int j = 1; j <= Math.min(limit, one); j++) {
            dp1[0][j] = 1;
        }

        for (int z = 0; z <= zero; z++) {
            for (int o = 0; o <= one; o++) {

                for (int k = 1; k <= Math.min(limit, z); k++) {
                    dp0[z][o] = (dp0[z][o] + dp1[z - k][o]) % MOD;
                }

                for (int k = 1; k <= Math.min(limit, o); k++) {
                    dp1[z][o] = (dp1[z][o] + dp0[z][o - k]) % MOD;
                }
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}