

public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** Metodo Replace ***");

        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        //Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Reemplazar "Hola" por "Adios" // no funciona => Saludos Mundo
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Este si funciona => Adios Mundo
        var nuevaCadena1 = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena1 = " + nuevaCadena1);
    }
}
