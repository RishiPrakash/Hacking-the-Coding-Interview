public class Solution {
	public int uniquePaths(int a, int b) {
	    
	    int top = Math.max(a,b);
	    int bottom = Math.min(a,b);
	  
        double totPath = 1;
        int borg = bottom-1;
        int divisor = 1;
        for(int i=top;i<=(a+b-2);i++){
            totPath*=i;
           // System.out.println(totPath+"---after Multiplication=="+i);
              if(divisor<=borg){    
                totPath/=divisor++;
               // System.out.println(totPath+"-----afte Division"+(borg+1));
            }  
            
        }
        
      
        
        return (int)totPath;
   
	}
	
public double getFact(int a){
    if(a>1)
      return (a*getFact(a-1));
    else{
            if(a==0)a=1;
            
        return a;  
    }
      
  }
}
