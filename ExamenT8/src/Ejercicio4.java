import Model.Inventario;

public class Ejercicio4 {
    public static void main(String[] args) {
        Inventario<Inventario.Producto> inventario = new Inventario<>();
        inventario.agregar(new Inventario.Producto("Telefono",1200.5,30));
        inventario.agregar(new Inventario.Producto("Portatil",5100.99,90));

        inventario.mostrarInventario();
    }
}