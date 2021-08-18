package datastructure;

import java.util.HashMap;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。
 * 如果不存在，则返回 -1。
 *
 * @author cwh
 * @date 2021/8/18 9:30
 */
public class LeetCode387 {

    public int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charInMap = new HashMap<>();
        for (char aChar : chars) {
            if (charInMap.containsKey(aChar)) {
                charInMap.put(aChar, charInMap.get(aChar) + 1);
            } else {
                charInMap.put(aChar, 1);
            }
        }
        for (int j = 0; j < chars.length; j++) {
            if(charInMap.get(chars[j])==1){
                return j;
            }
        }
        return -1;
    }
}
