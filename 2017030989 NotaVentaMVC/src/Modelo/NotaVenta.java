package Modelo;

/**
 *
 * @author 2017030989
 */
public abstract class NotaVenta 
{
    protected int numero;
    protected String concepto;
    protected String fecha;
    protected int tipoPago;
    private int cantidad;
    protected Perecedero producto;


    public NotaVenta()
    {
        this.concepto = "";
        this.fecha = "01/01/2000";
        this.tipoPago = 1;
        this.numero = 0;
        this.producto = null;
        this.cantidad = 0;

    }

    public NotaVenta(int numero, int tipoPago, String fecha, String concepto, int cantidad, Perecedero producto)
    {
        this.concepto = concepto;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
        this.numero = numero;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String consepto) {
        this.concepto = consepto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Perecedero getProducto() {
        return producto;
    }

    public void setProducto(Perecedero producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public abstract float calcularPago();
}
