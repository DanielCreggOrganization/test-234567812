package ie.gmit.myclass;

public class Main {


    public static void main(String[] args) {
      // Human humanObject1 = new Human();
       //Human humanObject2 = new Human();
       Puppy puppyObject1 = new Puppy();
       Puppy puppyObject2 = new Puppy("Lola");
       Puppy puppyObject3 = new Puppy("Lala", 10, "York");

       System.out.println( puppyObject1.name );
       System.out.println(puppyObject2.name);
       System.out.println(puppyObject3.name);
       
       System.out.println( puppyObject1.age );
       System.out.println(puppyObject2.age);
       System.out.println(puppyObject3.age);
       
            // humanObject1.name = "Harry";
            // humanObject1.age = 23;
            // humanObject1.nationality = "Irish";
            // humanObject1.weight = 85;
            // System.out.println(humanObject1.name);
            // System.out.println(humanObject1.age);
            // humanObject1.sayHi();
            // System.out.println(humanObject1.yearGoneBy());
            // System.out.println( humanObject1.eating(1.1f) + "kgs.");
            // System.out.println(humanObject1.nat(humanObject1.nat("Polish")));
           
            // humanObject2.name = "Bob";
            // humanObject2.age = 22;
            // humanObject2.nationality = "Polish";
            // System.out.println(humanObject2.name);
            // System.out.println(humanObject2.age);
            // humanObject2.sayHi();
            // humanObject2.yearGoneBy();
    }
}