package com.leetcode.easy;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        int maxLen = 0;
        for (int i = 0; i < chars.length; i++) {
            int lenLeft = getLen1(chars,i);
            int lemRight = getLen2(chars,i);
            int len = Math.max(lenLeft,lemRight);
            if(len>maxLen){
                maxLen = len;
                if(len == lenLeft){
                    start = i-(len/2);
                    end = i + (len/2);
                }else {
                    start = i - (len/2 - 1);
                    end = i+(len/2);
                }

            }
        }
        return s.substring(start,end+1);
    }

    /**
     * 以字母为中心
     * @param chars
     * @param mid
     * @return
     */
    public int getLen1(char[] chars,int mid){
        int left = mid;
        int right = mid;
        while (left >= 0 && right<chars.length && chars[left] == chars[right]){
            left--;
            right++;
        }
        left++;
        right--;
        return right-left+1;
    }

    /**
     * 以字母间为对称点
     * @param chars
     * @param mid
     * @return
     */
    public int getLen2(char[] chars,int mid){
        int left = mid;
        int right = mid+1;
        while (left >= 0 && right<chars.length && chars[left] == chars[right]){
            left--;
            right++;
        }
        left++;
        right--;
        return right-left+1;
    }
}
