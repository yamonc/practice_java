package com.yamon.triangle;

import java.util.Scanner;

/**
 * @Created by Intellij IDEA.
 * @author: 陈亚萌
 * @Date: 2019/11/28
 */
public class Triangle {
    /*
    *
    * 打印各种三角形图案
     *
     **
     ***
     ****
     *****

          *
         **
        ***
       ****
      *****

     *
     ***
     *****
     *******
     *********
    * */

    /**
     * 打印三角形
     * @param args
     */
    public static void main(String[] args) {
        //格式化输入
        Scanner in =new Scanner(System.in);
        int row = in.nextInt();

        //第一种图形

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //第二种图形
        /*
          *
         **
        ***
       ****
      *****
     */
        System.out.println("-----------------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <row ; j++) {
                if (j<row-i-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        /*
        *
        *                *
                        ***
                       *****
                      *******
                     *********
        *
        *
        *
        * */
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2*row; j++) {
                if (j<row-1){
                    System.out.print(" ");
                }else if (j==row-1){
                    System.out.print("*");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }

    }
}
