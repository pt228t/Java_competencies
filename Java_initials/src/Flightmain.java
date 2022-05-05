public class Flightmain {
    
    public static void main(String[] args) {
        /**Flight flight1 = new Flight();
        flight1.addPassengers();

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        //add passengers to both flights
        Flight lax3 = null;
        if(lax1.hasRoom(lax2)) {
            lax3 = lax1.createnewwithBoth(lax2);
        // do some other work 
        }

        if(lax3!=null) {
            System.out.println("Flights combined");
        }**/
        
        //getter and setter modifiers 
        Flight lax = new Flight();
        lax.setSeat(200);
        System.out.println(lax.getSeat());
        System.out.println(Flight.getMaxPassengercount());
        Flight var1 = new Flight();
        Flight var2 = new Flight();
     
        //Example of passing object as reference 
        //1st Use case - changes to Object member - which exist even when the method is completed
        swapNumbers(var1, var2);
        System.out.println(var1.getSeat());
        System.out.println(var2.getSeat());

        //Example of Inheritance where CargoFlight is derived class of Flight class
        CargoFlight cf = new CargoFlight();
        cf.add1Package(10.0f, 5.0f, 2.0f);
        cf.add1Passengers(10);
        // Example of field hiding in Inheritance
        CargoFlight cf1 = new CargoFlight();
        System.out.println("Reference type Cargoflight has seats: "+ cf1.seat);

        Flight f2 = new Flight();
        System.out.println("Reference type Flight has seats: "+ f2.seat);

        Flight f3 = new CargoFlight();
        System.out.println("Reference of type Flight to instance of Cargoflight has seats: "+ f3.seat);

        // We can resolve this problem of choosing the seat value of CargoFlight by method overriding
        // We have created same name method getseat() in both base and derived class to get the seat number 
        // This way we make sure that the seat number of CargoFlight overrides the seat number of Flight class via method
        Flight f4 = new CargoFlight();
        System.out.println("Reference of type Flight to instance of Cargoflight after method overriding has seats: "+ f4.getSeat());
        System.out.println("Reference type Cargoflight has seats: "+ cf1.getSeat());
        System.out.println("Reference type Flight has seats: "+ f2.getSeat());

    }
    static void swapNumbers(Flight i ,Flight j) {
            
        int k = i.getSeat();
        i.setSeat(j.getSeat());
        j.setSeat(k);
    }
}
