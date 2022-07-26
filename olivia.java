package com.company;
public class Olivia {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num");
        int num1=sc.nextInt();
        System.out.println("enter second num");
        int num2=sc.nextInt();
        System.out.println("enter third num");
        int num3= sc.nextInt();
        sc.close();
        sum(num1,num2,num3);}
    static int sum(int firstNum, int secondNum){
        return firstNum+secondNum;}
    static int sum(int firstNum, int secondNum,int thirdNum){
        return firstNum+secondNum+thirdNum;}
    static double sum(double firstNum, double secondNum){
        return firstNum+secondNum;}
}