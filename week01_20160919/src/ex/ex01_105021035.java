package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 1050210XX 王文宏
 */

import  java.util.Scanner;
public class ex01_1050210XX;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner   fac=new Scanner(System.in);
        int  F=fac.nextInt();
        int  C=(F-32)*5/9;
        System.out.print(C);
      
	} 		
        