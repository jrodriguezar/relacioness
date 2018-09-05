package libro;

public class Libro {
    private String Titulo;
    private int NumPag;
    private int Calificacion;
    private Autor autor;

    public Libro(String Titulo, int NumPag, int Calificacion) {
        this.Titulo = Titulo;
        this.NumPag = NumPag;
        this.Calificacion = Calificacion;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public int getNumPag() {
        return this.NumPag;
    }

    public int getCalificacion() {
        return this.Calificacion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
