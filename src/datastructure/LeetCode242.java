package datastructure;

/**
 * 给定两个字符串 s 和 t ，
 * 编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 * @author cwh
 * @date 2021/8/18 10:00
 */
public class LeetCode242 {

    public boolean isAnagram(String s, String t){

        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }
        for (int count : letters) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
