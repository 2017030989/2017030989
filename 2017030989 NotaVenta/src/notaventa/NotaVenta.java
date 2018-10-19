package notaventa;

/**
 *
 * @author 2017030989 Sánchez Flores Carlos Eduardo
 */
public class NotaVenta 
{
    protected int numeroNota;
    protected float cantidad, precio;
    protected String fecha, concepto, tipoPago;
    protected Perecedero producto;
    
    public NotaVenta()
    {
        this.numeroNota=1;
        this.fecha="01-01-2000";
        this.cantidad=1;
        this.concepto="";
        this.producto=null;
        this.precio=1;
        this.tipoPago="";
    }
    public NotaVenta(int nN, String f, float cant, String c, Perecedero p, float pr, String tP)
    {
        this.numeroNota=nN;
        this.fecha=f;
        this.cantidad=cant;
        this.concepto=c;
        this.producto=p;
        this.precio=pr;
        this.tipoPago=tP;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Perecedero getProducto() {
        return producto;
    }

    public void setProducto(Perecedero producto) {
        this.producto = producto;
    }
    
    public float calcularPago()
    {
        return precio*cantidad;
    }
}
