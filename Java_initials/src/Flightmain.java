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
    }
}
