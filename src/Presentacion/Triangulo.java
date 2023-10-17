package Presentacion;
import javax.swing.JOptionPane;

public class Triangulo extends Figura {
    Punto2D vertices[];
    int aux, px, py;
    
    public Triangulo() {
        vertices = new Punto2D[3];
        for (int conta = 0; conta < 3; conta++) {
            aux = conta + 1;
            px = Integer.parseInt(JOptionPane.showInputDialog("Triángulo - Digite coordenada X del vértice " + aux));
            py = Integer.parseInt(JOptionPane.showInputDialog("Triángulo - Digite coordenada Y del vértice " + aux));
            vertices[conta] = new Punto2D(px, py);
        }
    }

    @Override
    public int calcularArea() {
        double area, A, B, C, S;
        A = Math.sqrt(Math.pow((vertices[1].getX() - vertices[0].getX()), 2)
                + Math.pow((vertices[1].getY() - vertices[0].getY()), 2));
        B = Math.sqrt(Math.pow((vertices[2].getX() - vertices[1].getX()), 2)
                + Math.pow((vertices[2].getY() - vertices[1].getY()), 2));
        C = Math.sqrt(Math.pow((vertices[0].getX() - vertices[2].getX()), 2)
                + Math.pow((vertices[0].getY() - vertices[2].getY()), 2));
        S = (A + B + C) / 2;
        area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
        System.out.println("Área =" + area);
        return (int) area;
    }

    @Override
    public int calcularPerimetro() {
        double perimetro, A, B, C;
        A = Math.sqrt(Math.pow((vertices[1].getX() - vertices[0].getX()), 2)
                + Math.pow((vertices[1].getY() - vertices[0].getY()), 2));
        B = Math.sqrt(Math.pow((vertices[2].getX() - vertices[1].getX()), 2)
                + Math.pow((vertices[2].getY() - vertices[1].getY()), 2));
        C = Math.sqrt(Math.pow((vertices[0].getX() - vertices[2].getX()), 2)
                + Math.pow((vertices[0].getY() - vertices[2].getY()), 2));
        perimetro = A + B + C;
        System.out.println("Perímetro =" + perimetro);
        return (int) perimetro;
    }

    @Override
    public void reDibujar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}