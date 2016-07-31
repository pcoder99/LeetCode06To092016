Problem Statement
  Given two sorted array nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall runtime 
  complexity should be O(log(m+n)).

Binary Search Solution, Time Complexity O(log(min(m+n)))

Assumption: 
  half of the two arrays, A, B
  find i within A, j = (m + n + 1)/2
  A[i - 1] < B[j]
  B[j - 1] < A[i]
  
  i is our target

public class Solution {
    
    private double help(int[] A, int m, int[] B, int n){
        if(m > n){
			return help(B, n, A, m);
		}
		
		if(n == 0){
			throw new IllegalArgumentException("At least one array could not be an empty.");
		}
		
		int imin = 0, imax = m, half_len = (m + n + 1) /2;
		int max_of_left = 0, min_of_right = 0;
		double median = 0;
		while(imin <= imax){
			int i = (imin + imax) / 2;
			int j = half_len - i;
			if(i > 0 && j < n && A[i - 1] > B[j]){
				imax = i - 1;	
			}else if(j > 0 && i < m && A[i] < B[j - 1]){
				imin = i + 1;
			}else{
				// i is the perfect
				if(i == 0){
					max_of_left = B[j - 1];
				}else if(j == 0){
					max_of_left = A[i - 1];
				}else{
					max_of_left = Math.max(A[i - 1], B[j - 1]);
				}
				
				if((m + n ) %2 == 1){
					median = max_of_left;
				}else{
				if(i == m){
					min_of_right = B[j];
				}else if(j == n){
					min_of_right = A[i];
				}else{
					min_of_right = Math.min(A[i], B[j]);
				}
				median = (max_of_left + min_of_right) / 2.0;
				}
				break;
			}
		}
		return median;
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return help(nums1, nums1.length, nums2, nums2.length);
    }
    
}

Reference
https://discuss.leetcode.com/topic/4996/share-my-o-log-min-m-n-solution-with-explanation
