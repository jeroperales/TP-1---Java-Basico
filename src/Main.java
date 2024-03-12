import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // título, autor, año de publicación,
        //género y cant de páginas

        Scanner scan = new Scanner(System.in);
        String titulo = null;
        String autor = null;
        int publicacion = 0;
        String genero = null;
        int paginas = 0;



        Libro libro1 = new Libro(titulo, autor, publicacion, genero, paginas);
        libro1.leerLibro(libro1);

        Libro libro2 = new Libro(titulo, autor, publicacion, genero, paginas);
        libro2.leerLibro(libro2);

        Libro libro3 = new Libro(titulo, autor, publicacion, genero, paginas);
        libro3.leerLibro(libro3);

        libro1.mostrarLibro(libro1);
        libro2.mostrarLibro(libro2);
        libro3.mostrarLibro(libro3);
    }


}
