package OOPS;
//  access modifier ||  10-06-25 || Tuesday ||  21:18 || ================================================================

  class Account{
    public String name ;//  public access modifier
      // String name ;; //  default access modifier
      protected  String email;// protected access modifier
      private String password ;  // private access modifier


      // getters and setter to access the private
      public String getPassword(){
          return this.password;
      }

      public void setPassword(String pass){
          this.password = pass;
      }

}


public class Bank {
    public static void main(String[] args) {

        Account account1 =  new Account();
        account1.name= "My Name is Mohd Nabeel";

        account1.email= "example.gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());


    }
}
