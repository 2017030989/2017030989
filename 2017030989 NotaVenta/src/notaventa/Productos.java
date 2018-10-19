package notaventa;

/**
 *
 * @author 2017030989 Sánchez Flores Carlos Eduardo
 */
public class Productos 
{
    protected int idProducto;
    protected float precioUnitario;
    protected String nombre, unidadProducto;
    
    public Productos ()
    {
        this.idProducto=0;
        this.nombre="";
        this.unidadProducto="";
        this.precioUnitario=0;
    }
    
    public Productos (int iP, String n, String uP, float pU)
    {
        this.idProducto=iP;
        this.nombre=n;
        this.unidadProducto=uP;
        this.precioUnitario=pU;
    }

    public int getIdProducto() 
    {
        return idProducto;
    }

    public void setIdProducto(int idProducto)
    {
        this.idProducto = idProducto;
    }

    public String getUnidadProducto() 
    {
        return unidadProducto;
    }

    public void setUnidadProducto(String unidadProducto)
    {
        this.unidadProducto = unidadProducto;
    }

    public float getPrecioUnitario()
    {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario)
    {
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public float calcularProducto(String producto)
    {
        if(producto.equals("Perecedero"))
        {
            if(getUnidadProducto().equals("Kilogramos"))
            {
                return (getPrecioUnitario()*(float)1.03)*(float)1.5;
            }
            else if(getUnidadProducto().equals("Litros"))
            {
                return (getPrecioUnitario()*(float)1.05)*(float)1.5;
            }
            else
            {
                return (getPrecioUnitario()*(float)1.04)*(float)1.5;
            }
        }
        else //No Perecedero
        {
            return getPrecioUnitario()*(float)1.5;
        }
        
    } 
   
}
