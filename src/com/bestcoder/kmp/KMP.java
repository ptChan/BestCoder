package com.bestcoder.kmp;

/**
 * Created by chentao on 16-7-29.
 */
public class KMP {

//    private int[] getNext(String pattern) {
//        int j = 0;
//        int k = -1;
//        int len = pattern.length();
//        int[] next = new int[len];
//        next[0] = -1;
//
//        while (j < len - 1) {
//            if (k == -1 || pattern.charAt(k) == pattern.charAt(j)) {
//
//                j++;
//                k++;
//                next[j] = k;
//            } else {
//
//                // 比较到第K个字符，说明p[0——k-1]字符串和p[j-k——j-1]字符串相等，而next[k]表示
//                // p[0——k-1]的前缀和后缀的最长共有长度，所接下来可以直接比较p[next[k]]和p[j]
//                k = next[k];
//            }
//        }
//        return next;
//    }
//
//    private int kmp(String s, String pattern) {
//        int i = 0;
//        int j = 0;
//        int slen = s.length();
//        int plen = pattern.length();
//
//        int[] next = getNext(pattern);
//        /*int l = 0;
//        System.out.print("next数组：[" );
//        for (int k : next) {
//            l++;
//            System.out.print(k);
//            if (l!=next.length)
//                System.out.print(",");
//        }
//        System.out.println("]");*/
//        while (i < slen && j < plen) {
//
//            if (s.charAt(i) == pattern.charAt(j)) {
//                i++;
//                j++;
//            } else {
//                if (next[j] == -1) {
//                    i++;
//                    j = 0;
//                } else {
//                    j = next[j];
//                }
//
//            }
//
//            if (j == plen) {
//                return i - j;
//            }
//        }
//        return -1;
//    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        KMP kmp = new KMP();
        String str = "bbc abcdab abcdabddabcdabd";
        String pattern = "abcdabd";
//        System.out.println(kmp.kmp(str, pattern));
    }

}
