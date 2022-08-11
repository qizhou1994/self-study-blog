package com.zq.code.interview;

import java.util.Scanner;

/**
 * @Description:
 * @author: zq
 * @date: 2021.08.15
 */
public class Hw002 {
    public static void main(String[] args){
        int[] temp = new int[1000];

        Scanner scan  = new Scanner(System.in);
        while(scan.hasNextInt()){
            int a = scan.nextInt();
            while(a-->0){
                int b = scan.nextInt();
                temp[b] = 1;
            }
            for(int i = 0 ; i < temp.length;i++){
                if(temp[i]==1)
                    System.out.println(i);
                temp[i]= 0;
            }
        }
    }
}
