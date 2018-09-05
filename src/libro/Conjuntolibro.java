package libro;

public class Conjuntolibro {
    private Libro[] libro;

    public Conjuntolibro() {
        //Liberando la memoria maxima
        this.libro = new Libro[10];
    }
    
    public Libro[] getLibro() {
        return this.libro;
    }
    
    public boolean aniadirlibro(Libro nlibro){
        for(int i = 0; i < this.libro.length; i++){
            if(this.libro[i]==null){
                this.libro[i] = nlibro;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarlibrotitulo(Libro titulo){
        for(int i = 0; i < this.libro.length; i++){
            if(this.libro[i].getTitulo().equals(titulo)){
                this.libro[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarlibroautor(Autor autor){
        for(int i = 0; i < this.libro.length; i++){
            if(this.libro[i].getAutor().getNombre().equals(autor)){
                this.libro[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public Libro buscarmejorcalificado(){
        Libro mejor = null;
        for(int i = 0; i < this.libro.length; i++){
            if(i == 0){
                mejor = this.libro[i];
            }else{
                if(this.libro[i].getCalificacion() > mejor.getCalificacion()){
                    mejor = this.libro[i];
                }
            }
        }
        return mejor;
    }
    
    public Libro buscarmenorcalificado(){
        Libro menor = null;
        for(int i = 0; i < this.libro.length; i++){
            if(i == 0){
                menor = this.libro[i];
            }else{
                if(this.libro[i].getCalificacion() < menor.getCalificacion()){
                    menor = this.libro[i];
                }
            }
        }
        return menor;
    }
    
}
