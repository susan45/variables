public class ReservaHoteles {
    public static void main(String[] args) {

        //Variables 
        var nombreCliente = "Susana Garcia";
        var diasEstancia = 7;
        var tarifaDiaria = 20.50;
        var tieneVistasAlMar = true;

        //Imprimimos valores variables
        System.out.println();
        System.out.println("*** Reserva Hotel Susana ***");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistasAlMar = " + tieneVistasAlMar);

        //Variamos valores iniciales
        nombreCliente = "Pedro Perez";
        diasEstancia = 3;
        tarifaDiaria = 10.25;
        tieneVistasAlMar = false;

        System.out.println();
        System.out.println("*** Nuevos datos reserva ***");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistasAlMar = " + tieneVistasAlMar);
    }
}
