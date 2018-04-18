public class Solution {
    public int evalRPN(ArrayList<String> s) {
        
	//Stack temp1 = new Stack();
	Stack temp2 = new Stack();
	//System.out.println(s.size()+"===size checking");
	
	for(int i=0;i<s.size();i++){
	//	System.out.println("s.get(i)==="+s.get(i));
		if(s.get(i).equals("*") || s.get(i).equals("/") || s.get(i).equals("-")  || s.get(i).equals("+") ){
		int t2 = Integer.parseInt(temp2.pop()+"");
		int t1 = Integer.parseInt(temp2.pop()+"");
		int fint = 0;
		if(s.get(i).equals("*")){
		fint = t1*t2;
		}
		if(s.get(i).equals("/")){
		fint = t1/t2;
		}
		if(s.get(i).equals("+")){
		fint = t1+t2;
		}
		if(s.get(i).equals("-")){
		fint = t1-t2;
		}
		//System.out.println("fint=="+fint);
		temp2.push(fint);
		}
		else{
			temp2.push(s.get(i));
		}
	}
	return Integer.parseInt(temp2.pop()+"");
	
    }
}
