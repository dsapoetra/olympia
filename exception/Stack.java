package com.company.exception;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class Stack {
    protected int[] data;
    protected int topStack, size;
    protected final static int DEFAULT_STACK_SIZE = 500;
    private static int nStack=0;
    public Stack(){
        size = DEFAULT_STACK_SIZE;
        data = new int[size];
        topStack =0;
        nStack++;
    }
    public Stack(int n){
        size = n;
        data = new int[size];
        topStack =0;
        nStack++;
    }
    //public Stack(final Stack s){

    //}
    public void push(Object elem) throws StackException{
        if (isFull()==1){
            throw new StackException("stack penuh");
        }
        else{
            assert(elem.getClass()==Integer.class);
            data[topStack] = (Integer) elem;
            topStack++;
        }
    }
    public int pop() throws StackException{
        if (isEmpty()==1){
            throw new StackException("stack kosong");
        }
        else{
            topStack--;
            return data[topStack];
        }
    }
    public int isEmpty(){
        if (topStack == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int isFull(){
        if (topStack == size){
            return 1;
        }
        else {
            return 0;
        }
    }
    public void destroy(){
        System.gc();
        nStack--;
    }
    public static int numStackObj(){
        return nStack;
    }
}
