public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int xorVal = a.get(0);
	    for(int i=1;i<a.size();i++){
	        xorVal ^=a.get(i); 
	    }
	    return xorVal;
	}
}
