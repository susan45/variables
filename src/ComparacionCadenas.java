

public class ComparacionCadenas {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** Comparaciones (==) y metodo equals ***");
        //Comparacion cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparacion de cadenas (==) comparan la referencia en memoria (si apuntan al mismo objeto)
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2); //true

        //Comparamos cadena1 con cadena3 (referencias) no su contenido
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Si queremos comparar contenidos usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
