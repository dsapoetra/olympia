package com.company.stackofpoint;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class StackOfPoint {
     private final int defaultStackSize;  // inisialisasi saat penciptaan object
     private int topStack; // posisi yang siap diisi
     private int size;
     private Point[] data;
     private static int n_stack; //banyaknya stack yang pernah diciptakan, incr di ctor dan cctor
  public StackOfPoint(){
      defaultStackSize = 10;
      size = defaultStackSize;
      topStack =0;
      data = new Point[size];
      n_stack++;
   }
    // ctor dengan parameter
    public StackOfPoint(int size){
        defaultStackSize = 10;
        this.size = size;
        topStack =0;
        data = new Point[this.size];
        n_stack++;

    }
    // cctor
    //public StackOfPoint (StackOfPoint s){

    //}
// dtor
  //  ~StackOfPoint(){

 //}
// operator=
   // Stack& operator= (const Stack& s)
    // Push
    public void Push (Point p){
        data[topStack] = p;
        topStack++;
    }
    // Pop
    public Point Pop (){
        topStack--;
        return data[topStack];
    }
    // IsEmpty: return 1 jika stack kosong, 0 jika false
    public int IsEmpty(){
        if (topStack == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    // IsFull: return 1 jika stack penuh, 0 jika false
    public int IsFull(){
        if (topStack == size){
            return 1;
        }
        else {
            return 0;
        }
    }
// operator overloading: (1) operator>> untuk pop dan (2) operator<< untuk push
    //friend void operator<< (StackOfPoint&, Point)
    //friend void operator>> (StackOfPoint&, Point&)
    // fungsi mengakses data member statik
    public static int NumStackObj (){
        return n_stack;
    }
// atribut Stack Of Point

    public static void main(String[] Args){
        StackOfPoint S = new StackOfPoint(10);
        Point P = new Point(1,2);
        S.Push(P);
    }

}
