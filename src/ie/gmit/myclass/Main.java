package ie.gmit.myclass;

public class Main {


    public static void main(String[] args) {
       Human humanObject1 = new Human();
       Human humanObject2 = new Human();


            humanObject1.name = "Harry";
            humanObject1.age = 23;
            humanObject1.nationality = "Irish";

            System.out.println(humanObject1.name);
            System.out.println(humanObject1.age);

            humanObject1.sayHi();
            humanObject1.yearGoneBy();

            System.out.println(humanObject1.yearGoneBy());

            humanObject2.name = "Bob";
            humanObject2.age = 22;
            humanObject2.nationality = "Polish";
            
            System.out.println(humanObject2.name);
            System.out.println(humanObject2.age);
            humanObject2.sayHi();
            humanObject2.yearGoneBy();
    }
}