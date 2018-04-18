public class Solution {
    public int braces(String A) {
        
        Stack tempStack = new Stack();
		boolean valid = false;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='(' || A.charAt(i)=='{' || A.charAt(i)=='['){
                tempStack.push(A.charAt(i));
            }else if(A.charAt(i)==')' || A.charAt(i)=='}' || A.charAt(i)==']'){
				 //System.out.println(A.charAt(i)+"----"+(char)tempStack.peek());
               
				
					while((char)tempStack.peek()=='x'){
						valid = true;
						tempStack.pop();
				}
				 if(tempStack.empty()){
                    return 1;
                }
                if(A.charAt(i)==')' && (char)tempStack.peek()=='(' ){
                    if(!valid)
						return 1;
					else{
						valid = false;
						tempStack.pop();
					}
					
                }
                if(A.charAt(i)=='}' && (char)tempStack.peek()=='{'){
                     if(!valid)
						return 1;
					else{
						valid = false;
						tempStack.pop();
					}
                }
                if(A.charAt(i)==']' && (char)tempStack.peek()=='['){
                     if(!valid)
						return 1;
					else{
						valid = false;
						tempStack.pop();
					}
                }
			}else{
               if(A.charAt(i)=='+' || A.charAt(i)=='-' || A.charAt(i)=='*'||A.charAt(i)=='/')
               tempStack.push('x');
            }
        }
		
		while(!tempStack.empty() && (char)tempStack.peek()=='x'){
           // System.out.println("Coming inside");
						
						tempStack.pop();
		//	System.out.println(tempStack.size());
				}
        if(tempStack.empty()){
            return 0;    
        }else{
            return 1;
        }
        
        
   
    }
}
