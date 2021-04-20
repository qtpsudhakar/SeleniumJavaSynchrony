package com.java.basics;

import java.util.HashMap;
import java.util.Set;

public class P13MapSample {
    public static void main(String[] args) {

        //HashMap Class

        HashMap<String,String> tcData = new HashMap<>();
        tcData.put("username","admin");
        tcData.put("password","asdf1234");
        System.out.println(tcData.containsKey("username"));

        HashMap<String,HashMap<String,String>> AllTcData = new HashMap<>();
        AllTcData.put("tc1",tcData);

        System.out.println(tcData.get("username"));
        Set<String> setData = tcData.keySet();
        for (String k:setData){
            System.out.println(tcData.get(k));
        }

    }
}
