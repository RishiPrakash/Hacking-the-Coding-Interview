class Solution {
    public int[] searchRange(int[] nums, int target) {
        /**
        nums -> is a non-decreasing array -> sorted->binarySearch?? can we?
        we will see!!
        
        what is the easiest solution?
        we can traverse over the array-> as we encounter first index where the
        element is present, mark it then we encounter last index we again mark it->
        
        Linear ->O(n)
        
        but we can definitely  do better!!
        
        As we had the intution that we can use binarySearch :) the question is 
        HOW?
        what happens in a usual binary search
        we try to find the occurance =>
        and as soon as we find it we come of search function
        
        in this case->we need to find the most left occurance and most right occurance of element so we will modify the search fucntion-->
        
        each time we find any occurance, we update the variables->(left_most,right_most)
        
        */
        
        /**Boundries**/
        int start = 0;
        int end = nums.length-1;
        int left_most = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                left_most = mid;
                end = mid -1;
            }else{
                if(nums[mid]<target){
                    start = mid +1 ;
                }else{
                    end = mid -1;
                }
            }
        }
        start = 0;
        end = nums.length-1;
        int right_most = -1;
        while(start<=end){
             int mid = start + (end-start)/2;
            if(nums[mid]==target){
                right_most = mid;
                start = mid +1;
            }else{
                if(nums[mid]<target){
                    start = mid +1 ;
                }else{
                    end = mid -1;
                }
            }
        }
       int[] ans = {left_most, right_most};
        return ans;
       
    }
}
