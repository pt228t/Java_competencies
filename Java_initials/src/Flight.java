
 
 /**public Flight() {
     passengers = 40;
     seat = 150;
 }**/
 /**private void handletooMany() {
     System.out.println("Too many people");
 }**/
 
 /**public void addPassengers() {
     if(passengers < seat) {
          passengers+= 1;
     }
     else {
         handletooMany();
     }
 }**/
 // Making use of this keyword 
 /**public boolean hasRoom(Flight f2) {
     total = this.passengers + f2.passengers;
     return total <= seat;
 }**/
 
 //getter and setter method to modify and access private fields of the class
public class Flight {
    private int passengers;
    int seat=10;
    private int flightNumber;
    private int flightClass;
    private int freeBag,checkedBag;
    private double perBagFee;
    private boolean[] isSeatAvailable = new boolean[seat]; //by default as field initializers and as fields are initialized. This will be set to false
    private static int MaxPassengers; // Example of static initialization block
    private static boolean isRestricted;
    private int totalCheckedbags;
static {
    connectAdmin();
    MaxPassengers = isRestricted ? 50 : 1000;
    closeAdmin();


}

// Initialization block example as code run within this will be executed first prior constructors getting initialized
// We wanted to change the default value of isSeatAvailable to true prior constructor initialization
{
    for(int i=0; i<seat; i++) {
        isSeatAvailable[i] = true;
    }

}
    
 public static void connectAdmin() {
    System.out.println("Connecting to admin service");
    isRestricted = true;
 }

 public static void closeAdmin() {
    System.out.println("Closing connection to admin service");
 }
 public int getSeat() {
     return seat;
 }
 public void setSeat(int seat) {
      this.seat = seat;
 }
 public void add1Passengers() {
    if(hasSeating()) {
        passengers+=1;
    }
 }

 public void add1Passengers(int bags) {
     if(hasSeating()) {
         add1Passengers();
     }
     totalCheckedbags +=bags;
}

 private boolean hasSeating() {
     return passengers <= getSeat();
 }

 public static int getMaxPassengercount() {
     return MaxPassengers;
 }
 //Chaining constructor examples 
 public Flight() {}
 public Flight(int freeBag) {
     this(freeBag > 1? 0.25d:0.50d);
     this.freeBag = freeBag;
 }

 public Flight(int freeBag, int checkedBag) {
     this(freeBag);
     this.checkedBag = checkedBag;
 }
 
 public Flight(double perBagFee) {
     this.perBagFee = perBagFee;
 }
}
