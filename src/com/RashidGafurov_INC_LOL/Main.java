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
        float maxDays = weighToLose*1000/(float)minGrammsADay;
        float minDays = weighToLose*1000/(float)maxGrammsADay;
        System.out.println("Max days to lose weight " + maxDays + " days");
        System.out.println("Min days to lose weight " + minDays + " days");

        //exercise 5
       float mashaSalary = 67760f;
       float denisSalary = 83690f;
       float christinaSalary = 76230f;

       float indexSalary = 1.1f;

       float newMashaSalary = mashaSalary * 1.1f;
       float newDenisSalary = denisSalary * 1.1f;
       float newChristinaSalary = christinaSalary * 1.1f;

       float annualDiffMasha = mashaSalary*(indexSalary-1)*12;
       float annualDiffDenis = denisSalary*(indexSalary-1)*12;
       float annualDiffChristina = christinaSalary*(indexSalary-1)*12;

        System.out.println("Masha's new monthly salary is " + newMashaSalary + " rubles. Annual income increased by " + annualDiffMasha + "rubbles");
        System.out.println("Denis's new monthly salary is " + newDenisSalary + " rubles. Annual income increased by " + annualDiffDenis + "rubbles");
        System.out.println("Christina's new monthly salary is " + newChristinaSalary + " rubles. Annual income increased by " + annualDiffChristina + "rubbles");
    }
}
