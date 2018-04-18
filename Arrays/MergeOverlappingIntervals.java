/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

Collections.sort(intervals, (Interval p1, Interval p2) -> ((Integer)p1.start).compareTo((Integer)p2.start));
        
       
   // return    intervals;
        
        for(int i=1;i<intervals.size();){
            
            if((Math.max(intervals.get(i-1).start,intervals.get(i).start))<=Math.min(intervals.get(i-1).end,intervals.get(i).end)){
                
        

                    Interval eleOne = (Interval)intervals.get(i-1);
                    Interval eleTwo = (Interval)intervals.get(i);
                    
                    
                    
                    
                    //intervals.remove(i-1);
                    intervals.set(i,new Interval(Math.min(eleOne.start,eleTwo.end),Math.max(eleOne.end,eleTwo.end)));
                    intervals.remove(i-1);
                    
                    
                    i=1;
            }else{
                i++;
            }  
        
        }
        
        return intervals;
       
    }
    
    
}
