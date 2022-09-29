package org.example;

import java.util.Scanner;

public class PhLevelAnalyser{
    String mesg="";
    String value(double ph)
    {
        if (ph==14)
            mesg="For 0 it is acidic and for 14 alkaline";
        else if (ph>7 && ph<8)
            mesg="ph value for the goldfish survive";
        else if (ph==7)
            mesg="ph value is for natural water";
        else
            mesg=null;

        return mesg;
    }

    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//        PhLevelAnalyser obj=new PhLevelAnalyser();
//        System.out.println("Enter pH value of water");
//        float ph = sc.nextFloat();
//        float value= obj.value(ph);
    }
}