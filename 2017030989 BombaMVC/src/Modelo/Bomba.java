package Modelo;

/**
 *
 * @author 2017030989
 */
public class Bomba 
{
     private int numBomba, capacidad, litrosVendidos;
    private Gasolina tGasolina;
    
    public Bomba ()
    {
        this.numBomba=1;
        this.capacidad=1000;
        this.litrosVendidos=0;
        this.tGasolina = new Gasolina();;
    }
    
    public Bomba (int nB, int c, int lV, Gasolina tG)
    {
        numBomba=nB;
        capacidad=c;
        litrosVendidos=lV;
        tGasolina=tG;
    }
    
    public Bomba (Bomba otro)
    {
        this.numBomba=otro.numBomba;
        this.capacidad=otro.capacidad;
        this.litrosVendidos=otro.litrosVendidos;
        this.tGasolina=otro.tGasolina;
    }
    
    public int getNumBomba()
    {
        return numBomba;
    }
    
    public int getCapacidad()
    {
        return capacidad;
    }
    
    public int getLitrosVendidos()
    {
        return litrosVendidos;
    }
    
    public Gasolina getTGasolina()
    {
        return tGasolina;
    }
    
    
    public void setNumBomba (int numBomba)
    {
        this.numBomba=numBomba;
    }
    
    public void setCapacidad (int capacidad)
    {
        this.capacidad=capacidad;
    }
    public void setLitrosVendidos (int litrosVendidos)
    {
        this.litrosVendidos=litrosVendidos;
    }
    
    public void setTGasolina(Gasolina tGasolina)
    {
        this.tGasolina=tGasolina;
    }
    
    public void iniciarBomba ()
    {
        litrosVendidos=0;
    }
    public int revisarInventario()
    {
        return getCapacidad() - getLitrosVendidos();
    }
    Gasolina Aux = new Gasolina();
    
    public int realizarVenta (int litrosV)
    {
        if(revisarInventario() >= litrosV)
        {
            setLitrosVendidos(getLitrosVendidos()+litrosV);
            return getTGasolina().calcularPrecio()*litrosV;
        }
        else
            return 0;
    }
    public int calcularVentaTotal()
    {
       return getLitrosVendidos()*getTGasolina().calcularPrecio(); 
    }
}
