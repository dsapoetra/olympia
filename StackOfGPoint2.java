package com.company;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class StackOfGPoint2 {
    private final int defaultStackSize = 10;
    private int size;
    private int topStack;
    private GPoint<Float>[] data;
    private static int nStack = 0;

    public StackOfGPoint2() {
        size = defaultStackSize;
        data = new GPoint[size];
        topStack =0;
        nStack++;
    }
    public StackOfGPoint2(int size) {
        this.size=size;
        data = new GPoint[size];
        topStack =0;
        nStack++;
    }
    public void Push(GPoint<Float> p) {
        if (IsFull() ==0){
            data[topStack] = p;
            topStack++;
        }
        else {

        }
    }
    public GPoint<Float> Pop() {
       // if (IsEmpty() == 0){
            topStack--;
            return data[topStack];
        //}
        //else {

        //}
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

