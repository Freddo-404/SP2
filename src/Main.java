public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars(); //arraylist for vores objekter vi putter i den

        // danner objekter ud fra vores klasser
        Car volvo = new DieselCar(50,"BA21021","Volvo","Familiedeluxe",5,true);
        Car mustang = new GasolinCar(25,"FE21312","Mustang","TheCoolOne",5);
        Car telsa = new ElectricCar(200, 970,"BA12314","Tesla","Roadster",5);

        //tilføjer objecter i ArrayList
        fleet.addCar(mustang);
        fleet.addCar(volvo);
        fleet.addCar(telsa);

        System.out.println(fleet);


    }
        }

