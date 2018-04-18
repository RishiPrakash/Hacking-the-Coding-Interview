public class Solution {
	public int maxArea(ArrayList<Integer> a) {
	    int maxArea = 0;
	    for(int i=0;i<a.size()-1;i++){
	        if(a.get(i)<a.get(i+1)){
	            i++;
	        }
	        
	        for(int j=i;j<a.size();j++){
	            int tempArea = (j-i)*Math.min(a.get(i),a.get(j));
	            if(maxArea<tempArea){
	                maxArea = tempArea;
	            }
	            
	        }
	    
	        
	    }
	    return maxArea;
	}
}
