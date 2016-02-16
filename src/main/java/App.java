/**
 * Created by wscown on 2/16/16.
 */
public class App {

    public static void main(String[] args) {

        Calculator.add(1,2);

        Calculator.add(2,0);

        Calculator.subtract(1,2);

        Calculator.subtract(2,7);

        Calculator.multiply(1,2);

        Calculator.multiply(2,4);

        try {
            Calculator.divide(4,2);
        }catch(DivisionbyZeroException e){
            e.printStackTrace();
            System.out.println("Dividing by 0 is not a valid mathematical operation!");
        }

        try {
            Calculator.divide(4,0);
        }catch(DivisionbyZeroException e){
            e.printStackTrace();
            System.out.println("Dividing by 0 is not a valid mathematical operation!");
        }

        Calculator.multiply(67,5);

        Calculator.multiply(32,44);

        try {
            Calculator.squareRoot(9);
        }catch(ComplexNumberException e){
            e.printStackTrace();
            System.out.println("The square root of a negative number is a legal mathematical concept, but is beyond the scope of this calculator. Sorry!");
        }
    }
}
