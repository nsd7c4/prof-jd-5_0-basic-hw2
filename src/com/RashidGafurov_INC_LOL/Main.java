package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        byte byteVar1 = 1;
        short shortVar1 = 2;
        int intVar1 = 3;
        long longVar1 = 4L;
        float floatVar1 = 5.5f;
        double doubleVar1 = 6.6;
        char charVar1 = 'R';
        boolean booleanVar1 = true;

        //exercise 2
        float tomS = 78.2f;
        float joeR = 82.7f;
        float sumFighters = tomS+joeR;
        float diffFighters = joeR - tomS;
        System.out.println("Sum of the fighters weights " +sumFighters);
        System.out.println("Diff of the fighters weights " +diffFighters);

        //exercise 3
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int totalWeight = (banana*5+milk*2+iceCream*2+egg*4);
        float totalWeightKG = totalWeight/(float)1000;
        System.out.println("Total Recipe weight " + totalWeightKG + " KG");

        //exercise 4
        int weighToLose = 7;
        int minGrammsADay = 250;
        int maxGrammsADay = 500;
        float minDays = weighToLose*1000/(float)minGrammsADay;
        float maxDays = weighToLose*1000/(float)maxGrammsADay;
        System.out.println("Min days to lose weight " + minDays + " days");
        System.out.println("Max days to lose weight " + maxDays + " days");

    }
}
