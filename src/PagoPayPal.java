import java.util.Scanner;

public class PagoPayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su correo electrónico de PayPal:");
        String email = scanner.nextLine();

        System.out.println("Ingrese su contraseña de PayPal:");
        String password = scanner.nextLine();

        if (autenticarUsuario(email, password)) {
            System.out.println("Autenticación exitosa con PayPal.");
            System.out.println("Procesando pago de Q" + monto + " con PayPal...");
            System.out.println("Pago con PayPal realizado con éxito.");
        } else {
            System.out.println("Error de autenticación en PayPal.");
        }
    }

    private boolean autenticarUsuario(String email, String password) {
        return email.equals("Joscris702") && password.equals("Estrella1234");
    }
}
