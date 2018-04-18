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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
        int startOverlap = -1;
        int endOverlap = intervals.size()-1;
        boolean startFound = false;
        
        if(newInterval.start>newInterval.end){
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }
        
        
        ArrayList<Interval> finalIntervals = new ArrayList<Interval>();
        for(int i=0;i<intervals.size();i++){
            
            Interval tempObj = (Interval)intervals.get(i);
            if((Math.max(tempObj.start,newInterval.start)<=Math.min(tempObj.end,newInterval.end))){
                
                if(startFound){
                    endOverlap = i;
                }else{
                    startOverlap = i;
                    endOverlap = i;
                    startFound = true;
                    finalIntervals.add(null);
                }
                
            }else{
                finalIntervals.add(tempObj);
            }
            
        }
        
      //  return finalIntervals;
        boolean newIntAdded = false;
        
        for(int i=0;i<finalIntervals.size();i++){
            if(finalIntervals.get(i)==null){
                finalIntervals.set(i,new Interval(Math.min(intervals.get(startOverlap).start,newInterval.start),Math.max(intervals.get(endOverlap).end,newInterval.end)));
                newIntAdded = true;
                break;
            }
        }
       
        /*
        if(!newIntAdded && finalIntervals.size()>0 && finalIntervals.get(0).start+finalIntervals.get(0).end<newInterval.start+newInterval.end){
            
                finalIntervals.add(newInterval);
                
        }else if(!newIntAdded){
            finalIntervals.add(0,newInterval);
        }
        */
        for(int i=0;i<finalIntervals.size();i++){
            if(!newIntAdded && finalIntervals.get(i).start+finalIntervals.get(i).end>=newInterval.start+newInterval.end){
               finalIntervals.add(i,newInterval);
                newIntAdded =true;
                break;
            }
            
        }
        if(!newIntAdded){
            
                finalIntervals.add(newInterval);
                
        }
        
       return  finalIntervals;

    }
}
