package notaventa;

/**
 *
 * @author 2017030989 Sánchez Flores Carlos Eduardo
 */
public class Factura extends NotaVenta
{
    private int subTotal;
    private float iva;
    private String rfc, nombreCliente, domicilio, fechaF;
    
    public Factura ()
    {
        this.rfc="";
        this.nombreCliente="";
        this.domicilio="";
        this.fechaF="01-01-2000"; 
        this.subTotal=0;
        this.iva=0;
    }
    
    public Factura (String r, String nC, String d, String fF, int sT, float i)
    {
        this.rfc=r;
        this.nombreCliente=nC;
        this.domicilio=d;
        this.fechaF=fF; 
        this.subTotal=sT;
        this.iva=i;
    }

    public int getSubTotal() 
    {
        return subTotal;
    }

    public void setSubTotal(int subTotal) 
    {
        this.subTotal = subTotal;
    }

    public float getIva()
    {
        return iva;
    }

    public void setIva(float iva)
    {
        this.iva = iva;
    }

    public String getRfc() 
    {
        return rfc;
    }

    public void setRfc(String rfc)
    {
        this.rfc = rfc;
    }

    public String getNombreCliente() 
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public String getDomicilio() 
    {
        return domicilio;
    }

    public void setDomicilio(String domicilio) 
    {
        this.domicilio = domicilio;
    }

    public String getFechaF() 
    {
        return fechaF;
    }

    public void setFechaF(String fechaF) 
    {
        this.fechaF = fechaF;
    }
    
    public float calcularImpuestos()
    {
        return subTotal*iva;
    }
    
    public float calcularTotal()
    {
        return calcularImpuestos()+subTotal;
    }
}
