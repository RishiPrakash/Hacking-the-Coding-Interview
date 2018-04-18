public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    
	    int index = searchB(a,b);
	    int aaju =-1;
	    int baju =-1;
	    if(a.get(index)==b){
	        return index;
	    }else{
	      aaju =  BinarySearch(a,b,0,index-1);
	      baju = BinarySearch(a,b,index+1,a.size()-1);
	    }
	    
	    if(aaju>-1){
	        return aaju;
	    }else if(baju>-1){
	        return baju;
	    }
	    
	    return -1;
	  
	}
	
	public int BinarySearch(final List<Integer> alist,int b, int start,int end){
	     int low = start;
	    int high = end;
	    int finalIndex = -1;
	    while(low<=high){
	        int mid = low +(high-low)/2;
	        //System.out.println(alist.get(mid).intValue()+"===mid=="+mid+"==="+b);

	        if(alist.get(mid).intValue()==b){
	           // System.out.println("coming inside of this==");
	            finalIndex =  mid;
	            break;
	        }else if(alist.get(mid).intValue()<b){
	           low = mid+1;
	          
	        }else{
	             high = mid -1;
	        }
	    }
	    //System.out.println("final going to index=="+finalIndex);
	    return finalIndex;
	}
	
		public int searchB(final List<Integer> a, int b) {
	    
	    int low = 0;
	    int high = a.size()-1;
	    int index = -1;
	    while(low<=high){
	        int mid = low +(high-low)/2;
	        //System.out.println("mid=="+mid);

	        if(mid==0 || (mid>0 && (a.get(mid-1).intValue() > a.get(mid).intValue()) )){
	            return mid;
	        }else if(a.get(mid)<a.get(high)){
	           high = mid -1;
	        }else{
	            low = mid+1;
	            
	            
	        }
	    }
	   
	    	       return index; 

	    
	
	}
	
	
	
}
