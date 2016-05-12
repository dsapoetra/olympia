package com.company.gstack;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class Stack<T> {
    private T[] data;
    private int topStack;
    private int  size;
    private final static int DEFAULT_STACK_SIZE = 500;

    public Stack(){
        size = DEFAULT_STACK_SIZE;
        data = (T[]) new Object[size];
        topStack =0;
    }

    public Stack(int n){
        size = n;
        data = (T[]) new Object[size];
        topStack =0;
    }
   // public Stack(final Stack<U> s){
    //}


   public void push(T elem) {
        data[topStack] = elem;
        topStack++;
    }
        public T pop(){
            topStack--;
            return data[topStack];
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

    public void print(){
        for (int i = 0; i<size;++i){
            System.out.println(data[i]);
        }
    }

    public static void main(String[] Args){
        Stack<Integer> S = new Stack<Integer>(10);
        for(int i = 0; i<10; ++i){
            S.push(i);
        }
        S.print();
        Stack<String> S2 = new Stack<String>(10);
        for(int i = 0; i<10; ++i){
            S2.push("hai");
        }
        S2.print();
    }
}
