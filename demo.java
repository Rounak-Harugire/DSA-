// 1. Find the Largest Sum Contiguous Subarray (Kadane’s Algorithm)
// o Example: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4] Output: 6 (Subarray: [4,
// -1, 2, 1])

class demo{
    public static void main(String[] args){
        int[] a ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = a[0];
        int sum = 0;
        for(int i=0; i < a.length; i++){
            sum += a[i];   //sum = sum + a[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        System.out.println(max);
    }
}