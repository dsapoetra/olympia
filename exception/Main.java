package com.company.exception;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class Main {
    public static void main(String[] args){
        Stack S = new Stack(10);
        for(int i =0; i<19;i++){
            try {
                S.push(1);
            }
            catch (StackException e){
                System.out.println(e.toString());
                //e.printStackTrace();
            }
        }
        for(int i =0; i<20;i++){
            try {
                S.push(5);
            }
            catch (StackException e){
                System.out.println(e.toString());
                //e.toString();
                //e.printStackTrace();
            }
            finally {
                System.out.println("fuck");
            }
        }

        int x = 200;
        String x1 = Integer.toString(x);
        System.out.println((Math.pow(2, 31)-2));




    }
}
