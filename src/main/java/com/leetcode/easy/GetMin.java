
package com.leetcode.easy;

import java.util.Arrays;


public class GetMin {
    public static void main(String[] args) {
        int[] u = {3,6,9,12};
        int len = u.length;
        StringBuffer a = new StringBuffer();
        String[] f = new String[len];
        for (int i = 0; i < len; i++) {
            f[i] = String.valueOf(u[i]);
        }
        Arrays.sort(f);
        for (int i = 0; i < len; i++) {
            a.append(f[i]);
        }
        System.out.println(a);
    }
}