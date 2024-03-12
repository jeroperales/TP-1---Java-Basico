import java.util.Scanner;

public class Libro {
    // título, autor, año de publicación,
    //género y cant de páginas
     private String titulo;
     private String autor;
     private int publicacion;
     private String genero;
     private int cantDePaginas;

    public Libro(String titulo, String autor, int publicaciòn, String genero, int cantDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicaciòn;
        this.genero = genero;
        this.cantDePaginas = cantDePaginas;
    }

    public void mostrarLibro(Libro libro){
        System.out.println("Titulo: " + libro.titulo);
        System.out.println("Autor: " + libro.autor);
        System.out.println("Fecha publicacion: " + libro.publicacion);
        System.out.println("Genero: " + libro.genero);
        System.out.println("Paginas: " + libro.cantDePaginas);
        System.out.println("\n");
    }

    public void leerLibro(Libro libro){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa titulo: ");
        libro.titulo = scan.next();
        System.out.println("Ingresa autor: ");
        libro.autor = scan.next();
        System.out.println("Ingresa fecha de publicacion: ");
        libro.publicacion = scan.nextInt();
        System.out.println("Ingresa genero: ");
        genero = scan.next();
        System.out.println("Ingresa paginas: ");
        libro.cantDePaginas = scan.nextInt();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublicaciòn() {
        return publicacion;
    }

    public void setPublicaciòn(int publicaciòn) {
        this.publicacion = publicaciòn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantDePaginas() {
        return cantDePaginas;
    }

    public void setCantDePaginas(int cantDePaginas) {
        this.cantDePaginas = cantDePaginas;
    }
}
