class Solution {
    public int minSetSize(int[] arr) {
        int min = 1000000, max = 0;
        for (int val : arr) {
            min = Math.min(val,min);
            max = Math.max(val,max);
        }
        int[] count = new int[max-min+1];
        for (int val : arr) {
            count[val-min]++;
        }
        int[] bucket = new int[arr.length+1];
        for (int val : count) {
            if (val != 0) bucket[val]++;
        }
        
        int size = 0, sum = 0;
        final int half = arr.length>>1;
        for (int i = arr.length; i > 0; i--) {
            while (bucket[i]-- != 0) {
                sum += i;
                size++;
                if (sum >= half) return size;
            }
        }
        return 0;
    }
}