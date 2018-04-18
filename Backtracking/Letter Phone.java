public class Solution {
    ArrayList<String> finalList = new ArrayList<String>();
static String[][] superArr = new String[][]{{"0"},{"1"},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"}
							,{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}
};
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String>	res =  new ArrayList<String>();
ArrayList<String>	pres =  new ArrayList<String>();
String[]	alpha = superArr[Integer.parseInt(digits.charAt(0)+"")];
res.add("");
allComb(digits,0,alpha,res,pres);
return finalList;
    }
    	void allComb(String digits,int currentIndex,String[] alpha, ArrayList<String> res,ArrayList<String> pres){
		if(res==null){
			res =  new ArrayList<String>();
			pres =  new ArrayList<String>();
			alpha = superArr[Integer.parseInt(digits.charAt(0)+"")];
			res.add("");
		}
		for(int j=0;j<res.size();j++){
			for(int i=0;i<alpha.length;i++){
				pres.add(res.get(j)+alpha[i]);
			}
		}
		res = pres;
		pres = new ArrayList<String>();
		if(currentIndex<digits.length()-1){
			alpha = superArr[Integer.parseInt(digits.charAt(currentIndex+1)+"")];
			allComb(digits,currentIndex+1,alpha,res,pres);
		}else{
			finalList = res;
		}
}
}
