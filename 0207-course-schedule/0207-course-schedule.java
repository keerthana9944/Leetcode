class Solution {
    public boolean cycle(int start, int curr, List<List<Integer>> grph, boolean[] visited){
        visited[curr] = true;

        for(int i : grph.get(curr)){
            if(i==start){
                return true;
            }
            if(!visited[i]){
                if(cycle(start, i, grph, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> grph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            grph.add(new ArrayList<>());
        }

        for(int[] p : prerequisites){
            grph.get(p[1]).add(p[0]);
        }

        for(int i=0; i<numCourses; i++){
            boolean[] visited = new boolean[numCourses];

            if(cycle(i, i, grph, visited)){
                return false;
            }
        }
        
        return true;
    }
}