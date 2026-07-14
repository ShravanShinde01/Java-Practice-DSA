  class Pen{
  String color;
  int tipSize;

  void changeColor(){
       System.out.print("black");
  }
  void changeTipSize(){
    System.out.print(5);
  }
}
 

 // getters ans Setters understanding

class BankAcc{
   public String userName;
   private String password;

   public void setPassword(String pwd){
       this.password = pwd;
   }
   public String getPassword() {
        return password;
    }
}

// study about constructor
class Student{
     String name;
     int age;

     // non paramatarised
     Student(){
      System.out.println("Consturctor hu ma.....kisbe muze bulayaaaaaa");
     }
     //paramatarised
     Student(String name){
      this.name = name; 
     }
     Student(int age){
         this.age = age;
     }
}

// Inheriritance
    //base class , parent class
class Animal{
     String color;
     
     void eat(){
      System.out.println("eats");
     }

     void breath(){
      System.out.println("breadths");
     }
}
    // derived class, child class
class Fish extends Animal{
     int fins;
}


//polymorphism
    // method overloading
class calculator{
    void sum(int a, int b){
      System.out.println(a+b);
    } 
    void sum(int a, int b, int c){
      System.out.println(a+b+c);
    } 

    void sum(float a, float b){
      System.out.println(a+b);
    } 
    void sum(float a, float b, float c){
      System.out.println(a+b+c);
    } 
}

    // method overriding
    class Animal1{
      void eats(){
        System.out.print("eats anything....");
      }
    }

    class deer extends Animal1{
      void eats(){
        System.out.print("eats grass");
      }
    }

    //Abstraction
    abstract class Animal2{
       abstract void sound();

        void eats(){
          System.out.print("eats");
        }
    }
    class dog extends Animal2{
         @Override
        void sound(){
          System.out.print("barks");
        }

    }
 
 //interface

 interface chessPlayer{
      void moves();
 }

 class Queen implements chessPlayer{
   public void moves(){
      System.out.print("up,down,right,left, diagonal in 4 directions");
   }
 }

//  interface harbivour{
//     void eats();
//  }
//  interface carnivour{
//     void eats();
//  }

//  class bear implements harbivour,carnivour{
      
//  }


public class oops {
  public static void main(String[] args) {
      

 /*
      BankAcc bank = new BankAcc();
      bank.userName = "shravan shinde";
      
      bank.setPassword("Shravan@123");

      System.out.print(bank.userName);
      System.out.print(bank.getPassword());

*/


   /*     Student s1 = new Student();
        Student s2 = new Student("shravan");
        System.out.print(s2.name);
        Student s3 = new Student(21);
    */

  /*  Fish f1 = new Fish();
    f1.eat();
    f1.breath();
    f1.color = "jamuni";
    System.out.println(f1.color);
    f1.fins = 4;
    System.out.println(f1.fins);
  */

 /*    calculator sc = new calculator();
      
      sc.sum(2,3);
      sc.sum(2.5f,3.5f);
      sc.sum(2,3,5);
      sc.sum(3.3f,3.3f,3.3f);
  */

   /*  deer dr = new deer();
       dr.eats();
    */
   
  /*  dog sheru = new dog();
    sheru.sound();
  */

  Queen q = new Queen();
  q.moves();


    }
}