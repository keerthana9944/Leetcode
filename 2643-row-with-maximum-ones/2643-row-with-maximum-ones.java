class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCnt=0;
        int max=0;
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0; i<m; i++){
            int cnt=0;
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            if(cnt > maxCnt){
                maxCnt = cnt;
                max = i;
            }
        }
        return new int[]{max, maxCnt};
    }
}