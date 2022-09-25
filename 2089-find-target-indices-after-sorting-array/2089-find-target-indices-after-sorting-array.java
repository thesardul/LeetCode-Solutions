class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int first = firstOccurence(nums,target);
        int last = lastOccurence(nums,target);
        List<Integer> ans = new ArrayList<>();
        if(first == -1 && last == -1)
            return ans;
        for(int i = first; i <= last; i++){
            ans.add(i);
        }
        return ans;
    }
    public int firstOccurence(int[] a, int x) {
        int first = -1;
        int l = 0, r = a.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(a[mid] < x)
                l = mid + 1;
            else if(a[mid] > x)
                r = mid - 1;
            else{
                first = mid;
                r = mid - 1;
            }
        }
        return first;
    }
    
    public int lastOccurence(int[] a, int x) {
        int last = -1;
        int l = 0, r = a.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(a[mid] == x) {
                last = mid;
                l = mid + 1;
            }
            else if(a[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return last;
    }
}