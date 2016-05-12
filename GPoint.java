package com.company;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class GPoint<T> {

    private T x; //absis
    private T y; //ordinat

    public GPoint(){
       //SetAbsis(_x);

    }
    public GPoint(T newx, T newy){
        SetAbsis(newx);
        SetOrdinat(newy);
    }
  //  public GPoint(const GPoint&){

    //}
    //public GPoint& operator= (const GPoint&)
    //public ~GPoint()
    public T GetAbsis(){
        return x;
    }
    public T GetOrdinat(){
        return y;
    }
    public void SetAbsis(T newx){
        x = newx;
    }
    public void SetOrdinat(T newy){
        y = newy;
    }
    public int IsEqual(GPoint P){
        int result;
        if (x == P.GetAbsis() && y == P.GetOrdinat()){
            result = 1;
        }
        else {
            result = 0;
        }
        return result;
    }


}