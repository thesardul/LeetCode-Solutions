class Solution {
     public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        if((n % 2 != 0) && arr.length > 1)
            sum += sum;
        int temp = 3;
        while (temp < arr.length){
            int temp1 = Solution.midCalc(arr,temp);
            temp+=2;
            sum+=temp1;
        }
        return sum;
    }
    
     public static int midCalc(int[] arr, int val){
        int tempSum = 0;
        for(int i =0; i < arr.length-val+1; i++){
            for(int k =0, j = i; k < val; k++,j++){
                tempSum += arr[j];
            }
        }
        return tempSum;
    }
}