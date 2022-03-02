package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        byte byteVar1 = 1;
        short shortVar1 = 2;
        int intVar1 = 3;
        long longVar1 = 4L;
        float floatVar1 = 5.5f;
        double doubleVar1 = 6.6;
        char charVar1 = 'R';
        boolean booleanVar1 = true;

        float tomS = 78.2f;
        float joeR = 82.7f;
        System.out.println(tomS+joeR);
        System.out.println(joeR-tomS);

        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int totalWeight = (banana*5+milk*2+iceCream*2+egg*4);
        double totalWeightKG = totalWeight/(float)1000;
        System.out.println(totalWeightKG);
    }
}
