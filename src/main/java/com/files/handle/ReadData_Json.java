package com.files.handle;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadData_Json {

    public static void main(String[] args) {
        String flPath ="src\\main\\resources\\Demo.json";
        try {
            FileReader fr = new FileReader(flPath);
            JSONObject jp = (JSONObject) new JSONParser().parse(fr);
            HashMap<String,JSONObject> data = (HashMap<String, JSONObject>) jp.get("TC_AddEmp_001");
            System.out.println(data.get("firstName"));
            System.out.println(data.get("lastName"));


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
