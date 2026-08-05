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
    public boolean canAttendMeetings(List<Interval> intervals) {
       int N=intervals.size();
       intervals.sort(Comparator.comparingInt(interval -> interval.start));
       for(int i=0;i<N-1;i++){
          int curr=intervals.get(i).end;
          int nxt=intervals.get(i+1).start;
          if(curr>nxt) return false;
       }
       return true;
    }
}
