// Merge Intervals
// o Example: Input: [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]


class demo2 {
    public static void main(String[] args) {
        int[][] a = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        int n = a.length;
        
        int start = a[0][0]; // start = 1
        int end = a[0][1];   // end = 3

        for (int i = 1; i < n; i++) {
            if (a[i][0] <= end) {
                end = Math.max(end, a[i][1]);
            } else {
                System.out.println("[" + start + "," + end + "]");
                start = a[i][0];
                end = a[i][1];
            }
        }

        System.out.println("[" + start + "," + end + "]");
    }
}
