package com.leetcode.easy;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(new PalindromeNum().isPalindrome(12321));

    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
