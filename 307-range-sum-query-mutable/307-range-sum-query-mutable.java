class NumArray {
  int[] arr;    // stores nums[]
  int[] BITree; // binary indexed tree

  public NumArray(int[] nums) {
    int n = nums.length;
    arr = new int[n];
    BITree = new int[n + 1];
    
    for (int i = 0; i < n; i++) {
      update(i, nums[i]); // init BITree[]
      arr[i] = nums[i];   // init arr[]
    }
  }

  void update(int i, int val) {
    int diff = val - arr[i]; // get the diff
    arr[i] = val;            // update arr[]
    
    i++;
    while (i <= arr.length) {
      BITree[i] += diff; // update BITree[]
      i += i & (-i);     // update index to that of parent
    }
  }
  
  int getSum(int i) {
    int sum = 0;
    
    i++;
    while (i > 0) {
      sum += BITree[i]; // accumulate the sum
      i -= i & (-i);    // move index to parent node
    }
    return sum;
  }

  public int sumRange(int i, int j) {
    return getSum(j) - getSum(i - 1);
  }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */