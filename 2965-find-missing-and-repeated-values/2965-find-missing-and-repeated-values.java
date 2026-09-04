class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        int[] count = new int[totalElements + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int a = -1, b = -1;
        for (int i = 1; i <= totalElements; i++) {
            if (count[i] == 2) {
                a = i;
            } else if (count[i] == 0) {
                b = i;
            }
        }

        return new int[]{a, b};
    }
}
