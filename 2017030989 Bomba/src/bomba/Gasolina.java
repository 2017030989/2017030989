/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomba;

/**
 *
 * @author Chayito
 */
public class Gasolina 
{
    private int idGasolina, tipo;
    private float precioBase;
    private String marca;
    
    public Gasolina ()
    {
        idGasolina=1;
        tipo=1;
        precioBase=15; 
        marca=" ";
    }
    
    public Gasolina (int iG, int t, float pB, String m)
    {
        idGasolina=iG;
        tipo=t;
        precioBase=pB; 
        marca=m;
    }
    
    public Gasolina (Gasolina otro)
    {
        this.idGasolina=otro.idGasolina;
        this.tipo=otro.tipo;
        this.precioBase=otro.precioBase; 
        this.marca=otro.marca;
    }
    
     public int getIdGasolina()
    {
        return idGasolina;
    }
     
    public int getTipo()
    {
        return tipo;
    }
    
     public float getPrecioBase()
    {
        return precioBase;
    }
     
      public String getMarca()
    {
        return marca;
    }
      
      public void setIdGasolina (int idGasolina)
    {
        this.idGasolina=idGasolina;
    }
      
      public void setTipo (int tipo)
    {
        this.tipo=tipo;
    }
      
      public void setPrecioBase (float precioBase)
    {
        this.precioBase=precioBase;
    }
      
      public void setMarca(String marca)
    {
        this.marca=marca;
    }
      
      public int calcularPrecio()
      {
          float t = 0.0f;
          if(getTipo()==1)
          {
              t=0.1f;
          }
          else if (getTipo()==2)
          {
              t=0.2f;
          }
          else if(getTipo()==3)
          {
              t=0.25f;
          }
          return (int) (getPrecioBase() + getPrecioBase()* t);
      }
}
