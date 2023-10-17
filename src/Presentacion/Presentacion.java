/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;

public class Presentacion {
    public static void main(String[] args) {
        Figura[] listado = new Figura[2];
        listado[0] = new Triangulo();
        listado[1] = new Cuadrilatero();

        for (int pos = 0; pos < listado.length; pos++) {
            System.out.println("Figura " + (pos + 1));
            listado[pos].calcularArea();
            listado[pos].calcularPerimetro();
            System.out.println();
        }
    }
}   