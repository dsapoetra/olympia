package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  Point p1 = new Point();
        Point p2 = new Point();
        if (p1.isEqual(p2) == 1){
            System.out.println("p1 dan p2 sama");
        }
        else {
            System.out.println("p1 dan p2 tidak sama");
        }
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");
        if (p1.isOrigin() == 1){
            System.out.println("p1 origin");
        }
        else {
            System.out.println("p1 tidak origin");
        }
        p1.setAbsis(3);
        p1.setOrdinat(5);
        p2.setAbsis(5);
        p2.setOrdinat(3);
        p1 = p1.add(p1,p2);
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");
        p1 = p1.add(p2);
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");
        p1 = p1.add(1,1);
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");
        p1.addToMe(p2);
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");
        p1.mirror();
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");
        System.out.println("p1 kuadran = ("+p1.kuadran()+")");
        p1 = p1.mirrorOfMe();
        System.out.println("p1 = ("+p1.getAbsis()+","+p1.getOrdinat()+")");*/
        GPoint<Integer> g = new GPoint<Integer>(2,3);
        StackOfGPoint1 s = new StackOfGPoint1();
        System.out.println(s.NumStackObj());
        s.Push(g);
    }
}
