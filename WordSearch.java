public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || word == null)   return false;
        for(int i = 0; i < board.length ; i++)
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    boolean found = existWord(board, i, j, word, 0, new boolean[board.length][board[0].length]);
                    if(found)
                        return true;
                }
            }  
        return false;
    }
    
    public boolean existWord(char[][] board, int rowIndx, int colIndx, String word, int index, boolean[][] visited)
    {
        if(index < 0 || rowIndx < 0 || colIndx < 0 || rowIndx >= board.length || colIndx >= board[0].length || index >= word.length())
            return false;
        if((board[rowIndx][colIndx] != word.charAt(index)) || visited[rowIndx][colIndx])            
            return false;
        visited[rowIndx][colIndx] = true;
        if(index == word.length() - 1)
            return true;
        // UP DOWN LEFT RIGHT
        boolean found = existWord(board, rowIndx, colIndx - 1, word, index + 1, visited) || existWord(board, rowIndx, colIndx + 1, word, index + 1, visited)|| existWord(board, rowIndx - 1, colIndx, word, index + 1, visited) || existWord(board, rowIndx + 1, colIndx, word, index + 1, visited);
        visited[rowIndx][colIndx] = false;
        return found;
    }
}