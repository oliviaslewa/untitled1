package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
     int x=4;
Person p1=new Person();
        System.out.println(p1.age);
Person p2=p1;
        System.out.println(p2.age);
    }}
class Person{
    int age=4;
    public int personInfo(){
        this.age=29;
    return age;}}