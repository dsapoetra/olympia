package com.company;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class StackItem {
    private Object item = 0;
    private StackItem previous;
    public StackItem() {

    }
    public Object getItem() {
        return item;
    }
    public void setItem(Object x) {

    }
    public StackItem getPrevious() {
        return this;
    }
    public void setPrevious(StackItem p) {

    }
}
