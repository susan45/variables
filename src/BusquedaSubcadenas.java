
public class BusquedaSubcadenas {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** Metodo IndexOf ***");
        //Buscar subcadenas
        //IndexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        //Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        System.out.println();
        System.out.println("*** Metodo lastIndexOf ***");
        //LastIndexOf - Devuelve el indice de la ultima aparicion de la subcadena
        //Subcadena a buscar "Mundo"
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //Subcadena no encontrada devuelve -1
        var indice3 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
