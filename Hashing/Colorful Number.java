public class Solution {
    public int colorful(int num) {
        
	HashMap SubS = new HashMap();
		String Number = num+"";
		for(int i=0;i<Number.length();i++){
		    	int tempMux = 0;
			for(int j=i;j<Number.length();j++){
			
				if(i!=j){
					tempMux =
					tempMux
					*Character.getNumericValue(Number.charAt(j));
				}else{
					tempMux = Character.getNumericValue(Number.charAt(i));
				}
			if(SubS.containsKey(tempMux)){
			return 0;
			}else{
				SubS.put(tempMux,tempMux);
			}
			}
		}
		return 1;
	
    }
}
