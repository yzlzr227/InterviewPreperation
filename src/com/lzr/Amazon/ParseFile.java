package com.lzr.Amazon;

/**
 * Created by yzlzr227 on 9/24/15.
 */
public class ParseFile {
    public void parseFile(String file){
        String[] arr = file.split(" ");
        for (String s : arr){
            System.out.print(s);
        }
    }
}
