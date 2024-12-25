public class car {

  int noOfWheels; 

  String color; 

  float maxSpeeds; 

  float currentFuleInLiters; 

  int noOfSeats; 

  public void drive(){
    System.out.println("Car is driving");
    currentFuleInLiters--;

  }

  public void addFule(float fuel){
    currentFuleInLiters = currentFuleInLiters+fuel;


  }

  public float getCurrentFuleLevel(){

    return currentFuleInLiters;
  }
  
}
