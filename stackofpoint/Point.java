package com.company.stackofpoint;

/**
 * Created by dimassaputra on 4/12/16.
 */
//package com.company;

/**
 * Created by dimassaputra on 4/11/16.
 */
public class Point {
    private int x; // abscissa and ordinate
    private int y;
    // Constructor
    // Set titik mula-mula ke (0, 0)
    public Point(){
        //p = new int[2];
        x =0;
        y=0;
    }

    public Point(int x , int y){
        //p = new int[2];
        this.x =x;
        this.y=y;
    }
    // Getter
    public int GetAbsis(){
        return x;
    }
    public int GetOrdinat(){
        return y;
    }

    // Setter
    public void setAbsis(int x){
        x=x;
    }
    public void setOrdinat(int y){
        y=y;
    }

    // Predikat
    // Menghasilkan 1 jika titik (x, y) berada di (0, 0) dan 0 apabila sebaliknya
    public int isOrigin(){
        int result;
        if (x==0 && y==0){
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
        if (this.x==p.x && this.y==p.y){
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
        p.setAbsis(p1.x + p2.x);
        p.setOrdinat(p1.y + p2.y);
        return p;
    }

    // Menghasilkan sebuah Point yang mentraslasikan point sekarang sebesar Point argumen
    public Point add(Point o){
        Point p = new Point();
        p.setAbsis(this.x + o.x);
        p.setOrdinat(this.y + o.y);
        return p;
    } // menghasilkan current objek+P

    // Menghasilkan sebuah Point dengan translasi (x, y)
    public Point add(int x, int y){
        Point p = new Point();
        p.setAbsis(this.x + x);
        p.setOrdinat(this.y + y);
        return p;
    }

    // Mengubah titik dengan penambahan Point argumen
    public void addToMe(Point p){
        this.setAbsis(this.x + p.x);
        this.setOrdinat(this.y + p.y);
    }

    // Mentranslasikan titik sebesar (x, y)
    public void addToMe(int x, int y){
        this.setAbsis(this.x + x);
        this.setOrdinat(this.y + y);
    }

    // Mengubah titik yang merupakan hasil mirror dengan garis y = x
    public void mirror(){
        int temp;
        temp = x;
        x = y;
        y = temp;
    }

    // Fungsi lain
    // Menghasilkan nomor kuadran dari titik sekarang
    // Sebuah titik yang berada pada sumbu x atau y tidak akan dicoba
    public int kuadran(){
        int result=0;

        if(x > 0 && y >0){
            result = 1;
        }
        else if(x < 0 && y >0){
            result = 2;
        }
        else if(x < 0 && y <0){
            result = 3;
        }
        else if(x > 0 && y <0){
            result = 4;
        }

        return result;

    }

    // Menghasilkan sebuah titik yang merupakan hasil mirror dengan garis y = x
    public Point mirrorOfMe(){
        int temp;
        temp = this.x;
        this.x = this.y;
        this.y = temp;
        return this;
    }

    public void print(){

    }
}


