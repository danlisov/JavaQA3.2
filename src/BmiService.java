public class BmiService {
    public double calculate (double meters, double kilograms){
        double result = kilograms / (meters * meters);
        return  result;
    }
}
