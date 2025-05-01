package calssAndObjects.constructorFiles;


  class carsDetails {

      String carName = "Audi";
      int Model =  2025;

      //  constructor ==========================//===============================
      carsDetails (String carName, int Model){
          this.carName=carName;
         //  this.Model = Model;// ======================//=========================
         Model = Model;
      }

  }

       public class constructor2_01_0525 {

    public static void main(String[] args) {
        carsDetails obj = new carsDetails("Audi",2024);
        carsDetails obj1 = new carsDetails("Mustang",2023);
// ====================== // ========================== // ======================
        System.out.println("Model: " +obj.Model +" || Name:"+obj.carName);
        System.out.println("Model: " +obj1.Model+ " || Name:"+ obj1.carName);


    }



}
