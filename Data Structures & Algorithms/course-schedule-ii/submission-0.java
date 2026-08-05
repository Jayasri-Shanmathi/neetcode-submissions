class Solution {
    Map<Integer,List<Integer>> map=new HashMap<>();
    Set<Integer> visited=new HashSet<>();
    Set<Integer> vis=new HashSet<>();
    List<Integer> course=new ArrayList<>();

    public boolean dfs(int n){
        if(vis.contains(n)) return false;
        if(visited.contains(n)) return true;
        vis.add(n);
        for(int i:map.get(n)){
            if(!dfs(i)) return false;
        }
        vis.remove(n);
        visited.add(n);
        course.add(n);
        return true;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]order=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[]n:prerequisites){
            map.get(n[0]).add(n[1]);
        }
        for(int i=0;i<numCourses;i++){
            if(!dfs(i)) return new int[0];
        }
       // Collections.reverse(course);
       for(int i=0;i<numCourses;i++){
        order[i]=course.get(i);
       }
       return order;

    }
}
