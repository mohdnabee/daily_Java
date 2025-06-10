package OOPS.Inhertiance;
//  call bank package

class  shapes2 {
    public  void area (){
        System.out.println("Display area");
    }
}

class Triangle2 extends shape{
    public void area (int l ,  int h){
        System.out.println(1/2 * l *h);
    }
}

class Circle extends shape {
    public  void area (int r){
        System.out.println((3.14)*r*r);
    }
}

public class hirarchiacl {
    public static void main(String[] args) {

    }
}
