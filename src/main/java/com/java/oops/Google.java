package com.java.oops;

public class Google {
    protected static final String company = "Alphabet";

    public void search(){
        System.out.println("Searched in google");
    }

    public void search(String key){ //over loading
        System.out.println("Searched in google with keyword:"+key);
    }

    public void search(int key){ //over loading
        System.out.println("Searched in google with keyword:"+key);
    }

}
