package Modelo;

/**
 *
 * @author 2017030989
 */
public class Factura extends NotaVenta
{
    private String nombre;
    private String rfc;
    private String domicilio;
    private String fechaF;
    private int iva;



    public Factura()
    {
        super();
        this.nombre="";
        this.rfc="";
        this.domicilio="";
        this.fechaF="";
        this.iva=0;
    }

    public Factura(int numero, String fecha, String consepto, int tipoPago, Perecedero perecedero, int cantidad, String nombre, String rfc, String domicilio, String fechaF, int iva)
    {
        super(numero, tipoPago, fecha, consepto, cantidad, perecedero);
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setFechaF(fechaF);
        this.setIva(iva);
        this.setRfc(rfc);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaFac) {
        this.fechaF = fechaFac;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }
    
    @Override
    public float calcularPago() 
    {
        float total = 0.00f;
        total=super.getProducto().calcularPrecio() * super.getCantidad();
        return total;

    }

    public float calcularImpuesto()
    {
        float total = 0.00f;
        total=(calcularPago() * getIva()/100);
        return total;
    }

    public float calcularTotal()
    {
        float total = 0.00f;
        total=calcularImpuesto() + calcularPago();
        return total;
    }

}
