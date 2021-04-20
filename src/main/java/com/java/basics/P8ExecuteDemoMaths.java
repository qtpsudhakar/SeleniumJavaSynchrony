package com.java.basics;

public class P8ExecuteDemoMaths {
    public static void main(String[] args) {
        System.out.println(P7DemoMaths.findOdd(11));
        P7DemoMaths dm= new P7DemoMaths();
        System.out.println(dm.findFactorial(5));
        System.out.println(new P7DemoMaths().findFactorial(4));

        P9CreateTool t1 = new P9CreateTool();
        t1.toolName ="selenium";
        t1.version=4;
        String[] languages = {"java","c#","ruby","python"};
        t1.languages= languages;

        t1.start();
        t1.stop();

        P9CreateTool.run();
    }
}
