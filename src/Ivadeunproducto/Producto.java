package Ivadeunproducto;

public class Producto {

    public String nombre;
    public double precio;
    public String codigo;
    public int cantidad;
    public double total;
    public double iva;

    public int CantidadTotal() {

        return 0;
    }

    public double ValorApagar() {
        iva = precio * 0.19;
        total = (precio + iva) * cantidad;

        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    

}
