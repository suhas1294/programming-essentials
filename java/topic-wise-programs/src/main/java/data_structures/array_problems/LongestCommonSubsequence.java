package data_structures.array_problems;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class LongestCommonSubsequence {
    int lcs(char[] X, char[] Y, int m, int n)
    {
        int L[][] = new int[m + 1][n + 1];

        /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        long startTime = System.nanoTime();

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i - 1] == Y[j - 1]){
                    L[i][j] = L[i - 1][j - 1] + 1;
                    //System.out.println(String.format("x[%d] = %c and y[%d] is %c", i-1, X[i-1], j-1, Y[j-1]));
                }
                else {
                    //System.out.println(String.format("L[%d-1][%d] = %d and L[%d][%d - 1] is %d",i,j, L[i - 1][j], i, j, L[i][j - 1]));
                    L[i][j] = max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        long durationInMs = TimeUnit.MILLISECONDS.convert(totalTime, TimeUnit.NANOSECONDS);
        print2D(L);
        System.out.println(totalTime + " nano seconds");
        System.out.println(durationInMs + " milli seconds");
        return L[m][n];
    }

    public static void print2D(int mat[][]){
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

    int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " + lcs.lcs(X, Y, m, n));
    }
}
