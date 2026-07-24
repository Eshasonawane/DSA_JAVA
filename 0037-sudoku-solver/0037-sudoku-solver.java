class Solution {

    public static boolean isSafeToPlace(char[][]board,char charValue,int colIndex,int rowIndex)
    {
        //check in the same row
        for(int i=0;i<9;i++)
        {
            if(board[rowIndex][i]==charValue)
            {
                return false;
            }
        }
        //check in the same column
        for(int i=0;i<9;i++)
        {
            if(board[i][colIndex]==charValue)
            {
                return false;
            }
        }

        //check int the 3*3 matrix

        int startRow=rowIndex-rowIndex%3;
        int startCol=colIndex-colIndex%3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int actualRow=startRow+i;
                int actualCol=startCol+j;
                if(board[actualRow][actualCol]==charValue)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean findEmptyCell(char[][]board,int [] emptyCell)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    //store emptycell row index
                    emptyCell[0]=i;
                    //store empty cell column index
                    emptyCell[1]=j;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean solveSodokuHelper(char[][] board)
    {
        int emptyCell[]= new int[2];
        //base case
        if(!findEmptyCell(board,emptyCell))
        {
            return true;
        }

        int rowIndex=emptyCell[0];
        int colIndex=emptyCell[1];

        for(int value=1;value<=9;value++)
        {
            char charValue=(char)(value +'0');
            if(isSafeToPlace(board,charValue,colIndex,rowIndex))
            {
                //place kardo
                board[rowIndex][colIndex]=charValue;
                //baki recursion sambhal lega
                if(solveSodokuHelper(board)==true)
                {
                    return true;
                }

                board[rowIndex][colIndex]='.';

            
            }
        }
        return false;

    }
    public void solveSudoku(char[][] board) {
        solveSodokuHelper(board);
    }
}