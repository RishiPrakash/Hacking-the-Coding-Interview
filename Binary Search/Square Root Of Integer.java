public class Solution {
	public int sqrt(int a) {
  double low = 0;
  double high = a;
  while(high>0){



  double  mid = low+ (high-low)/2;
  double tempDouble = a/mid;

  //System.out.println("mid=="+mid+"low=="+low+"===high=="+high+"mid*mid=="+(mid*mid)+"tempDouble=="+tempDouble);
    if((int)mid==(int)tempDouble){
      return (int)mid;
    }else if(mid > tempDouble){
      high = mid -1.00;
    }else{
      low = mid+1.00;
    }

  }
  return 0;
}
}
