
 
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
    private int seat;
    private int flightNumber;
    private int flightClass;
    private boolean[] isSeatAvailable = new boolean[seat]; //by default as field initializers and as fields are initialized. This will be set to false

// Initialization block example as code run within this will be executed first prior constructors getting initialized
// We wanted to change the default value of isSeatAvailable to true prior constructor initialization
{
    for(int i=0; i<seat; i++) {
        isSeatAvailable[i] = true;
    }

}
    
 public int getSeat() {
     return seat;
 }
 public void setSeat(int seat) {
      this.seat = seat;
 }

 //Chaining constructor examples 
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
