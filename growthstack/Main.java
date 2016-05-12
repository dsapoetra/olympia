package com.company.growthstack;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class Main {
    public static void main(String[] args){
        GStack g = new GStack(10);
        GStack g2 = new GStack(10);
        System.out.println(g.GetSize());
        System.out.println(g.GetTop());
        System.out.println("Start pushing");
        for (int i = 0; i<12; i++){
            g.push(10);
            System.out.println("Size now :"+g.GetSize());
            System.out.println("Top now :"+g.GetTop());
        }
        System.out.println("");
        System.out.println("Start popping");
        for (int i = 0; i<7; i++){
            g.pop();
            System.out.println("Size now :"+g.GetSize());
            System.out.println("Top now :"+g.GetTop());
        }
        g.destroy();
        System.out.println("");
        System.out.println("Start pushing");
        for (int i = 0; i<12; i++){
            g.push(10);
            System.out.println("Size now :"+g.GetSize());
            System.out.println("Top now :"+g.GetTop());
        }
        System.out.println("");
        System.out.println("Num stack :"+g.numStackObj());


    }
}
