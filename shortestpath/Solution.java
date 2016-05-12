package com.company.shortestpath;

/**
 * Created by dimassaputra on 4/12/16.
 */
public class Solution {
    public Point solve(Point p, Point[] cities){
        Point solusi = new Point();
        double[] listofdistance = new double[5];
        double result;
        for (int i =0;i<5;i++){
            int x2;
            int y2;

            x2 = (p.GetAbsis() - cities[i].GetAbsis())*(p.GetAbsis()-cities[i].GetAbsis());
            y2 = (p.GetOrdinat() - cities[i].GetOrdinat())*(p.GetOrdinat() - cities[i].GetOrdinat());
            result = Math.sqrt(x2+y2);
            listofdistance[i]=result;
        }

        double minimum = listofdistance[0];

        for(int i =0; i<5;i++){
            if (listofdistance[i]<minimum){
                minimum = listofdistance[i];
            }
        }

        if (minimum == listofdistance[0]){
            //System.out.println(P2.GetAbsis()+" "+P2.GetOrdinat());
            solusi = cities[0];
        }
        else if (minimum == listofdistance[1]){
            //System.out.println(P3.GetAbsis()+" "+P3.GetOrdinat());
            solusi = cities[1];
        }
        else if (minimum == listofdistance[2]){
            //System.out.println(P4.GetAbsis()+" "+P4.GetOrdinat());
            solusi = cities[2];
        }
        else if (minimum == listofdistance[3]){
            //System.out.println(P5.GetAbsis()+" "+P5.GetOrdinat());
            solusi = cities[3];
        }
        else if (minimum == listofdistance[4]){
            //System.out.println(P6.GetAbsis()+" "+P6.GetOrdinat());
            solusi = cities[4];
        }
    return solusi;
    }
}
