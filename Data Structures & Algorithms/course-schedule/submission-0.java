class Solution {
    public boolean dfs(int i,Map<Integer,List<Integer>>map,Set<Integer> set){
        if(set.contains(i)) return false;
        if(map.get(i).isEmpty()) return true;
        set.add(i);
        for(int n:map.get(i)){
            if(!dfs(n,map,set)) return false;
        }
        set.remove(i);
        map.put(i,new ArrayList<>());
        return true;


    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[]n:prerequisites){
            List<Integer>l=map.get(n[0]);
            l.add(n[1]);
            map.put(n[0],l);
        }
        for(int i=0;i<numCourses;i++){
            if(!dfs(i,map,set)) return false;
        }
        return true;
    }
}
