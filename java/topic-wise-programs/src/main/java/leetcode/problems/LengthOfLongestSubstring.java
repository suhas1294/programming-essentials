package leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
        /*String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        String s5 = "au";*/
        String s6 = "aab";
        /*System.out.println("s1\t"+substring.lengthOfLongestSubstring(s1));
        System.out.println("s2\t"+substring.lengthOfLongestSubstring(s2));
        System.out.println("s3\t"+substring.lengthOfLongestSubstring(s3));
        System.out.println("s4\t"+substring.lengthOfLongestSubstring(s4));
        System.out.println("s5\t"+substring.lengthOfLongestSubstring(s5));*/
        System.out.println("s6\t"+substring.lengthOfLongestSubstring(s6));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.equalsIgnoreCase("")){
            return 0;
        }
        String[] chars = s.split("");
        String result = "";
        Set<String> set = new HashSet<>(Arrays.asList(chars));
        if (set.size() == 1){
            return 1;
        }
        for (int i = 0; i < chars.length-1; i++) {
            if (String.valueOf(chars[i]).equalsIgnoreCase(String.valueOf(chars[i+1]))){
                continue;
            }else {
                for (int j = i; j < chars.length-1; j++) {
                    String temp = s.substring(j);
                    if ((temp.lastIndexOf(chars[j]) != -1) && (temp.indexOf(chars[j]) != temp.lastIndexOf(chars[j]))){
                        String tempArray[] = temp.split("");
                        for (int k = 0; k < temp.lastIndexOf(chars[j]); k++) {
                            result = result + tempArray[k];
                        }
                        return result.length();
                    }else {
                        result = "";
                        break;
                    }
                }
                System.out.println(result);
            }
        }
        if (result.equalsIgnoreCase("")){
            return s.length();
        }else {
            return  result.length();
        }
    }
}
