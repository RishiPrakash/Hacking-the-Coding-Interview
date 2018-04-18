public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        int minXORVal = 0 ;
        boolean firstItr = true;
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++){
            
                int temp = A.get(i)^A.get(i+1);
               // System.out.println(temp + "==="+i+"---"+j);
                if(firstItr){
                    minXORVal = temp;
                    firstItr = false;
                }
               else if(temp<minXORVal){
                    minXORVal = temp ;
                }
                
            
        }    
            return minXORVal;
    }
}
