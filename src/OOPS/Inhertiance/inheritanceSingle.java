package OOPS.Inhertiance;

class  shapes {
    public  void area (){
        System.out.println("display area");
    }
}

class  triangle extends shape {
    public  void  area (int l ,  int h){
        System.out.println(l/2* l* h);
    }
}

public class inheritanceSingle {
    public static void main(String[] args) {

    }
}
