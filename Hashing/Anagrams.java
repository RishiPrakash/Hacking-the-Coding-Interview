public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> arr) {
        
        
        
		HashMap temp = new HashMap();
		ArrayList<ArrayList<Integer>> finalMap = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,ArrayList<Integer>> tempFinalMap = new HashMap<Integer,ArrayList<Integer>>();
		StringBuffer revTemp = null;
		for(int i=0;i<arr.size();i++){
			revTemp = new StringBuffer(arr.get(i)).reverse();
			if(temp.containsKey(sortString(revTemp.toString()))){
				ArrayList<Integer> listOfItems = tempFinalMap.get((Integer)temp.get(sortString(revTemp.toString())));
				if(listOfItems==null){
					listOfItems = new ArrayList<Integer>();
				}
				listOfItems.add(Integer.parseInt((i+1)+""));
				tempFinalMap.put((Integer)temp.get(sortString(revTemp.toString())),listOfItems);
			}else{
				tempFinalMap.put(Integer.parseInt((i+1)+""),null);
				temp.put(sortString(arr.get(i)),i+1);
			}
		}
		for (Integer keyVa : tempFinalMap.keySet()) {
			ArrayList<Integer> tempArr = new ArrayList<Integer>();
			tempArr.add(keyVa);
			if(tempFinalMap.get(keyVa)!=null){
				ArrayList<Integer> storedL = tempFinalMap.get(keyVa);
				Iterator itr = storedL.iterator();
				while(itr.hasNext())
					tempArr.add((Integer)itr.next());
			}
			finalMap.add(tempArr);
		}
    
			return finalMap;
        
    }
        
    
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
    
}
