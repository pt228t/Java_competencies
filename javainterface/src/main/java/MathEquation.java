public class MathEquation {
    double leftVal;
    double rightVal;
    char opcode;
    double results;

   public MathEquation(){

   }
   
   public MathEquation(char opcode) {
     this.opcode = opcode;
   }
   public MathEquation(double leftVal, double rightVal, char opcode) {
     this(opcode); // remember to make first call to constructor . if call is made from any other position, it will fail
     this.leftVal = leftVal;
     this.rightVal = rightVal;
   }

   void execute() {
       switch(opcode) {
           case 'a':
             results = leftVal + rightVal;
             break;
           case 's':
             results = leftVal - rightVal;
             break;
           case 'm':
             results = leftVal * rightVal;
             break;
           case 'd':
             results = rightVal!=0 ? leftVal / rightVal : 0.0d;
             break;
           default:
             System.out.println("Invalid Opcode");
             results = 0.0d;
       }
   }
}
