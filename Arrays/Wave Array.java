public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	
	    java.util.Collections.sort(a);
	    
	    for(int i=1;i<a.size();){
	        
	        int tempNum  = a.get(i-1);
	        a.set(i-1,a.get(i));
	        a.set(i,tempNum);
	        
	        i+=2;
	    }
	   return a; 
	}
}
