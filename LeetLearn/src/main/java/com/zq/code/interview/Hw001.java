package com.zq.code.interview;

import java.util.Scanner;

/**
 * @Description:
 * @author: zq
 * @date: 2021.08.15
 */
public class Hw001 {

    public static int calNum(int a){
        if(a <= 1){
            return 0;
        }
        if(a == 2){
            return 1;
        }
        return a/3+calNum(a%3+a/3);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if(a == 0){
                break;
            }
            System.out.println(calNum(a));
        }
    }
}
