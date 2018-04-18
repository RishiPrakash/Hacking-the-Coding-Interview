public class Solution {
    public int lengthOfLongestSubstring(String longString) {
            HashMap temp  = new HashMap();
            int longStrNum = 0;
            for(int i=0;i<longString.length();i++){
                    String tempS = longString.charAt(i)+"";
                    if(temp.containsKey(tempS)){
                        i = (int)temp.get(tempS);
                      int tempSize = temp.size();
                      if(tempSize>longStrNum){
                        longStrNum = tempSize;
                      }
                      temp.clear();
                    }else{
                      temp.put(tempS,i);
                      //i++;
                    }
            }
            int tempSize = temp.size();
            if(tempSize>longStrNum){
              longStrNum = tempSize;
            }
           // System.out.println("longStrNum===="+longStrNum);
          return longStrNum;
    }
}
