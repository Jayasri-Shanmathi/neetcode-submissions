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
        List<int[]> l=new ArrayList<>();
        for(Interval n:intervals){
            l.add(new int[]{n.start,1});
            l.add(new int[]{n.end,-1});
        }
        int ans=0;int count=0;
        l.sort((a,b)-> a[0]==b[0] ? a[1]-b[1]:a[0]-b[0]);
        for(int[] n:l){
            count+=n[1];
            ans=Math.max(count,ans);
        }
        return ans;
    }
}
