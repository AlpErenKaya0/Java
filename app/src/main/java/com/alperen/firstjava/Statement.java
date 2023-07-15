package com.alperen.firstjava;

public class Statement {
    public static void main(String[] args) {
        int x=5;
        x++;
        System.out.println(x);
        int y=4;
        System.out.println(x<y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<y &&y!=y);
        System.out.println(x<y || x==y);
        if(x<y) {
            System.out.println("y is bigger");
        }
        else if(x>y){
            System.out.println("x is bigger");
        }
        else {
            System.out.println("x=y");
        }

        int Day =1;
        String DayString="";
        switch(Day){
            case 1:
                DayString="monday";
                break;
            case 2:
                DayString="sunday";
                break;
        }
        System.out.println(DayString);



        }
    }

