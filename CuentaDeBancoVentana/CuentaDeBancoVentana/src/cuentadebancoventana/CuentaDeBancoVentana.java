/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentadebancoventana;

/**
 *
 * @author Chayito
 */
public class CuentaDeBancoVentana {

    private String nombre;
    private String domicilio;
    private String fechaNacimiento;
    private int numeroCliente;
    private float saldo;
    private float nsaldo;
    private float retiro;
    private String fechaApertura;
    private String nombreSucursal;
    private int dia;
    private int mes;
    private int año;
    private int añoN;
    
    
    public CuentaDeBancoVentana()
    {
    //Constructor por omision
    String nombre=this.nombre;
    String domicilio=this.domicilio;
    String fechaNacimiento=this.fechaNacimiento;
    this.numeroCliente=1;
    this.saldo=1000;
    this.nsaldo=1;
    this.retiro=0;
    String fechaApertura=this.fechaApertura;
    String nombreSucursal=this.nombreSucursal;
    this.dia=22;
    this.mes=9;
    this.año=2018;
    this.añoN=1;
    }
    public CuentaDeBancoVentana(String n, String d, String fN,int nC, float s, float nSa, String fA, String nS, int dia, int m, int a, int aN, float r)
    {
        //Constructor con argumentos
        this.nombre=n;
        this.domicilio=d;
        this.fechaNacimiento=fN;
        this.numeroCliente=nC;
        this.saldo=s;
        this.nsaldo=nSa;
        this.fechaApertura=fA;
        this.nombreSucursal=nS;
        this.dia=dia;
        this.mes=m;
        this.año=a;
        this.añoN=aN;
        this.retiro=r;
    }
    public CuentaDeBancoVentana(CuentaDeBancoVentana otro)
    {
        //Constructor copia
        this.nombre=otro.nombre;
        this.domicilio=otro.domicilio;
        this.fechaNacimiento=otro.fechaNacimiento;
        this.numeroCliente=otro.numeroCliente;
        this.saldo=otro.saldo;
        this.nsaldo=otro.nsaldo;
        this.fechaApertura=otro.fechaApertura;
        this.nombreSucursal=otro.nombreSucursal;
        this.dia=otro.dia;
        this.mes=otro.mes;
        this.año=otro.año;
        this.añoN=otro.añoN;
        this.retiro=otro.retiro;
    }
/******************GET**************************************/
    public String getNombre()
    {
        return nombre;
    }
    public String getDomicilio()
    {
        return domicilio;
    }
    public String getFechaNacimiento()
    {
        return fechaNacimiento;
    }
    public int getNumeroCliente()
    {
        return numeroCliente;
    }
    public float getSaldo()
    {
        return saldo;
    }
    public String getFechaApertura()
    {
        return fechaApertura;
    }
    public String getNombreSucursal()
    {
        return nombreSucursal;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public float getNsaldo() {
        return nsaldo;
    }
    public int getAño() {
        return año;
    }
    public int getAñoN() {
        return año;
    }
    public float getRetiro() {
        return retiro;
    }
/********************SET*****************************/
    public void setAñoN(int añoN) {
        this.añoN = añoN;
    }   
    public void setNsaldo(float Nsaldo) {
        this.nsaldo = Nsaldo;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public void setDomicilio(String domicilio) 
    {
        this.domicilio = domicilio;
    }
    public void setFechaNacimiento(String fechaNacimiento) 
    {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNumeroCliente(int numeroCliente) 
    {
        this.numeroCliente = numeroCliente;
    }
    public void setSaldo(float saldo) 
    {
        this.saldo = saldo;
    }
    public void setFechaApertura(String fechaApertura) 
    {
        this.fechaApertura = fechaApertura;
    }
    public void setNomreSucursal(String nombreSucursal) 
    {
        this.nombreSucursal = nombreSucursal;
    }
    
/******************************************************************************/
    public String fechaConFormato()
    {
        return dia+"/"+mes+"/"+año;
    }
    public String fechaNacimientoCF()
    {
        return dia+"/"+mes+"/"+añoN;    
    }
    public String fechaApertura()
    {
        return dia+"/"+mes+"/"+año;    
    }
    public int edad()
    {
        int edad;
        edad=año-añoN;
        return edad;
    }
    public float hacerDepositos()
    {
        float depositos = 0;
        depositos=(float) (saldo+nsaldo);
        return depositos;
    }
    public float hacerRetiro ()
    {
        float saldoP=0;
        saldoP=(float)(saldo-retiro);
        return saldoP;
    }
}