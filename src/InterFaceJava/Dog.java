package InterFaceJava;


interface  Animal{
    void MakeSound ();
}

class dogSound implements Animal{
   public void MakeSound (){
        System.out.println("Bark");
    }


}

public class Dog {
    public static void main(String[] args) {

        dogSound obj = new dogSound();
        obj.MakeSound();
    }
}
