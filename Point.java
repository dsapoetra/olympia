package com.company;

/**
 * Created by dimassaputra on 4/11/16.
 */
public class Point {
    private int[] p; // abscissa and ordinate

    // Constructor
    // Set titik mula-mula ke (0, 0)
    public Point(){
        p = new int[2];
        p[0] =0;
        p[1]=0;
    }

    // Getter
    public int getAbsis(){
        return p[0];
    }
    public int getOrdinat(){
        return p[1];
    }

    // Setter
    public void setAbsis(int x){
        p[0]=x;
    }
    public void setOrdinat(int y){
        p[1]=y;
    }

    // Predikat
    // Menghasilkan 1 jika titik (x, y) berada di (0, 0) dan 0 apabila sebaliknya
    public int isOrigin(){
        int result;
        if (p[0]==0 && p[1]==0){
            result = 1;
        }
        else {
            result =0;
        }
        return result;
    }

    // Operator Relasional
    // Menghasilkan 1 jika titik pada argumen sama dengan dirinya
    public int isEqual(Point p){
        int result;
        if (this.p[0]==p.p[0] && this.p[1]==p.p[1]){
            result = 1;
        }
        else {
            result =0;
        }
        return result;
    }

    // Operator aritmetika
    // Menghasilkan sebuah Point yang memiliki atribut hasil penjumlahan dari atribut argumen kedua titik
    public Point add(Point p1, Point p2){
        Point p = new Point();
        p.setAbsis(p1.p[0] + p2.p[0]);
        p.setOrdinat(p1.p[1] + p2.p[1]);
        return p;
    }

    // Menghasilkan sebuah Point yang mentraslasikan point sekarang sebesar Point argumen
    public Point add(Point o){
        Point p = new Point();
        p.setAbsis(this.p[0] + o.p[0]);
        p.setOrdinat(this.p[1] + o.p[1]);
        return p;
    } // menghasilkan current objek+P

    // Menghasilkan sebuah Point dengan translasi (x, y)
    public Point add(int x, int y){
        Point p = new Point();
        p.setAbsis(this.p[0] + x);
        p.setOrdinat(this.p[1] + y);
        return p;
    }

    // Mengubah titik dengan penambahan Point argumen
    public void addToMe(Point p){
        this.setAbsis(this.p[0] + p.p[0]);
        this.setOrdinat(this.p[1] + p.p[1]);
    }

    // Mentranslasikan titik sebesar (x, y)
    public void addToMe(int x, int y){
        this.setAbsis(this.p[0] + x);
        this.setOrdinat(this.p[1] + y);
    }

    // Mengubah titik yang merupakan hasil mirror dengan garis y = x
    public void mirror(){
        int temp;
        temp = p[0];
        p[0] = p[1];
        p[1] = temp;
    }

    // Fungsi lain
    // Menghasilkan nomor kuadran dari titik sekarang
    // Sebuah titik yang berada pada sumbu x atau y tidak akan dicoba
    public int kuadran(){
        int result=0;

        if(p[0] > 0 && p[1] >0){
            result = 1;
        }
        else if(p[0] < 0 && p[1] >0){
            result = 2;
        }
        else if(p[0] < 0 && p[1] <0){
            result = 3;
        }
        else if(p[0] > 0 && p[1] <0){
            result = 4;
        }

        return result;

    }

    // Menghasilkan sebuah titik yang merupakan hasil mirror dengan garis y = x
    public Point mirrorOfMe(){
        int temp;
        temp = this.p[0];
        this.p[0] = this.p[1];
        this.p[1] = temp;
        return this;
    }

    public void print(){

    }
}