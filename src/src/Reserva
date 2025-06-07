// =====================================================
// HOTEL.JAVA - Implementado por Jonathan Quinga
// =====================================================
import java.util.ArrayList;

public class Hotel {
    // Atributos privados
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;
    
    // Constructor
    public Hotel(int cantidadHabitaciones) {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
        
        // Inicializar habitaciones
        for (int i = 1; i <= cantidadHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }
    
    // FUNCIONALIDAD 1: Consultar disponibilidad de una habitación
    public boolean consultarDisponibilidad(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                return habitacion.estaDisponible();
            }
        }
        return false; // Habitación no encontrada
    }
    
    // FUNCIONALIDAD 2: Crear una nueva reserva
    public boolean crearReserva(String cliente, int numeroHabitacion) {
        // Buscar la habitación
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion && habitacion.estaDisponible()) {
                // Crear la reserva
                Reserva nuevaReserva = new Reserva(cliente, habitacion);
                reservas.add(nuevaReserva);
                return true; // Reserva exitosa
            }
        }
        return false; // No se pudo crear la reserva
    }
    
    // Método para mostrar todas las reservas
    public void mostrarReservas() {
        System.out.println("\n=== RESERVAS ACTUALES ===");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println("Cliente: " + reserva.getCliente() + 
                                 " - Habitación: " + reserva.getNumeroHabitacion());
            }
        }
    }
    
    // Método para mostrar estado de habitaciones
    public void mostrarHabitaciones() {
        System.out.println("\n=== ESTADO DE HABITACIONES ===");
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion.toString());
        }
    }
    
    // Getter para obtener el número total de habitaciones
    public int getTotalHabitaciones() {
        return habitaciones.size();
    }
}
