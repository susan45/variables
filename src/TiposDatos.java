

public class TiposDatos {
    public static void main(String[] args) {

        //Tipos datos en Java
        //Enteros (su valor por default es 0)
        byte tipoByte = 127; //el valor max es 127 - 128 sera entero
        System.out.println("tipoByte = " + tipoByte); //soutv atajo para añadir el print + variable
        short tipoShort = 32000; //valor rango -32,768 a 32,767
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; //valor maximo. Una variable tipo int toma 32 bits. Int tiene el tipo default 0
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9876543210L; //añadimos la L al final si añadimos mas numeros de lo normal. Tiene 8 bytes
        System.out.println("tipoLong = " + tipoLong);

        //Tipos datos flotantes
        //Punto flotante (su valor por default es 0.0)
        float tipoFloat = 3.14F; //tenemos que añadir la F al final para indicar Float, sin la F seria un double. 32 bits
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.14; //D opcional, no es necesario
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracteres - valor por default ('\u0000')
        char tipoChar = 'A'; //Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; //asignacion de numero correspondiente en unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano - valor por default es (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        String nombre = null; // valor por default null
        System.out.println("nombre = " + nombre);
        nombre = "Susana Garcia";
        System.out.println("nombre = " + nombre);
    }
}
