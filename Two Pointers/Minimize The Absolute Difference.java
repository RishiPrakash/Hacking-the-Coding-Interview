public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int residual_diff =  Math.abs(A.get(A.size()-1))+Math.abs(B.get(B.size()-1))+Math.abs(C.get(C.size()-1));
        int res_i  = -1;
        int res_j =  -1;
        int res_k = -1;
        int i=0;
        int j=0;
        int k=0;
        while(i<A.size() && j<B.size() && k<C.size()){
            int min = Math.min(Math.min(A.get(i),B.get(j)),C.get(k));
            int max = Math.max(Math.max(A.get(i),B.get(j)),C.get(k));
            int absValue = Math.abs(max-min);
             //System.out.println(max+"---"+min+"----"+absValue);

            if(absValue <residual_diff){
                residual_diff = absValue;
               // res_i = i;res_j = j;res_k=k;
                //System.out.println(res_i +"---"+res_j+"----"+res_k);
            }
            
            if(absValue==0)return 0;
            
            if(min==A.get(i))i++;
            if(min==B.get(j))j++;
            if(min==C.get(k))k++;
            
            
            
            
        }
        return residual_diff;
    }
}
