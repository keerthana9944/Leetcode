class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }

        int n = s.length();
        char[][] grid = new char[numRows][n];
        int row=0, col=0;
        boolean down = true;

        for(int i=0; i<n; i++){
            grid[row][col] = s.charAt(i);

            if(down){
                if(row==numRows-1){
                    down = false;
                    row--;
                    col++;
                }else{
                    row++;
                }
            }else{
                if(row==0){
                    down = true;
                    row++;
                }else{
                    row--;
                    col++;
                }
            }
        }

        StringBuilder str = new StringBuilder();

        for(int i=0; i<numRows; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] != '\0'){
                    str.append(grid[i][j]);
                }
            }
        }

        return str.toString();
    }
}