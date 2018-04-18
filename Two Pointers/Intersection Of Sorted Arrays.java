public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
	    int i =0;
	    int j=0;
	    ArrayList<Integer> al  = new ArrayList<Integer>();
	    while(i<a.size() && j<b.size()){
	     //  System.out.print("Comparing===="+a.get(i)+"--"+b.get(j));
	        if((int)a.get(i)!=(int)b.get(j)){
	          //  System.out.println("===not Equal");
	            if((int)a.get(i)<(int)b.get(j)){
	                i++;
	            }else{
	                j++;
	            }
	        }else{
	           // System.out.println("===Equal");
	            al.add(a.get(i));
	            i++;
	            j++;
	        }
	    }
	    return al;
	}
}
