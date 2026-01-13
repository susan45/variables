public class CaracteresEspeciales {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** Caracteres Especiales ***");

        var cadena = "Hola Mundo";
        System.out.println("cadena texto normal= " + cadena);

        // \n - Imprime un salto de linea
        cadena = "Hola\nMundo";
        System.out.println("cadena texto con barra n (salto linea) = " + cadena);

        // '\t' - tabulador
        cadena = "\tHola\tMundo";
        System.out.println("cadena texto con barra t (tabulador) = " + cadena);

        // '\'' - comilla simple
        cadena = "Hola \' Mundo";
        System.out.println("cadena texto con comilla simple = " + cadena);

        // '\"' - comilla doble
        cadena = "Hola \" Mundo";
        System.out.println("cadena texto con comilla doble = " + cadena);

        // '\\' - barra inversa
        cadena = "Hola \\ Mundo";
        System.out.println("cadena texto con barra inversa = " + cadena);
    }
}
