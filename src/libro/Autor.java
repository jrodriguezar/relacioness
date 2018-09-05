package libro;

public class Autor {
    private  String Nombre;
    private String Apeliido;

    public Autor(String Nombre, String Apeliido) {
        this.Nombre = Nombre;
        this.Apeliido = Apeliido;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getApeliido() {
        return this.Apeliido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApeliido(String Apeliido) {
        this.Apeliido = Apeliido;
    }
    
    
}
