package Modelo;
import java.util.List;
import java.util.ArrayList;

public class inventario extends producto {
    private List<producto> productos;
    
    public inventario(String nombre, double valorUnitario, int cantidad) {
        super(nombre, valorUnitario, cantidad);
        List<producto> productos = new ArrayList();
    }
    
    public void agregarProducto() {
        
    }
    
    public void limpiar(){
        
    }
    
    
}
