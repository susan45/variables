public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java
        System.out.println();
        System.out.println("*** Metodo Concat ***");
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        //Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        //Metodo StringBuilder
        System.out.println();
        System.out.println("*** Metodo StringBuilder (constructor de cadenas) ***");
        System.out.println("*** Metodo toString - Genera la cadena final ***");
        var constructorCadenas = new StringBuilder();
//        constructorCadenas.append(cadena1);
//        constructorCadenas.append(" ");
//        constructorCadenas.append(cadena2);
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado con StringBuilder = " + resultado);

        //Classe StringBuffer
        System.out.println();
        System.out.println("*** Classe StringBuffer - Para trabajar con varios procesos(hilos) a la vez ***");
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + stringBuffer);
        System.out.println("resultado con StringBuffer = " + resultado);

        // Metodo Join
        System.out.println();
        System.out.println("*** Metodo Join - Une dos o mas cadenas ***");
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado con join = " + resultado);
        var resultado1 = String.join(" ", resultado, "Adios");
        System.out.println("resultado1 con join = " + resultado1);
    }
}

