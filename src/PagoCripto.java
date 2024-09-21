public class PagoCripto implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de Q" + monto + " con Criptomonedas.");
        System.out.println("Verificando transacción en la blockchain...");

        if (verificarBlockchain()) {
            System.out.println("Transacción confirmada en la blockchain.");
            System.out.println("Pago de Q" + monto + " procesado con éxito mediante criptomonedas.");
        } else {
            System.out.println("Error en la verificación de la transacción en la blockchain.");
        }
    }

    private boolean verificarBlockchain() {
        return true;
    }
}
