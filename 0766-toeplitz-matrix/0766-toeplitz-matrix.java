class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int key = i-j;
                if(hMap.containsKey(key)){
                    if(hMap.get(key) != matrix[i][j])
                        return false;
                }
                else
                    hMap.put(i-j, matrix[i][j]);
            }
        }
        return true;
    }
}