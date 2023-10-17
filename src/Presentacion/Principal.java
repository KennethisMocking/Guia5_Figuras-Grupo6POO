package Presentacion;
public class Principal {
    Figura listado[];
    public Principal() {
        listado = new Figura[2];
        listado[0]= new Triangulo();
        listado[1]= new Cuadrilatero();
        for(int pos=0;pos<1;pos++){
            listado[pos].calcularArea();
            listado[pos].calcularPerimetro();
        }
    }
    public static void main(String args[]){
        Principal solucion= new Principal();
    }
}
