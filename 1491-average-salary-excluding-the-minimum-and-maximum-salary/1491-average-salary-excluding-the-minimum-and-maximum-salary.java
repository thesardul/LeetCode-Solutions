class Solution {
    public double average(int[] sal) {
        int len = sal.length;
        double sum = 0;
        int minSal = Integer.MAX_VALUE, maxSal = Integer.MIN_VALUE;
        
        for(int i  = 0; i < len; i++){
            if(sal[i] < minSal)
                minSal = sal[i];
            if(sal[i] > maxSal)
                maxSal = sal[i];
            sum += sal[i];
        }
        return (sum - (minSal + maxSal)) / (len - 2);
    }
}