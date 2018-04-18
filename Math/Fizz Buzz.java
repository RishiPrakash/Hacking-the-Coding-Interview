public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> listFB = new ArrayList<String>();
        boolean tick = false;
        for(int i=1;i<=A;i++){
             
            if(i%3==0 && i%5==0){
                listFB.add("FizzBuzz");
                tick = true;
            } 
            else if(i%5==0){
                listFB.add("Buzz");
                tick = true;
            }
            else if(i%3==0){
                listFB.add("Fizz");
                tick = true;
            }else{
                listFB.add(i+"");    
            }
            
        }
        return listFB;
        
    }
}
