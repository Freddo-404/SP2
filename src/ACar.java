 public class ACar implements Car { //nedarver fra Car
    private String registrationNumber; //attributter
    private String make;
    private String model;
   private int numberOfDoors;
    ACar(String registrationNumber, String make, String model, int numberOfDoors){ //constructor for Acar
       this.registrationNumber = registrationNumber;
       this.make = make;
       this.model = model;
       this.numberOfDoors = numberOfDoors;

    }

   public String getRegistrationNumber(){ //getter for at få
    return registrationNumber;
    }

    public String getMake(){ //getter for at få make
    return make;
    }
    public String getModel(){ //getter for at få model
    return model;
    }

   public int getNumberOfDoors(){ //getter for at få numberOfDoors
    return numberOfDoors;
    }


     public int getRegistrationFee() { //getter for at få registrationFee
        return getRegistrationFee();
     }

     @Override
     public String toString() { // bliver overridet af de nedarvet klasser
         return null;
     }
}
