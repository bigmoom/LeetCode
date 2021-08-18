//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 哈希表 字符串 排序 👍 414 👎 0


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //public boolean isAnagram(String s, String t) {
    //
    //    HashMap<Character, Integer> letterCount = new HashMap<>();
    //
    //    for (char c : s.toCharArray()) {
    //        if (letterCount.containsKey(c)) {
    //            letterCount.put(c, letterCount.get(c) + 1);
    //        }else {
    //            letterCount.put(c, 1);
    //        }
    //    }
    //
    //    for (char c : t.toCharArray()) {
    //        if(letterCount.containsKey(c)){
    //            letterCount.put(c, letterCount.get(c) - 1);
    //        }else {
    //            return false;
    //        }
    //    }
    //
    //    for (Map.Entry entry : letterCount.entrySet()) {
    //        if ((int)entry.getValue() > 0) {
    //            return false;
    //        }
    //    }
    //    return true;
    //
    //}

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
//leetcode submit region end(Prohibit modification and deletion)
