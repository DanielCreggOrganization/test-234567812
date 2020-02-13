package ie.gmit.myclass;

public class Puppy {
    //instance variables
    String name;
    int age;
    String breed;
    
    //default constructor
    Puppy(){
    }
    //default constructor
    Puppy(String newName){
        name = newName;
    }
    //parameterized constructor
    Puppy(String newName, int newAge, String newBreed){
        name = newName;
        age = newAge;
        breed = newBreed;
    }

}
   