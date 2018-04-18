public class Solution {
	public int isPalindrome(String a) {
	    StringBuilder str = new StringBuilder();
	    for(int i=0;i<a.length();i++){
	        if(Character.isDigit(a.charAt(i)) || Character.isLetter(a.charAt(i))){
	            str.append(a.charAt(i));
	        }
	    }
	    
	   // System.out.println(str.toString());
	    int palinSofar = 1;
	    for(int i=0;i<str.length();i++){
	        if(i<str.length()-1-i){
	            if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase((str.charAt(str.length()-1-i)))){    
	        }else{
	            palinSofar = 0;
	            break;
	        }
	        }else{
	            break;
	        }
	    }
	    return palinSofar;
	}
}
