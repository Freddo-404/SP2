public class DieselCar extends AFuelCar{


   private final boolean particleFilter;

    private boolean hasParticleFilter(){
    return particleFilter;
    }
    DieselCar(int KmPrLitre, String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter){ //constructor
        super(KmPrLitre,registrationNumber,make,model,numberOfDoors);
        this.particleFilter = particleFilter;
    }

    @Override //overrider getFuelType så vi kan se hvilken type brændstof biler bruger
    public String getFuelType(){
        return "Diesel";
    }
   public int getRegistrationFee(){
        int particleFee = 0; //boolean med if statement således vi kan beregne particalfee direkte ind i registration fee
        if (!hasParticleFilter()){
            particleFee= 1000;
        }
       if(getKmPrLitre()>20){
           return 130+330+particleFee;
       } else if(getKmPrLitre()>15){
           return 1390+1050+particleFee;
       }else if(getKmPrLitre()>10){
           return 1850+2340+particleFee;
       }else if (getKmPrLitre()>5){
           return 2770+5500+particleFee;
       }
       else{
           return 15260+10470+particleFee;
       }
    }

    @Override
    public String toString() { //toString for at printe via fleetofcar som tilhører denne klasse når objectet er lavet
        return "Car Information:\n" +
                "Make: " + getMake() + "\n" +
                "Model: " + getModel() + "\n" +
                "RegistrationNumber: " +getRegistrationNumber() + "\n" +
                "Number of Doors: " +getNumberOfDoors() + "\n" +
                "Kilometers Per Liter: " +getKmPrLitre() + "\n" +
                "Particle Filter: " +hasParticleFilter()+ "\n" +
                "Fuel Type: " + getFuelType()+ "\n" +
                "Registration Fee: " + getRegistrationFee()+"\n";
    }
}
