package com.bridglabz.PracticeTest;
import java.util.*;
import java.util.Scanner;
public class PracticeTest {
    public static void main(String[] args) {
        coupneCode1();
    }
public static void coupneCode1(){
//    Scanner sc=new Scanner(System.in);
//    String str=sc.next().toString();
    char[] ch="123456789 abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    int max=4556;
    int random= (int)(Math.random()*max);
    StringBuffer sb=new StringBuffer();
		while (random>0)
    {
        sb.append(ch[random % ch.length]);
        random =random/ch.length;
    }
    String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);
    }
}

