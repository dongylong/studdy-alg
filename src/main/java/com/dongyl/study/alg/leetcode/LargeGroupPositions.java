package com.dongyl.study.alg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830. 较大分组的位置
 * <p>
 * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
 * <p>
 * 例如，在字符串 s = "abbxxxxzyy"中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * <p>
 * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。
 * 上例中的 "xxxx" 分组用区间表示为 [3,6] 。
 * <p>
 * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
 * <p>
 * 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
 * <p>
 * 示例1：
 * <p>
 * 输入：s = "abbxxxxzzy"
 * 输出：[[3,6]]
 * 解释："xxxx" 是一个起始于 3 且终止于 6 的较大分组。
 * 示例 2：
 * <p>
 * 输入：s = "abc"
 * 输出：[]
 * 解释："a","b" 和 "c" 均不是符合要求的较大分组。
 * 示例 3：
 * <p>
 * 输入：s = "abcdddeeeeaabbbcd"
 * 输出：[[3,5],[6,9],[12,14]]
 * 解释：较大分组为 "ddd", "eeee" 和 "bbb"
 * 示例 4：
 * <p>
 * 输入：s = "aba"
 * 输出：[]
 * 提示：
 * 1 <= s.length <= 1000
 * s 仅含小写英文字母
 */
public class LargeGroupPositions {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(largeGroupPositions(s).toString());
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList();
        int len = s.toCharArray().length;
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (i == len - 1
                    || s.charAt(i) != s.charAt(i + 1)) {
                if (count > 2) {
                    res.add(Arrays.asList(i - count + 1, i));
                }
                count = 1;
            } else {
                count++;
            }
        }
        return res;
    }

    public static List<List<Integer>> me(String s) {
        List<List<Integer>> resList = new ArrayList<>();
        String tmp = null;
        String ind;
        int len = s.toCharArray().length;
        int count = 1;
        for (int i = 0; i < len; i++) {
            ind = String.valueOf(s.charAt(i));
            if (ind.equals(tmp)) {
                count++;
                continue;
            }
            tmp = ind;
            if (count > 2) {
                resList.add(Arrays.asList(i - count, i - 1));
            }
            count = 1;
        }
        if (count > 2) {
            resList.add(Arrays.asList(len - count, len - 1));
        }
        return resList;
    }

}