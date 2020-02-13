package ie.gmit.myclass;

public class Human {
   
      
        String name;
        int age;
        String nationality;
        float weight;
        

        void sayHi(){
            System.out.println("hiya");

        }

        int yearGoneBy(){
            age++;
            return age;
        }
        float eating(float food){
              weight += food;  
              return weight;
        }
        String nat(String newNationality){
           nationality = newNationality;
            return nationality;
        }
    }
