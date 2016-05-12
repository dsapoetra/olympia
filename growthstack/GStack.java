package com.company.growthstack;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class GStack extends Stack {
    private final static int gsUnit = 10;

    public GStack(){
        super();
    }

    public GStack(int n){
        super(n);
    }
    // redefinition of Push & Pop
    public void push(int x){
        if (this.isFull() == 1){
            //super(size+gsUnit);
            grow();
            data[topStack] = x;
            topStack++;
        }
        else {
            data[topStack] = x;
            topStack++;
        }
    }
    public int pop(){
        if (this.topStack == size-gsUnit){
            //super(size+gsUnit);
            shrink();
            topStack--;
            return data[topStack];
        }
        else {
            topStack--;
            return data[topStack];
        }
    }
    private void grow(){
        int[] grown = new int[size+gsUnit];
        System.arraycopy(data,0,grown,0,size);
        size = size + gsUnit;
        data = grown;
    }
    private void shrink(){
        int[] shrinks = new int[size-gsUnit];
        System.arraycopy(data,0,shrinks,0,size-gsUnit);
        size = size - gsUnit;
        data = shrinks;
    }

   public int GetSize(){
        return size;
    }

    public int GetTop(){
        return topStack;
    }
}
