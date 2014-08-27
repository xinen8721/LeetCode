public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row <= matrix.length-1 && col >= 0)
        {
            if(matrix[row][col] > target)
            {
                col--;
            }
            
            else if(matrix[row][col] < target)
            {
                row++;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}