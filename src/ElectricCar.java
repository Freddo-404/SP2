import org.w3c.dom.ls.LSOutput;

public class ElectricCar extends ACar {
   private final int batteryCapacity; // attributter der kun benyttes i denne klasse
   private final int maxRange;

    ElectricCar(int batteryCapacity,int maxRange,String registrationNumber, String make, String model, int numberOfDoors) { //constructor
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){ // getter
    return  batteryCapacity;
    }
   public int getMaxRangeKm(){// getter
    return maxRange;
    }
  public int getWhPrKm(){ //getter
    return batteryCapacity*1000/maxRange;
    }
    public int getRegistrationFee(){
    double kilometerNumber = 100/(getWhPrKm()/91.25); //double da vi bruger komma tal og samtidig benytter os af formlen
    if(kilometerNumber>20){
            return 330;
        } else if(kilometerNumber>15){
            return 1050;
        }else if(kilometerNumber>10){
            return 2340;
        }else if (kilometerNumber>5){
            return 5500;
        }
        else{
            return 10470;
        }
    }
@Override
public String toString(){ //overrider tostring så det korrekte bliver printet for klassen
        return "Car Information:\n" +
                "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "RegistrationNumber: " +getRegistrationNumber() + "\n" +
                "Number of Doors: " +getNumberOfDoors() + "\n" +
                "Battery Capacity: " +getBatteryCapacityKWh() + "Kwh" + "\n" +
                "Max Range: " +getMaxRangeKm()+ "km"+"\n"+
                "Registration Fee: "+getRegistrationFee()+"\n";

}
}
