// =====================================================
// HABITACION.JAVA - Implementado por Jonathan Quinga
// =====================================================
public class Habitacion {
    // Atributos privados (Encapsulación)
    private int numero;
    private boolean disponible;
    
    // Constructor
    public Habitacion(int numero) {
        this.numero = numero;
        this.disponible = true; // Por defecto, todas las habitaciones están disponibles
    }
    
    // Métodos getter (Acceso controlado a los datos)
    public int getNumero() {
        return numero;
    }
    
    public boolean estaDisponible() {
        return disponible;
    }
    
    // Métodos para cambiar el estado de la habitación
    public void reservar() {
        this.disponible = false;
    }
    
    public void liberar() {
        this.disponible = true;
    }
    
    // Método toString para facilitar la visualización
    @Override
    public String toString() {
        return "Habitación " + numero + " - " + (disponible ? "Disponible" : "Ocupada");
    }
}
