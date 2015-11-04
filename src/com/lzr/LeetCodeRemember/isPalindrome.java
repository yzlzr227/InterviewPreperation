package com.lzr.LeetCodeRemember;

public class isPalindrome {
	
	public boolean isPalindrom(String s) {
        if (s == null)  return false;
        if (s.length() <= 1)    return true;
        
        int l = 0, r = s.length() - 1;
        s = s.toLowerCase();
        while (l < r && l >= 0 && r < s.length()){
            while (!Character.isAlphabetic(s.charAt(l))){
                l++;
                continue;
            }
            while (!Character.isAlphabetic(s.charAt(r))){
                r--;
                continue;
            }
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
}
