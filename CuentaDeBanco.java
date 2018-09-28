# 2017030989
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentadebanco;
import java.util.Scanner;
/**
 *
 * @author software 19
 */
public class CuentaDeBancoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion, mes, dia, año, numeroCliente=1, edad=0, depositos=0;
        String nombre = null, domicilio, fechaNacimiento, fechaApertura, nombreSucursal;
        float saldo=1000, nsaldo=0, retiro=0;
        CuentaDeBanco cotizacion = new CuentaDeBanco();
            do
            {
                System.out.println("1. Dar de alta a un usuario");
                System.out.println("2. Depositar");
                System.out.println("3: Retiros");
                System.out.println("4. Consultar Cuenta");
                System.out.println("5. Salir");
                System.out.println("");
                System.out.print("Opcion: ");
                /*REGISTRO-SALIR*/
                opcion =in.nextInt();

                switch(opcion)
                {
                    case 1:
                        System.out.println("");
                        System.out.println("Dar de alta a un usuario");
                        System.out.println("Fecha: "+cotizacion.fechaConFormato());
                        System.out.println("Fecha de Nacimiento: ");
                        System.out.print("Dia de Nacimineto: ");
                        dia=in.nextInt();
                        cotizacion.fechaNacimientoCF();
                        System.out.print("Mes de Nacimiento: ");
                        mes=in.nextInt();
                        cotizacion.fechaNacimientoCF();
                        System.out.print("Año de Nacimiento: ");
                        año=in.nextInt();
                        cotizacion.fechaNacimientoCF();
                        cotizacion.setAñoN(año);
                        System.out.println("Edad: "+cotizacion.edad());
                        if(cotizacion.edad()>=18)
                        {
                            System.out.println("Numero de Cliente: "+numeroCliente);
                            numeroCliente=numeroCliente+1;
                            System.out.print("Nombre: ");
                            nombre=in.next();
                            cotizacion.setNombre(nombre);
                            System.out.print("Domicilio: ");
                            domicilio=in.next();
                            cotizacion.setDomicilio(domicilio);
                            System.out.print("Saldo: $"+saldo);
                            System.out.println("");
                            System.out.println("Fecha de Apertura: ");
                            System.out.print("Dia: ");
                            dia=in.nextInt();
                            cotizacion.fechaApertura();
                            System.out.print("Mes: ");
                            mes=in.nextInt();
                            cotizacion.fechaApertura();
                            System.out.print("Año: ");
                            año=in.nextInt();
                            cotizacion.fechaApertura();
                            System.out.print("Nombre de la Surcursal: ");
                            nombreSucursal=in.next();
                            cotizacion.setNomreSucursal(nombreSucursal);
                            System.out.println("");
                        }
                        else
                        {
                            System.out.println("");
                            System.out.println("No tiene la edad suficiente");
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Hacer Depositos");
                        /*System.out.println("Ingresa el numero de Cliente: ");
                        numeroCliente=in.nextInt();*/
                        System.out.println("Hola "+nombre+" su saldo es de: $"+saldo);
                        System.out.print("¿Cuanto desea depositar?: $");
                        nsaldo=in.nextFloat();
                        cotizacion.setNsaldo(nsaldo);
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println("Sus saldo nuevo es de $"+cotizacion.hacerDepositos());
                        saldo=cotizacion.hacerDepositos();
                        cotizacion.setSaldo(saldo);
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                         System.out.println("Hacer Retiros");
                        /*System.out.println("Ingresa el numero de Cliente: ");
                        numeroCliente=in.nextInt();*/
                        System.out.println("Hola "+nombre+" su saldo es de: $"+saldo);
                        System.out.print("¿Cuanto desea depositar?: $");
                        retiro=in.nextFloat();
                        cotizacion.setRetiro(retiro);
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println("Sus saldo nuevo es de $"+cotizacion.hacerRetiro());
                        saldo=cotizacion.hacerRetiro();
                        cotizacion.setSaldo(saldo);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("Fecha de Apertura: "+cotizacion.fechaApertura());
                        System.out.println("Numeto de Cliente: "+cotizacion.getNumeroCliente());
                        System.out.println("Nombre: "+cotizacion.getNombre());
                        System.out.println("Fecha de Nacimiento: "+cotizacion.fechaNacimientoCF());
                        System.out.println("Edad: "+cotizacion.edad());
                        System.out.println("Domicilio: "+cotizacion.getDomicilio());
                        System.out.println("Sucursal: "+cotizacion.getNombreSucursal());
                        System.out.println("Saldo: "+cotizacion.getSaldo());
                        System.out.println("");
                        break;
                    case 5:
                        break;
                }
            }while(opcion!=5);
    }
    
}
