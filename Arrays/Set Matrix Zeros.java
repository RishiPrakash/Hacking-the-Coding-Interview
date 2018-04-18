public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	
	    HashSet<Integer> hs = new HashSet<Integer>();
	    HashSet<Integer> hc =  new HashSet<Integer>();
	    for(int j=0;j<a.size();j++){
	        if(a.get(j).indexOf(0)>-1){
	            hc.add(j);
	            for(int i=0;i<a.get(j).size();i++){
	                
	                if(Integer.parseInt(a.get(j).get(i)+"")==0){
                             hs.add(i);
	                }
	                }
	              /*  for(int k=0;k<a.get(j).size();k++){
	                    a.get(j).set(k,0);
	                }*/
	                    
	                }
	                
	            }
	        
	        
	        for(int j=0;j<a.size();j++){
	            
	            for(int i=0;i<a.get(j).size();i++){
	                if(hc.contains(j)){
	                    a.get(j).set(i,0);
	                }
	                
	                if(hs.contains(i)){
	                    a.get(j).set(i,0);
	                }
	            }
	        }
	    
	    
	  
	}
}
