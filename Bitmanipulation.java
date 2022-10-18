package Bitmanipulation;

import java.util.Scanner;

public class Bitmanipulation {

    public static Scanner sc = new Scanner(System.in);

    Bitmanipulation(){
    }

    public static int getbit(int n,int pos){
        int bitmask = 1<<pos;  // << shifts the postion of bits to left
        return (bitmask & n); // return if both are 1 as 1 rest all 0

    }

    public static int setbit(int n,int pos){
        int bitmask = 1<<pos;
        return (bitmask | n);

    }

    public static int clearbit(int n,int pos){
        int bitmask = 1 << pos;
        int mask = ~bitmask;
        return (mask & n);

    }

    public static int updatebit(int n,int pos){
        System.out.println("press 1: to convert 1 to 0");
        System.out.println("press 0: to convert o to 1");
        int opt = sc.nextInt();
        switch(opt){
            case 1: int bitmask = 1<<pos;
                    int mask = ~bitmask;
                    return (mask & n);

            case 2: bitmask = 1<<pos;
                    return (bitmask | n);
        }
        return 0;
    }
}