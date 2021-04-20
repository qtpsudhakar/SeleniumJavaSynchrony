package com.java.oops;

public class CreateCars {
    public static void main(String[] args) {

        TataAltroz al = new TataAltroz();
        al.addAutoClose();
        al.addMoreSpace();

        TataCars car1 = new TataAltroz();

        TataCars car2 = new TataTiago();

        car2.addGPS();

        Irs car3 = (Irs) car2;
        car3.leftDrive();

    }
}
