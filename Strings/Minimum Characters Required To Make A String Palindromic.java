public class Solution {
    public int solve(String a) {
        
    int i=0;
    int j=1;
    int orgLength = a.length();
    a = a+"."+reverseString(a);
    
    int lps[] = new int[a.length()];
    lps[0]=0;

      if(a!=null && a!="null"){


          while(j<a.length()){
            if(a.charAt(i)==a.charAt(j)){
              lps[j]=++i;
              j++;
            }else{
                if(i!=0){
                  i = lps[i-1];
                }else{
                  j++;
                }
            }
          }

       
for(int index=0;index<lps.length;index++){
            //System.out.print(lps[index]+" ");
          }

      }else{
        System.out.println("No String passed");
      }
      
     // System.out.println(orgLength + "---"+lps[lps.length-1]);
return (int)(orgLength-lps[lps.length-1]);
  
        
    }


 String reverseString(String a){
  String aOld  = a;
  for(int i=a.length()-1;i>=0;i--){
  aOld+=a.charAt(i);
  }
  return aOld;
}

}
