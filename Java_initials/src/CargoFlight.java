import javax.jws.soap.SOAPBinding.Use;

//Class Inheritance - Class CargoFlight is derived class of base Class Flight
public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float UsedCargoSpace; 
    int seat = 12;

    public void add1Package(float h, float w, float d) {
        float size = h * w * d;
        if(hasCargoSpace(size)){
          UsedCargoSpace += size;
          System.out.println("Cargo has been added");
        }
        else {
          handleNoSpace();
        }
    }
    public int getSeat() {
        return seat;
    }
    
    public boolean hasCargoSpace(float size) {
      return UsedCargoSpace + size <= maxCargoSpace;
    }

    public void handleNoSpace(){
        System.out.println("No Cargo Space Left");
    }
}
