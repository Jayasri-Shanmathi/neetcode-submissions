class Solution {
    public void bt(int open,int close,int n,List<String>ans,StringBuilder sb){
        if(open==close && close==n){
            ans.add(sb.toString());return;
        }
        if(open<n){
            sb.append('(');
            bt(open+1,close,n,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            bt(open,close+1,n,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        bt(0,0,n,ans,sb);
        return ans;
    }
}
