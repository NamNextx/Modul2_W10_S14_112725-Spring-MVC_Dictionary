package com.codegym.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    public static Map<String,String> dictionary;
    static {
        dictionary=new HashMap<>();
        dictionary.put("hello","Xin Chao");
        dictionary.put("fuck","...");
    }
    public String findData(String key){
        return dictionary.get(key);
    }
}

