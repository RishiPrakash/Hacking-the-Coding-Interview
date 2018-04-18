public class Solution {
	public int searchInsert(ArrayList<Integer> list, int ele) {
	   int low = 0;
    int high = list.size()-1;
    int reqIndex = -1;
    while(low<=high){


      int mid = low + (high-low)/2;
      if(ele == list.get(mid)){
        return mid;
      }else if(ele<list.get(mid)){
        high = mid -1;
      }else{
        low = mid + 1;
      }
    }


		if(reqIndex==-1){
			reqIndex = (low +  high)/2;
			if(reqIndex>0){
				reqIndex++;
			}else{
				if(ele<list.get(0)){
					reqIndex = 0;
				}else{
					reqIndex++;
				}
			}
		}

    return reqIndex;
}
}
