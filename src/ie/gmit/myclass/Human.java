package ie.gmit.myclass;

public class Human {
   
      
        String name;
        int age;
        String nationality;

        void sayHi(){
            System.out.println("hiya");

        }

        int yearGoneBy(){
            age++;
            return age;

        }
}