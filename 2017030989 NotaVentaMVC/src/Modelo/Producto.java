package Modelo;

/**
 *
 * @author 2017030989
 */
public abstract class Producto 
{
    protected int idProducto;
    protected String nombreP;
    protected int unidad;
    protected float precio;


    public Producto()
    {
        this.idProducto = 0;
        this.nombreP = "";
        this.unidad = 1;
        this.precio = 0.00f;
    }

    public Producto(int idProducto, String nombreProd, int unidad, float precio)
    {
        this.idProducto = idProducto;
        this.nombreP = nombreProd;
        this.unidad = unidad;
        this.precio = precio;
    }



    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public abstract float calcularPrecio();
}
