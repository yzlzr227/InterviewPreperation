package com.lzr.LeetCodeRemember;

public class CountAndSay {
	public static String countAndSay(int n) {
        String str = "1";
        if (n == 1) return str;
        
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < n; i++){
            sb.setLength(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++){
                if (str.charAt(j) != str.charAt(j - 1)){
                    sb.append(count);
                    sb.append(str.charAt(j - 1));
                    count = 1;
                }else{
                    count++;
                }
            }
            sb.append(count);
            sb.append(str.charAt(str.length() - 1));
            str = sb.toString();
        }
        return sb.toString();
    }
}
