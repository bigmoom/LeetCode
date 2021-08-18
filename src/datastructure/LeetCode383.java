package datastructure;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
 * 判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 *
 * 题目说明：
 * 为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。
 * 杂志字符串中的每个字符只能在赎金信字符串中使用一次。
 * @author cwh
 * @date 2021/8/18 9:44
 */
public class LeetCode383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        //存放magazine中字母出现次数
        int[] letters = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            int index = letter - 'a';
            letters[index]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            int index = letter - 'a';
            if (letters[index] > 0) {
                letters[index]--;
            }else {
                return false;
            }
        }
        return true;

    }
}
