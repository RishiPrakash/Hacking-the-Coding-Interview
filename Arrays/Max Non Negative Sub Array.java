public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long maxSum = 0;
	    long newSum = 0;
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	        if (i >= 0) {
	            newSum += i;
	            newArray.add(i);
	        } else {
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
	            maxSum = newSum;
	            maxArray = newArray;
	        }
	    }
	    return maxArray;
	}
}


