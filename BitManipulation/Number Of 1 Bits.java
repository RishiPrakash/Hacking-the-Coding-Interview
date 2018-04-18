public class Solution {
	public int numSetBits(long a) {
	    int numOfOne = 0;
	    long currentVal = a;
	    while(currentVal>0){
	        numOfOne+=currentVal%2;
	        currentVal/=2;
	    }
	    	return numOfOne;

	}
}
