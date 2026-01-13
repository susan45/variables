

public class ManejoSubcadenas {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** Metodo substring ***");

        // Substring (inicio, fin );
        //Tema de subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);
        //var subcadena2 = cadena1.substring(5); //esta manera es ok
        var subcadena2 = cadena1.substring(5, 10); // esta tambien
        System.out.println("subcadena2 = " + subcadena2);
    }
}
