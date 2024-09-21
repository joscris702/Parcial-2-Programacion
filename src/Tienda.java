import java.util.Scanner;

public class Tienda {
    private Pago metodoPago;

    public void setMetodoPago(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        if (metodoPago != null) {
            metodoPago.procesarPago(monto);
        } else {
            System.out.println("Debe seleccionar un método de pago primero.");
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Criptomonedas");
        System.out.println("4. Transferencia Bancaria");

        int opcion = scanner.nextInt();

        System.out.println("Ingrese el monto a pagar:");
        double monto = scanner.nextDouble();

        switch (opcion) {
            case 1:
                tienda.setMetodoPago(new PagoTarjetaCredito());
                break;
            case 2:
                tienda.setMetodoPago(new PagoPayPal());
                break;
            case 3:
                tienda.setMetodoPago(new PagoCripto());
                break;
            case 4:
                tienda.setMetodoPago(new PagoTransferenciaBancaria());
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        tienda.realizarPago(monto);
    }
}
