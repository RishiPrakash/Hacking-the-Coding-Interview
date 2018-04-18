public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> allLists = null;
        return allPerm(allLists,A);
    }

    ArrayList<ArrayList<Integer>> allPerm( ArrayList<ArrayList<Integer>> allLists,ArrayList<Integer> a){
          if(allLists==null){
            allLists = new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<a.size();i++){
                ArrayList temp = new ArrayList();
                temp.add(a.get(i));
                allLists.add(temp);
            }
          }


          if(allLists!=null && allLists.size()>0 && allLists.get(0)!=null && allLists.get(0).size()==a.size()){
            return allLists;
          }




           ArrayList<ArrayList<Integer>> allListsTemp = new ArrayList<ArrayList<Integer>>();
          for(int i = 0;i<allLists.size();i++){
                for(int j=0;j<a.size();j++){
                      if(allLists.get(i).contains(a.get(j))){

                      }else{
                          ArrayList temp = new ArrayList();
                          for(int p=0;p<allLists.get(i).size();p++){
                            temp.add(allLists.get(i).get(p));
                          }
                          temp.add(a.get(j));
                          allListsTemp.add(temp);
                        }
                  }
          }
            return allPerm(allListsTemp,a);
        }

    
    
    
}
