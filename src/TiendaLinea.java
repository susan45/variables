public class TiendaLinea {
    public static void main(String[] args) {
        //Detalle del producto
        System.out.println("*** Tienda en Línea (Detalle Producto) ***");

        String nombreProducto = "Cafe";
        System.out.println("Nombre del Producto = " + nombreProducto);
        double precioProducto = 10.5;
        System.out.println("Precio del Producto = " + precioProducto);
        int cantidadDisponible = 25;
        System.out.println("Cantidad Disponible = " + cantidadDisponible);
        boolean estaDisponible = true;
        System.out.println("Esta Disponible Para Venta ? = " + estaDisponible);
        //*****************************//
        System.out.println(" ");
        System.out.println("*** Tienda en Línea (Detalle Producto) - Modificar Valores ***");

        nombreProducto = "Té";
        System.out.println("Nombre del Producto = " + nombreProducto);
        precioProducto = 12.35;
        System.out.println("Precio del Producto = " + precioProducto);
        cantidadDisponible = 0;

        System.out.println("Cantidad Disponible = " + cantidadDisponible);
        estaDisponible = false;
        System.out.println("Esta Disponible Para Venta? = " + estaDisponible);
    }
}
