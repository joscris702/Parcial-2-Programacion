import java.util.Scanner;

public class PagoTransferenciaBancaria implements Pago {

    @Override
    public void procesarPago(double monto) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta bancaria:");
        String numeroCuenta = scanner.nextLine();

        System.out.println("Procesando transferencia bancaria...");
        if (verificarTransferencia()) {
            System.out.println("Transferencia de Q" + monto + " procesada exitosamente.");
        } else {
            System.out.println("Error en la verificación de la transferencia bancaria.");
        }
    }

    private boolean verificarTransferencia() {
        System.out.println("Verificando la transferencia en el banco...");
        try {
            Thread.sleep(3000); // Simular proceso largo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
