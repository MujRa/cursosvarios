import java.math.BigDecimal;
import java.math.RoundingMode;
public class Transferencia {

    // Comisión fija del banco: 0.50 €
    static final BigDecimal COMISION = new BigDecimal("0.50");

    public static BigDecimal[] transferir(
            BigDecimal saldoOrigen,
            BigDecimal saldoDestino,
            BigDecimal importe){

        // Total a descontar: importe + comision
        BigDecimal totalDebito = importe
                .add(COMISION)
                .setScale(2, RoundingMode.HALF_UP);

        // Validar saldo suficiente
        if (saldoOrigen.compareTo(totalDebito)<0){
            System.out.println("ERROR: Saldo insuficiente");
            return null;
        }

        // Ejecutar transferencia
        BigDecimal nuevoOrigen = saldoOrigen
                .subtract(totalDebito)
                .setScale(2,RoundingMode.HALF_UP);
        BigDecimal nuevoDestino = saldoDestino
                .add(importe)
                .setScale(2, RoundingMode.HALF_UP);
        return new BigDecimal[]{nuevoOrigen, nuevoDestino};
    }

    public static void main(String[] args){
        BigDecimal cuentaA = new BigDecimal("1000.00");
        BigDecimal cuentaB = new BigDecimal("250.00");
        BigDecimal importe = new BigDecimal("100.00");

        System.out.println("------ ANTES ------");
        System.out.println("Cuenta A: "+ cuentaA);
        System.out.println("Cuenta B: "+ cuentaB);

        BigDecimal[] resultado =
                transferir(cuentaA, cuentaB, importe);

        if(resultado != null){
            System.out.println("---- DESPUES ----");
            System.out.println("Cuenta A: "+ resultado[0]);
            System.out.println("Cuenta B: "+ resultado[1]);
            System.out.println("Comision cobrada: "+COMISION);
        }
        if(resultado != null) {
            cuentaA = resultado[0];
            cuentaB = resultado[1];
            importe = new BigDecimal("50.00");

            resultado =
                    transferir(cuentaA, cuentaB, importe);

            if (resultado != null) {
                System.out.println("---- 2da TRANSFERENCIA ----");
                System.out.println("Cuenta A: " + resultado[0]);
                System.out.println("Cuenta B: " + resultado[1]);
                System.out.println("Comisión cobrada: " + COMISION);
            }
        }
    }
}
