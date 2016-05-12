package com.company;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class StackOfGPoint1 {
    private final int defaultStackSize = 10;
    private int size;
    private int topStack;
    private GPoint<Integer>[] data;
    private static int nStack = 0;

    public StackOfGPoint1() {
        size = defaultStackSize;
        data = new GPoint[size];
        topStack =0;
        nStack++;
    }
    public StackOfGPoint1(int size) {
        this.size=size;
        data = new GPoint[size];
        topStack =0;
        nStack++;
    }
    public void Push(GPoint<Integer> p) {
        data[topStack] = p;
        topStack++;
    }
    public GPoint<Integer> Pop() {
        topStack--;
        return data[topStack];
    }
    public int IsEmpty() {
        if (topStack == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int IsFull() {
        if (topStack == size){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int NumStackObj() {
        return nStack;
    }
}
