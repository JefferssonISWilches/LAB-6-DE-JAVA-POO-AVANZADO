package service;

import model.Reserva;
import java.util.ArrayList;

public class SistemaReservas {

    private ArrayList<Reserva> listaReservas;

    public SistemaReservas() {
        listaReservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva r) {
        listaReservas.add(r);
        System.out.println("La reservas se agregaron exitosamente: ID " + r.getId());
    }

    public void listarReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        System.out.println("--- LISTA DE RESERVAS ---");
        for (Reserva r : listaReservas) {
            r.mostrarInfo();
        }
    }

    public int contarReservas() {
        return listaReservas.size();
    }

    public void eliminarReserva(int id) throws Exception {
        boolean encontrada = false;

        for (Reserva r : listaReservas) {
            if (r.getId() == id) {
                listaReservas.remove(r);
                System.out.println("Reserva con ID " + id + " eliminada correctamente.");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new Exception("ERROR: No existe una reserva con ese ID: " + id);
        }
    }
}
