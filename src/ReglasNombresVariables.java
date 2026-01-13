

public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Juan Carlos"; // Correcto y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2"; // Correcto pero no aplica las buenas practicas (minusculaMayuscula)
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente ="Juan"; //Incorrecto
        String nombre_cliente = "Juan";  //Correcto, no aplica buenas practicas
        System.out.println("nombre_cliente = " + nombre_cliente);
        String _apellido = "Perez"; //Correcto y aceptable
        System.out.println("_apellido = " + _apellido);
        String $apellido = "Perez"; //Correcto y aceptable
        System.out.println("$apellido = " + $apellido);
        int totPzs = 10; //Correcto pero no aplica las buenas practicas
        System.out.println("totPzs = " + totPzs);
        int totalPiezas = 10; //Correcto, aplica buenas practicas
        System.out.println("totalPiezas = " + totalPiezas);
        boolean casado = true; //Correcto, aun puede mejorar
        System.out.println("casado = " + casado);
        boolean esCasado = true; //Correcto, buenas practicas
        System.out.println("esCasado = " + esCasado);
        boolean isCasado = true; //Correcto, aplica buenas practicas en ingles
        boolean tieneSaldo = true; //Correcto y buenas practicas
        boolean hasSaldo = true; //Correcto y buenas practicas en ingles
    }
}
