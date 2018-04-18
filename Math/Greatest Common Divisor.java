public class Solution {
	public int gcd(int a, int b) {
	    int limit = 0;
	    int gcd = 1;
	    if(a>b){
	        limit = a;
	    }else{
	        limit = b;
	    }
	    for(int i = (int)java.lang.Math.sqrt(limit);i>=1;i--){
	        if(a%i==0 && b%i==0){
	            gcd = i; 
	            for(int j=2;i*j<=limit;j++){
	                if(a%(i*j)==0 && b%(i*j)==0){
	                    gcd = i*j; 
	                }
	            }
	            break;
	        }
	    }
	    return gcd;
	}
}
