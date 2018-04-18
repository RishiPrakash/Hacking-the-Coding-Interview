public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int eleCovered = 0;
        boolean found = false;
        ArrayList<Integer> fL = new ArrayList<Integer>();
         Stack<Integer> tempStack = new Stack<Integer>();
        while(eleCovered<A.size()){
            found = false;
            //System.out.println(A.get(eleCovered)+"----");
             while(!tempStack.empty()){
                Integer temp = tempStack.peek();
                if(temp<A.get(eleCovered)){
                     tempStack.push(A.get(eleCovered));
                    fL.add(temp);
                    found = true;
                    break;
                }else{
                    tempStack.pop();
                }
            }
            if(!found){
                tempStack.push(A.get(eleCovered));
                fL.add(-1);
            }
            eleCovered++;
        }
        return fL;
    }
}
