import java.util.ArrayList;

public class FleetOfCars {
   private final ArrayList<Car> fleet = new ArrayList<>(); //danner et array med objecterne Car

   public void addCar(Car car) { //addcar metode
       fleet.add(car);
   }

   public int getTotalRegistrationFeeForFleet(){ //getter der giver os det samlet resultat af alle registrationfees med for each loop
       int sum = 0;

       for (Car s : fleet) {
           sum += s.getRegistrationFee();
       }
       return sum;
   }
   @Override
   public String toString(){ //overrider tostring så ledes vi blot kan kalde på fleet i sout så alle objecterne vi har tilføjet i arraylist bliver printet med deres toString ved hjælp af for each loop
       String s = "";
       for (Car car : fleet) {
               s+=car.toString()+"\n";
           }
       return s +"The total registrationfee for the fleet is: "+getTotalRegistrationFeeForFleet();
       }

   }

