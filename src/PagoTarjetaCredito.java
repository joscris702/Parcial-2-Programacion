import java.util.Scanner;

public class PagoTarjetaCredito implements Pago {

    @Override
    public void procesarPago(double monto) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de la tarjeta de crédito (8 dígitos):");
        String numeroTarjeta = scanner.nextLine();

        System.out.println("Ingrese la fecha de expiración (MM/AA):");
        String fechaExpiracion = scanner.nextLine();

        System.out.println("Ingrese el CVV (3 dígitos):");
        String cvv = scanner.nextLine();

        if (!validarNumeroTarjeta(numeroTarjeta)) {
            System.out.println("Número de tarjeta inválido.");
            return;
        }

        if (!validarFechaExpiracion(fechaExpiracion)) {
            System.out.println("Fecha de expiración inválida o tarjeta expirada.");
            return;
        }

        if (!validarCVV(cvv)) {
            System.out.println("CVV inválido.");
            return;
        }

        if (!autorizacionBancaria()) {
            System.out.println("Autorización bancaria fallida.");
            return;
        }

        System.out.println("Pago de Q" + monto + " procesado exitosamente con tarjeta de crédito.");
    }

    private boolean validarNumeroTarjeta(String numeroTarjeta) {
        return numeroTarjeta.matches("\\d{8}"); // Cambiado a 8 dígitos
    }

    private boolean validarFechaExpiracion(String fechaExpiracion) {
        return fechaExpiracion.matches("(0[1-9]|1[0-2])/\\d{2}");
    }

    private boolean validarCVV(String cvv) {
        return cvv.matches("\\d{3}");
    }

    private boolean autorizacionBancaria() {
        System.out.println("Autorizando el pago con el banco...");
        return true;
    }
}
