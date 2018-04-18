public class Solution {
	public int isPalindrome(int a) {
	    
	    if(a<0){
	        return 0;
	    }
	    
	    StringBuilder number = new StringBuilder();
	    number.append(a+"");
	    number.reverse();
	    if((a+"").equals(number.toString())){
	        return 1;
	    }else{
	        return 0;
	    }
	}
}
