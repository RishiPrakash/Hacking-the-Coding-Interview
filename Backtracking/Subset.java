public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    int cur_index = 0;
    Collections.sort(A);
    ArrayList<ArrayList<Integer>> superSet = new ArrayList<ArrayList<Integer>>();
    superSet.add(new ArrayList<Integer>());
    for(int i=0;i<A.size();i++){
      ArrayList<Integer> eachEleList = new ArrayList<Integer>();
      eachEleList.add(A.get(i));
      superSet.add(eachEleList);
      nextPossiblity(i,eachEleList,A,superSet);
    }
return superSet;


    }

    void nextPossiblity(int cur_index,ArrayList<Integer> soFar,ArrayList<Integer> eleList
    ,ArrayList<ArrayList<Integer>> superSet){
      for(int i=(cur_index+1);i<eleList.size();i++){
          ArrayList<Integer> tempList = new ArrayList<Integer>(soFar);
          tempList.add(eleList.get(++cur_index));
          superSet.add(tempList);
          nextPossiblity(cur_index,tempList,eleList,superSet);
        }
      }
}
