// 3. Merge Intervals
// o Example: Input: [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]


class demo3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 2};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    return;
                }
            }
        }
    }
}
