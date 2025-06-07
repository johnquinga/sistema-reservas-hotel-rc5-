// Habitacion.java
public class Habitacion {
    private int numero;
    private boolean disponible;

    public Habitacion(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "Habitación " + numero + " - " + (disponible ? "Disponible" : "Ocupada");
    }
}

// Reserva.java
public class Reserva {
    private String cliente;
    private Habitacion habitacion;

    public Reserva(String cliente, Habitacion habitacion) {
        if (cliente == null || cliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        if (habitacion == null) {
            throw new IllegalArgumentException("La habitación no puede ser null");
        }
        
        this.cliente = cliente.trim();
        this.habitacion = habitacion;
        this.habitacion.reservar();
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumeroHabitacion() {
        return habitacion.getNumero();
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    @Override
    public String toString() {
        return "Reserva de " + cliente + " en habitación " + habitacion.getNumero();
    }
}
