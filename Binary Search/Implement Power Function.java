import java.math.*;
public class Solution {
	public int pow(int x, int y, int d) {
	  if(x==0 && y==0){
	      return 0;
	  }  
	    
    long temp = powerOf((long)x,(long)y,(long)d);
    if(temp<0){
      temp+=d;
    }
    return (int)temp;
  }
	    public long powerOf(long a,long b,long c){
	        
    long x = (long)a;
    long y = (long)b;
    long d = (long)c;
    long temp = 1L;
        if(y==0)
            return 1;
        
      if(y%2==0){
          temp = (long)powerOf(x,y/2,d);
            return (temp*temp)%d;
      }else{
            return ((x%d)*((long)powerOf(x,y-1,d)))%d;
      }
    }
}
