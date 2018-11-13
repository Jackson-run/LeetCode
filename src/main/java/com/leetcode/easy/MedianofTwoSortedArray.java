package com.leetcode.easy;

public class MedianofTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res =merge(nums1,nums2);
        if(res.length%2==0){
            return (double)(res[(res.length)/2-1]+res[(res.length)/2])/2;
        }
        else {
            return (double)res[(res.length)/2];
        }
    }
    public int[] merge(int[] n1,int[] n2){
        int[] res = new int[n1.length+n2.length];
        int i=0,j=0;
        int r = 0;
        while (i< n1.length||j<n2.length){
            if(i<n1.length&&j<n2.length&&n1[i]<=n2[j]){
                res[r] = n1[i];
                r++;
                i++;
            }
            else if(i<n1.length&&j<n2.length&&n1[i]>n2[j]){
                res[r] = n2[j];
                r++;
                j++;
            }
            else if(i<n1.length){
                res[r]=n1[i];
                r++;
                i++;
            }
            else {
                res[r] = n2[j];
                r++;
                j++;
            }

        }
        return res;
    }

}
