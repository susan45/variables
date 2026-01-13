public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";

        //Obtener el largo de una cadena
        System.out.println("Longitud = " + cadena1.length());
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Remplazar caracteres
        var nuevaCadena = cadena1.replace("Mundo", "Java");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayusculas
        var cadenaMayusculas = cadena1.toUpperCase();
        System.out.println("cadenaMayusculas = " + cadenaMayusculas);

        //Convertir a minusculas
        var cadenaMinusculas = cadena1.toLowerCase();
        System.out.println("cadenaMinusculas = " + cadenaMinusculas);

        //Eliminar espacios en blanco (metodo trim())
        var cadena2 = "   Leo Reyes   ";
        var cadenaSinEspacios = cadena2.trim();
        System.out.println("cadenaSinEspacios = " + cadenaSinEspacios);
        System.out.println("cadena con espacios = " + cadena2);
    }
}
