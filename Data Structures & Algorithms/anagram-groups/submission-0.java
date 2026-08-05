class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int N=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<N;i++){
            char[]word=strs[i].toCharArray();
            Arrays.sort(word);
            StringBuilder sb=new StringBuilder();
            for(char ch:word) sb.append(ch);
            String str=sb.toString();
            if(!map.containsKey(str)){
                List<String> l=new ArrayList<>();
                l.add(strs[i]);
                map.put(str,l);
            }
            else {
                List<String> l=map.get(str);
                l.add(strs[i]);
                map.put(str,l);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> l: map.values()){
            ans.add(l);
        }
        return ans;
    }
}
