
public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    if (a.size() < 2) return a.size();
	    
	    // List#remove is proportional to the number of elements after the removed index
	    // Thus, we move from the end for optimal run time
	    int prev = a.get(a.size() - 1);
	    for (int i = a.size() - 2; i >= 0; i--) {
	        if (a.get(i) == prev) {
	            a.remove(i);
	        }
	        else {
	            prev = a.get(i);
	        }
	    }
	    
	    return a.size();
	}
}

