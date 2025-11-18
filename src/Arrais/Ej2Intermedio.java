package Arrais;

import java.util.Scanner;

public class Ej2Intermedio {
    public static void main(String[] args) {
        int[] nums=new int[20];
        int pares=0;
        for (int i=0;i<nums.length;i++){
           nums[i]=pares;
            System.out.println(nums[i]);
           pares+= 2;

        }
    }
}
