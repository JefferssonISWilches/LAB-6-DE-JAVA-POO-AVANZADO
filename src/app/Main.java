package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {
    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();


        Reserva r1 = new Reserva(1, "Jeffesson", "2025-12-24", 2);
        Reserva r2 = new Reserva(2, "Ana ", "2025-12-25", 3);


        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        r1.setCliente("Jeffersson (VIP)");


        sistema.listarReservas();
        System.out.println("Total de reservas: " + sistema.contarReservas());

        try {
            sistema.eliminarReserva(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.eliminarReserva(99);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sistema.listarReservas();
        System.out.println("Total final de reservas: " + sistema.contarReservas());
    }
}
