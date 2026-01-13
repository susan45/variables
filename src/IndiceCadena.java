

public class IndiceCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); //Recuperar caracter H
        System.out.println("primerCaracter = " + primerCaracter);
        var ultimoCaracter = cadena1.charAt(9); //Recuperar caracter o
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        var caracterM = cadena1.charAt(5); //Recuperar caracter M
        System.out.println("caracterM = " + caracterM);
    }
}
