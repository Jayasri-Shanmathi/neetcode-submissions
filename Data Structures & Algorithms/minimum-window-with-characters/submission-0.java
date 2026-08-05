class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int rem=t.length();
        int start=0;
        int i=0;
        int len=Integer.MAX_VALUE;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)>0)rem--;
                map.put(ch,map.get(ch)-1);
            }
            while(rem==0){
                if(j-i+1<len){
                    len=j-i+1;
                    start=i;
                }
            char left=s.charAt(i);
            if(map.containsKey(left)){
                map.put(left,map.get(left)+1);
                if(map.get(left)>0)rem++;
            }i++;
            }
            
        }
        if(len==Integer.MAX_VALUE)return "";
        return s.substring(start,start+len);
    }
}
