package notaventa;

/**
 *
 * @author 2017030989 Sánchez Flores Carlos Eduardo
 */
public class NoPerecedero extends Productos
{
    private String loteFabricacion;
    
    public NoPerecedero()
    {
        this.idProducto=1;
        this.nombre="";
        this.unidadProducto="";
        this.precioUnitario=1;
        this.loteFabricacion="01-01-2000";
    }
    public NoPerecedero(int iP, String n, String uP, float pU ,String lF)
    {
        this.idProducto=iP;
        this.nombre=n;
        this.unidadProducto=uP;
        this.precioUnitario=pU;
        this.loteFabricacion=lF;
    }
    
    public String getLoteFabricacion() {
        return loteFabricacion;
    }

    public void setLoteFabricacion(String loteFabricacion) {
        this.loteFabricacion = loteFabricacion;
    }
}
