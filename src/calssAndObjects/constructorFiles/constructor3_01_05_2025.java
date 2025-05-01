package calssAndObjects.constructorFiles;


class  studentsDetails{
     String name =  "Nabeel khan";
     int age = 21;

     studentsDetails(){
         //  1st constructor ===========================//===============================//=============================
         System.out.println("call 1st constructor " +"hello today is thursday");
     }

     studentsDetails(String name ){
         //  2nd constructor ===========================//=============================//===============================
         this();
         System.out.println("call 2nd constructor " +name);
     }


     studentsDetails(String name, int age){
         // 3rd constructor ============================//=============================//===============================
         this(name);
         this.name=name;
         age = age ;
         System.out.println("call 3rd constructor " +name+ " "+age);
     }


}

public class constructor3_01_05_2025 {
    public static void main(String[] args) {
//  call the constructors ===============//===================================//========================================
        studentsDetails obj1 = new studentsDetails("Mohd Nabeel", 20);


    }


}
