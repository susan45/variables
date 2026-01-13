

public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** Generador de Emails ***");

        //Variables.
        var nombre = " Ubaldo Acosta Soto ";
        var empresa = " Global Mentoring ";
        var dominio = ".com.mx";

        //*** Nombre ****
        //Limpiar los espacios en blanco del inicio y el final
        var nombreNormalizado = nombre.strip();
        //Reemplazamos espacios por puntos en el nombre.
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        //Pasamos a minusculas.
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("Nombre usuario: " + nombre);
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);

        //*** Empresa y Dominio ****
        //Limpiar los espacios en blanco del inicio y el final
        var empresaNormalizada = empresa.strip();
        //Reemplazamos espacios por todos unido en la empresa y pasamos a minusculas.
        empresaNormalizada = empresaNormalizada.replace(" ", ".").toLowerCase();
        System.out.println("\nNombre empresa: " + empresa);
        System.out.println("Extension del dominio: " + dominio);
        //Concatenamos empresa con dominio.
        var empresaDominio = "@" + empresaNormalizada.concat(dominio);
        System.out.println("Dominio de email normalizado: " + empresaDominio);

        //*** Email generado ***
        var nombreEmpresaDominio = nombreNormalizado + empresaDominio;
        System.out.println("\nEmail final generado: " + nombreEmpresaDominio);
    }
}
