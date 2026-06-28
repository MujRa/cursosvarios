import java.math.BigDecimal;

public class CalculadoraBancaria {
    public static double intereses(
            double capital,
            double tasa,
            int meses){
        return capital * (tasa/100) * (meses/12.0);
    }

    public static BigDecimal interesesbigdecimal(
            BigDecimal capital,
            BigDecimal tasa,
            int meses){
        BigDecimal base = new BigDecimal("100");
        BigDecimal basemeses = new BigDecimal(meses/12.0);
        return capital.multiply(tasa.divide(base).multiply(basemeses));
    }

    public static void main(String[] args){

        double capital =10000;
        double tasa=3.5; //% anual
        int meses = 6;

        double resultado = intereses(capital, tasa, meses);

        System.out.println("Interés con Double: "+resultado);


        BigDecimal capitalbigdecimal = new BigDecimal("10000");
        BigDecimal tasabigdecimal = new BigDecimal("3.5"); //% anual

        BigDecimal resultadobigdecimal = interesesbigdecimal(capitalbigdecimal, tasabigdecimal, meses);

        System.out.println("Interés con BigDecimal: "+resultadobigdecimal);
    }
}
