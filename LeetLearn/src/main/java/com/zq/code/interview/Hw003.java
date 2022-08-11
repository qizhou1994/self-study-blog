package com.zq.code.interview;

import java.util.Scanner;

/**
 * @Description:
 * @author: zq
 * @date: 2021.08.15
 */
public class Hw003 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            String temp = s.nextLine();
            long sum = 0;
            for(int i = temp.length() -1,c = 0; i>=2;i--,c++ ){
                char tempChar = temp.charAt(i);
                int tempX = 4*c;
                 if(tempChar >='A'){
                     sum = sum+((tempChar%'A' +10)<<tempX);
                 }else {
                     sum = sum+((tempChar- '0')<<tempX);
                 }
            }
            System.out.println(sum);
        }
    }
}
