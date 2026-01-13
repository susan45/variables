

public class TipoVar {
    public static void main(String[] args) {
        //Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        //Con el uso de var (a partir de java 10 se empezo a usar)
        var nombre2 = "Carlos"; //Con var ahora ya siempre sera un tipo string
        System.out.println("nombre2 = " + nombre2);

        //Definir otras variables usando
        var edad = 30; //Se infiere tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; //Se infiere tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; //Se infiere tipo boolean
    }
}
