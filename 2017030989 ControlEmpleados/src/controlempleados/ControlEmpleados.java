package controlempleados;

/**
 *
 * @author CarlosEduardoSànchezFlores INF4-4 2017030989
 */
public class ControlEmpleados 
{
    private int numEmpleado, sueldoBase, nivel, comision;
    private String nombre, domicilio;
    
    public ControlEmpleados()
    {
        numEmpleado=1;
        nombre=" ";
        domicilio=" ";
        sueldoBase=1;
        nivel=1;
        comision=1;
    }
    
    public ControlEmpleados(int nE, String n, String d, int sB, int nv, int c)
    {
        numEmpleado=nE;
        nombre=n;
        domicilio=d;
        sueldoBase=sB;
        nivel=nv;
        comision=c;
    }
    
    public ControlEmpleados(ControlEmpleados otro)
    {
        numEmpleado=otro.numEmpleado;
        nombre=otro.nombre;
        domicilio=otro.domicilio;
        sueldoBase=otro.sueldoBase;
        nivel=otro.nivel;
        comision=otro.comision;
    }
    
    public int getNumEmpleado()
    {
        return numEmpleado;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getDomicilio()
    {
        return domicilio;
    }
    
    public int getSueldoBase()
    {
        return sueldoBase;
    }
    
    public int getNivel()
    {
        return nivel;
    }
    
    public int getComision()
    {
        return comision;
    }
    
    public void setNumEmpleado(int numEmpleado)
    {
        this.numEmpleado=numEmpleado;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setDomicilio(String domicilio)
    {
        this.domicilio=domicilio;
    }
    
    public void setSueldoBase(int sueldoBase)
    {
        this.sueldoBase=sueldoBase;
    }
    
    public void setNivel(int nivel)
    {
        this.nivel=nivel;
    }
    
    public void setComision(int comision)
    {
        this.comision=comision;
    }
    
    public int pagoPorComision (int ventas)
    {
        int total=0;
        if (nivel == 1)
            total=(int) ((comision / 100)+(ventas * .02));
        else if(nivel==2)
            total=(int) ((comision / 100)+(ventas * .05));
        return total;
    }
    
    public int calcularBono()
    {
        int total=0;
        if (nivel == 1)
            total=(int) (sueldoBase*.05);
        else if(nivel==2)
            total=(int) (sueldoBase*.10);
        return total;
    }
    
    public int calcularPago(int ventas)
    {
        int total=0;
        total=calcularBono()+pagoPorComision(ventas)+sueldoBase;
        return total;
    }
}
