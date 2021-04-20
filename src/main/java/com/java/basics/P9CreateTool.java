package com.java.basics;

public class P9CreateTool {

    public static void main(String[] args) {
        P9CreateTool t1 = new P9CreateTool();
        t1.toolName ="selenium";
        t1.version=4;
        String[] languages = {"java","c#","ruby","python"};
        t1.languages= languages;

        t1.start();
        t1.stop();
        run();

        P9CreateTool t2 = new P9CreateTool();
        t2.toolName = "uft";
        System.out.println(t2.toolType);
        System.out.println(P9CreateTool.toolType);
        t2.toolType = "Automation";
        System.out.println(t2.toolType);
        System.out.println(t1.toolType);
        System.out.println(P9CreateTool.toolType);
    }

    String toolName;
    int version;
    String[] languages;
    static String toolType = "Test Automation";

    public void start(){
        System.out.println(this.toolName+" is started");
    }

    public void stop(){
        System.out.println(this.toolName+" is stopped");
    }
    public static void run(){
        System.out.println("running");
    }
}
