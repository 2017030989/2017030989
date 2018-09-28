# 2017030989
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion;

/**
 *
 * @author Chayito
 */
public class Cotizacion {

    private int numeroCotizacion;
    private String descripcion;
    private float precio;
    private float porcentajePagoPrincipal;
    private int plazo;
    private int dia;
    private int mes;
    private int año;
    
    public Cotizacion()
    {
    //Constructor por omision
    this.numeroCotizacion=1;
    String descripcion = this.descripcion;
    this.precio=0;
    this.porcentajePagoPrincipal=0;
    this.plazo=0;
    this.dia=22;
    this.mes=9;
    this.año=2018;
    }
    public Cotizacion(int nC, String d, float p, float pPP, int pl, int dia, int m, int a)
    {
        //Constructor con argumentos
        this.numeroCotizacion=nC;
        this.descripcion=d;
        this.precio=p;
        this.porcentajePagoPrincipal=pPP;
        this.plazo=pl;
        this.dia=dia;
        this.mes=m;
        this.año=a;
    }
    public Cotizacion(Cotizacion otro)
    {
        //Constructor copia
        this.numeroCotizacion=otro.numeroCotizacion;
        this.descripcion=otro.descripcion;
        this.precio=otro.precio;
        this.porcentajePagoPrincipal=otro.porcentajePagoPrincipal;
        this.plazo=otro.plazo;
        this.dia=otro.dia;
        this.mes=otro.mes;
        this.año=otro.año;
    }
    /***************GET******************************/
    public int getNumeroCotizacion()
    {
        return numeroCotizacion;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public float getPrecio()
    {
        return precio;
    }
    public float getPorcentajePagoPrincipal()
    {
        return porcentajePagoPrincipal;
    }
    public int getPlazo()
    {
        return plazo;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
/*************SET**********************/
    public void setNumeroCotizacion(int numeroCotizacion) 
    {
        this.numeroCotizacion = numeroCotizacion;
    }
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    public void setPrecio(float precio) 
    {
        this.precio = precio;
    }
    public void setPorcentajePagoPrincipal(float porcentajePagoPrincipal) 
    {
        this.porcentajePagoPrincipal = porcentajePagoPrincipal;
    }
    public void setPlazo(int plazo) 
    {
        this.plazo = plazo;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setAño(int año) {
        this.año = año;
    }
/********************************************************/
    
    public String fechaConFormato()
    {
        return dia+"/"+mes+"/"+año;
    }
    
    public float calcularPagoInicial()
    {
        float pagoInicial;
        pagoInicial=(float)(precio*porcentajePagoPrincipal)/(100);
        return pagoInicial;
    }
    
    public float calcularPagoTotal()
    {
        float pagoTotal=0;
        pagoTotal= precio-calcularPagoInicial();
        return pagoTotal;
    }
    
    public float calcularPagoMensual()
    {
        float pagoMensual=0;
        switch(plazo)
        {
            case 1:
                pagoMensual=(float)(calcularPagoTotal())/(12);
                break;
            case 2:
                 pagoMensual=(float)(calcularPagoTotal())/(24);
                break;
            case 3:
                 pagoMensual=(float)(calcularPagoTotal())/(36);
                break;
            case 4:
                 pagoMensual=(float)(calcularPagoTotal())/(48);
                break;
        }
        return pagoMensual;
    }
}
