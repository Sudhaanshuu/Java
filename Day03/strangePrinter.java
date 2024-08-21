class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] Sudha = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            Sudha[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    Sudha[i][j] = Sudha[i][j - 1];
                } else {
                    Sudha[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        Sudha[i][j] = Math.min(Sudha[i][j], Sudha[i][k] + Sudha[k + 1][j]);
                    }
                }
            }
        }

        return Sudha[0][n - 1];
    }
}
