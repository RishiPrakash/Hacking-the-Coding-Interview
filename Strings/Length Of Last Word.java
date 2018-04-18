public class Solution {
    
    public boolean ifSpace(char a){
        if(a== ' '){
            return true;
        }else{
            return false;
        }
    }
    
    int totalLength = 0;
    boolean seeFirstChar = false;
	public int lengthOfLastWord(final String a) {
	    for(int i=(a.length()-1);i>=0;i--){
	        if(!ifSpace(a.charAt(i))){
	            seeFirstChar = true;
	            totalLength++;
	        }else{
	            if(!seeFirstChar){
	                
	            }else{
	            break;
	            } 
	        }
	    }
	    return totalLength;
	}
}
