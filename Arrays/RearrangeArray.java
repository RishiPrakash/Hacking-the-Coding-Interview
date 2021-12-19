import java.util.*;
class RearrangeArray{
    public static void main(String[] args) {
    int[] n = {3, 2, 0, 1};
    new RearrangeArray().rearrangeArr(n);
    }
    public void rearrangeArr(int[] n){
        int z = getZ(n);
        enrichArr(n, z);
        getNewValues(n,z);
        printMe(n);

    }
    private void printMe(int[] n){
        for(int i:n){
            System.out.print(i+" ");
        }
    }
    private int getZ(int[] n){
        int max = n[0];
        for(int i : n){
            max = Math.max(i, max);
        }
        return max+1;
    }
    private void getNewValues(int[] n, int z){
        for(int i=0;i<n.length;i++){
            n[i]/=z;
        }
    }
    private void enrichArr(int[] n, int z){
        for(int i=0;i<n.length;i++){
            n[i]+=enrichWithValue(n,i,z);
        }
    }
    private int enrichWithValue(int[] n, int i,int z){
        return (n[n[i]]%z)*z;
    }
}
