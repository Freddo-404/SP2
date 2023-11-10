abstract class AFuelCar extends ACar { //nedarver fra interface Car
    private final int kmPrLitre;

    AFuelCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) { //constructor
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }
    public String getFuelType() { //getter for fueltype som bliver overridet af nedarvet klasser
        return null;
    }
       public  int getKmPrLitre(){
            return kmPrLitre;
        }


    @Override
    public String toString(){ //bliver overridet af det nedarvet klasser
        return null;
    }
}
