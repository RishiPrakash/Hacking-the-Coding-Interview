/*
*
* Given a sorted array of positive integers,
* rearrange the array alternately i.e first element should be the maximum value,
* second minimum value, third-second max, fourth-second min and so on.
*
* */
public class ReOrderArray {
    public static void main(String[] args) {
        int[] A = {7,6,5,4,3,2,1};
        new ReOrderArray().reorder(A);

        int[] A_1 = {7,6,5,4,3,2};
       // new ReOrderArray().reorder(A_1);
    }
    private void reorder(int[] A){
        int mid = getMid(A);
        int enhancer = getEnhancer(A);
        printMe(A);
        enrichForLeft(A, mid, enhancer);
        printMe(A);
        enrichForRight(A, mid, enhancer);
        printMe(A);
        processPostEnrichment(A, enhancer);
        printMe(A);
    }
    private void printMe(int[] A){
        for(int i : A){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    private void enrichForLeft(int[] A, int mid, int enhancer){
        int start = 0;
        int end = mid-1;
        int enrichmentIndex = 1;
        while(start<=end){
            A[enrichmentIndex]+=(A[start]%enhancer)*enhancer;
            start++;
            enrichmentIndex+=2;
        }
    }
    private int getEnhancer(int[] A){
        int max = A[0];
        for(int i : A){
            max = Math.max(max, i);
        }
        return max+1;
    }
    private void enrichForRight(int[] A, int mid, int enhancer){
        int start = A.length-1;
        int end = mid;
        int enrichmentIndex = 0;
        while(start>=mid && enrichmentIndex<A.length){
            A[enrichmentIndex]+=(A[start]%enhancer)*enhancer;
            start--;
            enrichmentIndex+=2;
        }
    }
    private void processPostEnrichment(int[] A, int enhancer){
        for(int i=0;i<A.length;i++){
            A[i]/=enhancer;
        }
    }
    private int getMid(int[] A){
        return (A.length/2);
    }
}


