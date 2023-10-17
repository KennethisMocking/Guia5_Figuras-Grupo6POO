package Presentacion;
import javax.swing.JOptionPane;
public class Cuadrilatero extends Figura{
    Punto2D vertices[];
    int aux, px,py;
    String titulo;
    public Cuadrilatero(){
        vertices = new Punto2D[4];
        for(int conta=0;conta<4;conta++){
            aux =conta+1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada X del vertice "+aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Cuadrilatero - Digite coordenada Y del vertice "+aux));
            vertices[conta]= new Punto2D(px,py);
        }
    }
    @Override
    public int calcularArea() {
      // En construcción código para calcular área de cuadrilatero
       return 2;
    }
    
    @Override
    public int calcularPerimetro() {
    // En construcción código para calcular perimetro de cuadrilatero
       return 1;
    }
    public void setColor(int idColor){
        // implementación de mi código 
    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
