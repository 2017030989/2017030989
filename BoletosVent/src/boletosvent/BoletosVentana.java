/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletosvent;

/**
 *
 * @author Chayito
 */
public class BoletosVentana
{
private String fecha;
    private int numeroBoleto;
    private int numeroCliente;
    private int destino;
    private int tipoViaje;
    private String nombre;
    private float precio;
    private int dia;
    private int mes;
    private int año;
    private int edad;
    
    public BoletosVentana()
    {
    //Constructor por omision
    this.numeroBoleto=0;
    this.numeroCliente=0;
    this.precio=1;
    String fecha = this.fecha;
    this.destino=1;
    int tipoViaje=this.tipoViaje;
    String nombre = this.nombre;
    this.dia=22;
    this.mes=9;
    this.año=2018;
    this.edad=1;
    }
    public BoletosVentana(String f, int nB, int nC, int d, int tV, float p, String n, int dia, int m, int a, int e)
    {
        //Constructor con argumentos
        this.fecha=f;
        this.numeroBoleto=nB;
        this.numeroCliente=nC;
        this.destino=d;
        this.tipoViaje=tV;
        this.precio=p;
        this.nombre=n;
        this.dia=dia;
        this.mes=m;
        this.año=a;
        this.edad=e;
    }
    public BoletosVentana(BoletosVentana otro)
    {
        //Constructor copia
        this.fecha=otro.fecha;
        this.numeroBoleto=otro.numeroBoleto;
        this.numeroCliente=otro.numeroCliente;
        this.destino=otro.destino;
        this.tipoViaje=otro.tipoViaje;
        this.precio=otro.precio;
        this.nombre=otro.nombre;
        this.dia=otro.dia;
        this.mes=otro.mes;
        this.año=otro.año;
        this.edad=otro.edad;
    }
 /*************GET**************************/   
    public String getFecha()
    {
        return fecha;
    }
    public int getNumeroBoleto()
    {
        return numeroBoleto;
    }
    public int getNumeroCliente()
    {
        return numeroCliente;
    }
    public int getDestino()
    {
        return destino;
    }
    public int getTipoViaje()
    {
        return tipoViaje;
    }
    public float getPrecio()
    {
        return precio;
    }
    public String getNombre()
    {
        return nombre;
    }
     public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getEdad() {
        return edad;
    }
    public int getAño() {
        return año;
    }
    
    /*************SET**************************/  
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }
    public void setNumeroBoleto(int numeroBoleto) 
    {
        this.numeroBoleto = numeroBoleto;
    }
    public void setNumeroCliente(int numeroCliente) 
    {
        this.numeroCliente = numeroCliente;
    }
    public void setDestino(int destino) 
    {
        this.destino = destino;
    }
    public void setTipoViaje(int tipoViaje) 
    {
        this.tipoViaje = tipoViaje;
    }
    public void setPrecio(float precio) 
    {
        this.precio = precio;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAño(int año) {
        this.año = año;
    }
 /*******************************************/
    public String fechaConFormato()
    {
        return dia+"/"+mes+"/"+año;
    }
     
    public float precioDestino()
    {
        int precioDestino=0;
        switch(destino)
        {
            case 1:
                precioDestino=950;
                break;
            case 2:
                precioDestino=1250;
                break;
            case 3:
                precioDestino=780;
                break;
            case 4:
                precioDestino=450;
                break;
            case 5:
                precioDestino=1500;
                break;
        }
        return precioDestino;
    }
    
    public float calcularImpuestos()
    {
        float impuestos=0;
        if(tipoViaje==1)
        {
            impuestos = (float) (precioDestino()*.16);
        }
        else if(tipoViaje==2)
        {
            impuestos = (float) (((precioDestino()*.16))*(1.8));
        }
        return impuestos;
    }
    
    public float calculaDescuento()
    {
        float descuento=0;
        descuento = (float) (calcularTotal()*.5);
        return descuento;
    }
    
    public float calcularTotal()
    {
        float total=0;
        if(tipoViaje==1)
        {
            if(edad>=60)
            {
               total = (float) ((calcularImpuestos()+precioDestino())*(.5));
            }
            else
            {
                total = (float) ((calcularImpuestos()+precioDestino()));
            } 
        }
        else if(tipoViaje==2)
        {
            if(edad>=60)
            {
               total = (float) (((calcularImpuestos()+ (precioDestino())*(1.8))*(.5))); 
            }
            else
            {
                total = (float) (calcularImpuestos() + precioDestino()*(1.8));
            } 
        }
        return total;
    }
    
}
    
