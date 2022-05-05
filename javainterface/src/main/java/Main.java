public class Main {
    public static void main(String[] args) {
        performClaculations();
        Addition add = new Addition();
        doCalculations(add, 100.0d, 200.0d);
    }

    static void performClaculations(){
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d , 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        //Using alternative/better/short method of constructor for doing calculations
        equations[0] = new MathEquation(100.0d, 50.0d, 'd' );
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

        for (MathEquation equation:equations) {
            equation.execute();
            System.out.println("Result is: "+equation.results);
        }

        System.out.println("Average result of Calculation is: "+ MathEquation.getAverageresultofCalculations());

        //Alternative method of operation using method overloading
        MathEquation equationoverLoad = new MathEquation('d');
        double leftdouble = 9.0d;
        double rightdouble = 4.0d;
        equationoverLoad.execute(leftdouble, rightdouble);
        System.out.println("EquationOverload Result for Double is: "+equationoverLoad.results);

        //Another alternative wherein method expects the double as input but you passsed and int. 
        // So java compiler smartly takes care of this by converting the int input which you passed to return result in double automatically
        //Below is the example
        int leftInt = 9;
        int rightInt = 4;
        equationoverLoad.execute(leftInt, rightInt);
        System.out.println("EquationOverload Result for Int is: "+equationoverLoad.results);
        
    }

    /**private static MathEquation**/ private static MathEquation create(double leftVal, double rightVal, char opcode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opcode = opcode;
        return equation;

    }

    static void doCalculations(CalculateBase calculate , double leftVal , double rightVal) {
       calculate.setleftVal(leftVal);
       calculate.setrightVal(rightVal);
       calculate.calculations();
       System.out.println("Result is:"+calculate.getResult()) ;
    }
}
