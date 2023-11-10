public class GasolinCar extends AFuelCar {

    GasolinCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors){ //constructor
        super(kmPrLitre,registrationNumber,make,model,numberOfDoors);
    }
    @Override
    public String getFuelType(){ //getter
        return "Gasoline";
    }
    public int getRegistrationFee(){ //getter med else-if så ledes vi kan få den korrekte registration fee
    if(getKmPrLitre()>20){
        return 330;
        } else if(getKmPrLitre()>15){
        return 1050;
        }else if(getKmPrLitre()>10){
        return 2340;
    }else if (getKmPrLitre()>5){
        return 5500;
    }
    else{
        return 10470;
        }
    }
    @Override
    public String toString(){ //overrider således det korrekte bliver printet for dette objekt
        return "Car Information:\n" +
                "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "RegistrationNumber: " +getRegistrationNumber() + "\n" +
                "Number of Doors: " +getNumberOfDoors() + "\n" +
                "Kilometers Per Liter: " +getKmPrLitre() + "\n" +
                "Fuel Type: " + getFuelType()+ "\n" +
                "Registration Fee: " + getRegistrationFee()+"\n";
    }
}
