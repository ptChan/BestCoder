package com.bestcoder.everydayAlgorithm;

/**
 * Created by chentao on 16-8-1.
 * 题目：请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”。
 */
public class _4替换空格_字符串 {
    public static void main(String args[]) {
        String s = "We are happy.";
        char c_old[] = s.toCharArray();
        // 为简单起见，我们假设给它一个新的空间，空间的大小足以存下替换后的字符
        char c_new[] = new char[100];
        for (int i = 0; i < c_old.length; i++) {
            c_new[i] = c_old[i];
        }

        // 输出新的数组
        System.out.println(replaceBlank(c_new, c_old.length));
    }

    /**
     * 计算新的字符串
     * @param c 带空格的字符数组
     * @param length 是指第一个字符到最后一个字符的长度，不是字符数组的长度
     * @return
     */
    public static String replaceBlank(char c[], int length) {
        // 查找空格的数目
        int blank = 0;
        for (int i = 0; i < length; i++) {
            if (c[i] == ' ') {
                blank++;
            }
        }

        // 重新计算新的数组的大小
        int length_new = length + blank * 2;

        // 从尾到头查找
        int j = length - 1;
        int k = length_new - 1;
        while (j >= 0 && k >= 0) {
            if (c[j] != ' ') {
                c[k--] = c[j];
            } else {
                c[k--] = '0';
                c[k--] = '2';
                c[k--] = '%';
            }
            j--;
        }
        return new String(c);
    }
}
