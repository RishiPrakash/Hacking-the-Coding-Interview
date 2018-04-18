public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
	    int i = 0;
	    int j = 0;
	    while(j<=a.size()-1){
	        if(i==j && j<a.size()-1){
	            j++;
	        }
	        if((a.get(j)-a.get(i))<b){
	            j++;
	        }else if((a.get(j)-a.get(i))>b){
	            i++;
	            
	        }else{
	            if(i!=j)
                    return 1;
                else
                    break;
            }
	    }
	    
	    return 0;
	    
	}
}
