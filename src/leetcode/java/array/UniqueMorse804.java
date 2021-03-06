package leetcode.java.array;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: zhangyu
 */
public class UniqueMorse804 {

    @Test
    public void testUniqueMorse() {
        String[] words = {"gin", "zen", "gig", "msg"};
        int length = uniqueMorseRepresentations(words);
        System.out.println("length = " + length);
    }

    /**
     * @param words 输入单词数组
     * @return 返回个数
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] tableComparisons = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                sb.append(tableComparisons[index]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
