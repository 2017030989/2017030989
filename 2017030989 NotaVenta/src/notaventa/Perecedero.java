package notaventa;

/**
 *
 * @author 2017030989 Sánchez Flores Carlos Eduardo
 */
public class Perecedero extends NotaVenta
{
    private float temperatura;
    private String fechaCaducidad;
    
    public Perecedero()
    {
        this.temperatura=0;
        this.fechaCaducidad="01-01-2000";
    }
    
    public Perecedero (float t, String fC)
    {
        this.temperatura=t;
        this.fechaCaducidad=fC;
    }

    public float getTemperatura() 
    {
        return temperatura;
    }

    public void setTemperatura(float temperatura) 
    {
        this.temperatura = temperatura;
    }

    public String getFechaCaducidad() 
    {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad)
    {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    
}
