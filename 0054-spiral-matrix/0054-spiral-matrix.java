class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            //rowWise left to right
            for(int col=colStart;col<=colEnd;col++)
            {
                ans.add(matrix[rowStart][col]);
            }
            rowStart++;
            //colwise top to bottom
            for(int row=rowStart;row<=rowEnd;row++)
            {
                ans.add(matrix[row][colEnd]);
            }
            colEnd--;
            //check for valid row and col
            //rowwise right to left
            if(rowStart<=rowEnd)
            {
            for(int col=colEnd;col>=colStart;col--)
            {
                ans.add(matrix[rowEnd][col]);
            }
            rowEnd--;
            }

            //colwise bottom to top
            if(colStart<=colEnd)
            {
            for(int row=rowEnd;row>=rowStart;row--)
            {
                ans.add(matrix[row][colStart]);
            }
            colStart++;
            }

        }
        return ans;
        
            }
}