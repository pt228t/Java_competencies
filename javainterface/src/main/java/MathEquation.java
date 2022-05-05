public class MathEquation {
    double leftVal;
    double rightVal;
    char opcode;
    double results;
    private static int numberofCalculations;
    private static int sumofResults;

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
       numberofCalculations+=1;
       sumofResults+=results;
   }

   void execute(double leftVal, double rightVal) {
      this.leftVal = leftVal;
      this.rightVal = rightVal;
      execute();
   }

   void execute(int leftVal, int rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
    execute();
    results = (int)results;
   }

   public static int getAverageresultofCalculations() {
     return sumofResults / numberofCalculations;
   }
}
