package com.example.demo.repository;

import java.util.Map;

public class DataRepository {
    static Map<String,String>data;
    public static Map<String,String>buildData(){
        data=Map.of(
            "key1","value1",
            "key2","value2"
        );
        return data;
    }
}