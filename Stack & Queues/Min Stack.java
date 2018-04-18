class Solution {
    
    Stack mainStack = new Stack();
	Stack auxStack = new Stack();
    public void push(int ele) {
        
		mainStack.push(ele);
		if(!auxStack.empty() && (int)auxStack.peek()<ele){
			auxStack.push(auxStack.peek());
		//	return auxStack.peek();
		}else{
			auxStack.push(ele);
		//	return ele;
		}
		//return -1;
    }

    public void pop() {
        
        if(!mainStack.empty()){
            mainStack.pop();
        }
        if(!auxStack.empty()){
            auxStack.pop();
        }    
		    
		//return mainStack.pop();
    }

    public int top() {
        
		if(!mainStack.empty()){
			return (int)mainStack.peek();
		}else{
			return -1;
		}
    }

    public int getMin() {
        
		if(!auxStack.empty())
			return (int)auxStack.peek();
		else
			return -1;	
    }
}
