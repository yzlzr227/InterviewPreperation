package com.lzr.LeetCodeRemember;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)   return "";
        if (strs.length == 1)   return strs[0];
        int len = 0;
        StringBuffer sb = new StringBuffer();
        while (len < strs[0].length()){
            char cur = strs[0].charAt(len);
            for (int i = 1; i < strs.length;i++){
                if (strs[i].length() == len)    return strs[i];
                if (strs[i].charAt(len) != cur)
                    return sb.toString();
            }
            len++;
            sb.append(cur);
        }
        
        return sb.toString();
    }
}
