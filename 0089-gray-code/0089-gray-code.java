class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
      return Collections.singletonList(0);
    } else {
      List<Integer> previousCodes = grayCode(n - 1);
      List<Integer> result = new ArrayList<>(previousCodes);
      for (int i = previousCodes.size() - 1; i >= 0; i--) {
        result.add(previousCodes.get(i) + (1 << (n - 1)));
      }
      return result;
    }
  }

}