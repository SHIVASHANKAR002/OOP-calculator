package com.packages;

import java.util.*;



class add {
    public void addd(int a, int b){
    int c;
    c=a+b;
    System.out.println(c);
    }
}

class sub {
    public void subt(int a, int b){
        int c;
        c=a-b;
        System.out.println(c);
    }
}

class mul{

    public void mult(int a, int b){
        int c;
        c=a*b;
        System.out.println(c);
    }

}

class div{
    public void divi(int a, int b){
        int c;
        c=a/b;
        System.out.println(c);
    }
}

public class Main  {
    public static void main(String[] args) {
        int x,y;
        String z;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter num1");
        x = a.nextInt();
        System.out.println("Enter num2");
        y = a.nextInt();
        System.out.println("Enter operator");
        z = a.next();

        if (Objects.equals(z, "+")){
            add ob1 = new add();
            ob1.addd(x,y);
        }
        else if (Objects.equals(z, "-")){
            sub ob2 = new sub();
            ob2.subt(x,y);
        }
        else if (Objects.equals(z, "/")){
            div ob3 = new div();
            ob3.divi(x,y);
        }
        else if (Objects.equals(z, "*")){
            mul ob4 = new mul();
            ob4.mult(x,y);
        }
        else {
            System.out.println("invalid operator");
        }
    }
}
