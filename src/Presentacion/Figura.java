package Presentacion;

public abstract class Figura {
    private String color, descripcion;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract int calcularArea();
    public abstract int calcularPerimetro();
    public abstract void reDibujar();
}