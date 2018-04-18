import java.math.*;
public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
		// DO NOT MODIFY THE LIST

			StringBuffer strBuf = new StringBuffer();
			
			Collections.sort(a, new Comparator<Integer>(){
				
				public int compare(Integer n1,Integer n2){
					
					return (n2+""+n1).compareTo(n1+""+n2);
				
				}
			
			 
			
		});
			
			for(Integer obj:a){
				strBuf.append(obj);
			 }
			
			
		return new BigInteger(strBuf.toString())+"";	
	}

}
