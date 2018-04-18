public class Solution {
	public String convert(String a, int b) {
      boolean doInc = true;
      String[] s = new String[b];
      int value = 0;
      for(int i =0;i<a.length();i++){
        if(s[value]!=null && !s[value].equals(null))
          s[value] +=a.charAt(i)+"";
        else
          s[value] =a.charAt(i)+"";
      //  System.out.println("value==="+value + "===sValue=="+s[value] );
        if(b!=1){
        value = doAction(value,doInc);
          
        if(value==b-1){
          doInc = false;
        }else if(value==0){
          doInc = true;
        }
        }
      }
      StringBuilder sb = new StringBuilder();
      for(int j=0;j<s.length;j++){
       // System.out.println("looking in to String=="+s[j]);
               if(s[j]!=null &&!s[j].equals("null"))
                sb.append(s[j]);
      }
      return sb.toString();

    
	}
	
    public int doAction(int val,boolean Inc){
      if(Inc){
        return ++val;
      }else{
        return --val;
      }
    }

}
