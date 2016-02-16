/**
 * Created by wscown on 2/16/16.
 */
public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double divide(int a, int b) throws DivisionbyZeroException{
        if(b == 0){
            throw new DivisionbyZeroException();
        }else {
            return a / b;
        }
    }

    public static double squareRoot(int a) throws ComplexNumberException{
        if(a < 0){
            throw new ComplexNumberException();
        }else{
            return Math.sqrt((double) a);
        }
    }
}
