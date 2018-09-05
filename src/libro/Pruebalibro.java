package libro;

public class Pruebalibro {
    public static void main(String[] args){
        //Relacion de dependencias
        Conjuntolibro biblioteca = new Conjuntolibro();
        //Dependencias
        Autor autor = new Autor("Gabriel", "Garcia");
        Libro libro = new Libro("Cien", 300, 8);
        boolean resultado = biblioteca.aniadirlibro(libro);
        if(resultado == true){
            System.out.println("Insercion satisfactoria");
        }else{
            System.out.println("Problemas para insertar el libro");
        }
    }
}
