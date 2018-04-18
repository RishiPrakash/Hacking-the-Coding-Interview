public class Solution {
	public ArrayList<ArrayList<String>> solveNQueens(int n) {
	    
	     ArrayList<ArrayList<String>> result =new ArrayList<ArrayList<String>>();
          position[] positions = new position[n];
          possiblePositions(0, positions, result, n);
            return result;
	}
	
	  class position{
    int row;
    int column;
    position(int row,int column){
      this.row = row;
      this.column = column;
    }
  }

  
  void possiblePositions(int column,position[] positions,ArrayList<ArrayList<String>> result,int n){


    if(column==n){
      StringBuffer buff = new StringBuffer();
     ArrayList<String> oneResult = new ArrayList<>();
     for (position p : positions) {
         for (int i = 0; i < n; i++) {
             if (p.row == i) {
                 buff.append("Q");
             } else {
                 buff.append(".");
             }
         }
         oneResult.add(buff.toString());
         buff = new StringBuffer();

     }
     result.add(oneResult);
      return;
    }
    for(int row=0;row<n;row++){
      boolean possible = true;

      for(int i=0;i<column;i++){
        if(positions[i].row == row || (positions[i].row+positions[i].column == row+column) ||
        (positions[i].row-positions[i].column == row-column)){
          possible=false;
          break;
        }
      }

      if(possible){
        positions[column] = new position(row,column);
        possiblePositions(column+1,positions,result,n);
      }
    }
}
	
}
