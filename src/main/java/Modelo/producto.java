package Modelo;

public class producto {
    private String nombre;
    private double valorUnitario;
    private int cantidad;

    public producto(String nombre, double valorUnitario, int cantidad) {
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public double getTotal(){
        return cantidad * valorUnitario;
    }
    
    @Override
    public String toString() {
        return "producto { " + "nombre = " + nombre + ", valorUnitario = " + valorUnitario + ", cantidad = " + cantidad + '}';
    }
    
}
