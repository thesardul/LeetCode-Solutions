class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
        Map<Integer, Integer> map = new HashMap<>(n.length);
        Integer index;
        for(int i=0;i<n.length;i++)
        {
            index = map.put(n[i],i);
            if(index!=null && Math.abs(index-i)<=k ) return true;
            
        }
        return false;
    }
}