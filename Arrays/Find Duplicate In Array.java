public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
		HashSet hs = new HashSet();
		for(Integer obj:a){
			if(hs.add(obj)==false){
				return obj;
			}
		}
		return -1;
		
	}
}
