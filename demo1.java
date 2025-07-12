// Rotate an Array by K Steps
// o Example: Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]


class demo1 {
    public static void main(String[] args) {
        int[] a ={1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = a.length;
        int[] b = new int[n];
        for(int i=0; i<n ;i++){
            b[(i + k) % n] = a[i];
        }
        for(int i=0; i<n; i++){
            System.out.print(b[i] + " ");
        }
    }
}
