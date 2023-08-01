class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(result, 1, n, k, new ArrayList<Integer>());
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, int start, int n, int k, List<Integer> list) {
        if (k == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        
        for (int i=start; i<=n-k+1; i++) {
            list.add(i);
            backtrack(result, i+1, n, k-1, list);
            list.remove(list.size()-1);
        }
    }
}