public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
			
			int max_so_far = 0;
			int max_temp = 0;
			int max_Value_soFar = a.get(0);	
			boolean all_Negative = true;
			for (int i=0;i<a.size();i++){
				
				if((max_temp+a.get(i))>0){
					max_temp += a.get(i);
				}else{
					max_temp = 0;
				}
				if(max_temp>max_so_far){
					max_so_far = max_temp;
				}
				
				if(i>0){
					if(a.get(i)>max_Value_soFar){
						max_Value_soFar = a.get(i);	
					}
				}
				
				if(i>0){
					if(a.get(i)>max_Value_soFar){
						max_Value_soFar = a.get(i);
					}
				}
				
				if(a.get(i)>0){
					all_Negative = false;
				}
			}
			
			if(all_Negative){
				max_so_far = max_Value_soFar;
			}
			
		return max_so_far;	
		}
}
