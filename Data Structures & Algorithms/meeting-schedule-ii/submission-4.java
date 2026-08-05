/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int N=intervals.size();
        int[]start=new int[N];
        int[]end=new int[N];
        int i=0;
        for(Interval n:intervals){
           start[i]=n.start;
           end[i]=n.end;
           i++;
        }
        Arrays.sort(start);Arrays.sort(end);
        int s=0;int e=0;int count=0;int res=0;
        while(s<N && e<N){
           if(start[s]<end[e]){
             count++;
             s++;
           }
           else if(start[s]>end[e]){
            count-=1;
            e++;
           }
           else {
            s++;e++;
           }
           res=Math.max(count,res);
        }
        return res;
    }
}
