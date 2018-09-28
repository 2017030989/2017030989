# 2017030989
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;
import java.util.Scanner;
/**
 *
 * @author software 19
 */
public class BoletoMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  nombre;
        int edad, numeroBoleto=1, numeroCliente=1, destino, opcion, costo = 0, tipoViaje,dia=0, mes=0, año=0;
        float precio, impuesto=0, total=0, totalConDescuento=0;
        Boletos Pasaje = new Boletos ();
        do
        {
            System.out.println("Que tipo de boleto se va a comprar?");
            System.out.println("[1] Sencillo");
            System.out.println("[2] Doble");
            System.out.println("[3] Salir");
            System.out.print("Opcion: ");
            tipoViaje=in.nextInt();
            Pasaje.setTipoViaje(tipoViaje);
/*********************************************************************************************/
            switch(tipoViaje)
            {
                case 1:
                    System.out.println("");
                    System.out.println("Fecha: "+Pasaje.fechaConFormato());
                    System.out.println("Numero de Cliente: "+numeroCliente);
                    numeroCliente=numeroCliente+1;
                    System.out.println("Numero de Boleto: "+numeroBoleto);
                    numeroBoleto=numeroBoleto+1;
                    System.out.print("Nombre: ");
                    nombre=in.next();
                    System.out.print("Edad: ");
                    edad=in.nextInt();
                    Pasaje.setEdad(edad);
                    Pasaje.setNombre(nombre);
                    System.out.println("Destino: ");
                    System.out.println("");
                    System.out.println("[1] Hermosillo, Sonora.");
                    System.out.println("[2] Guadalajara, Jalisco.");
                    System.out.println("[3] Tepic, Nayarit.");
                    System.out.println("[4] Culiacan, Sinaloa.");
                    System.out.println("[5] Tijuana, Baja California.");
                    System.out.println("");
                    System.out.print("Opcion: ");
                    
                        destino=in.nextInt();
                         Pasaje.setDestino(destino);
                        switch(destino)
                        {
                            case 1:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Hermosillo, Sonora");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");    
                                System.out.println("Costo: $"+Pasaje.precioDestino());
                                System.out.println("Subtotal: $"+Pasaje.precioDestino());
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());   
                                
                                break;
                            case 2:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Guadalajara, Jalisco");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino());
                                System.out.println("Subtotal: $"+Pasaje.precioDestino());
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());   
                                break;
                            case 3:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Tepic, Nayarit");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino());
                                System.out.println("Subtotal: $"+Pasaje.precioDestino());
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());   
                                break;
                            case 4:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Culiacan, Sinaloa");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino());
                                System.out.println("Subtotal: $"+Pasaje.precioDestino());
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());   
                                break;
                            case 5:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Tijuana, Baja California");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino());
                                System.out.println("Subtotal: $"+Pasaje.precioDestino());
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());   
                                break;
                                 default:
                                    System.out.println("No es una Opcion Valida");
                    }
                    break;
/*********************************************************************************************/
                case 2:
                    System.out.println("");
                    System.out.println("Fecha: "+Pasaje.fechaConFormato());
                    System.out.println("Numero de Cliente: "+numeroCliente);
                    numeroCliente=numeroCliente+1;
                    System.out.println("Numero de Boleto: "+numeroBoleto);/*Corregir*/
                    numeroBoleto=numeroBoleto+1;
                    System.out.print("Nombre: ");
                    nombre=in.next();
                    System.out.print("Edad: ");
                    edad=in.nextInt();
                    Pasaje.setEdad(edad);
                    Pasaje.setNombre(nombre);
                    System.out.println("Destino: ");
                    System.out.println("");
                    System.out.println("[1] Hermosillo, Sonora.");
                    System.out.println("[2] Guadalajara, Jalisco.");
                    System.out.println("[3] Tepic, Nayarit.");
                    System.out.println("[4] Culiacan, Sinaloa.");
                    System.out.println("[5] Tijuana, Baja California.");
                    System.out.println("");
                    System.out.print("Opcion: ");
                    
                        destino=in.nextInt();
                         Pasaje.setDestino(destino);
                        switch(destino)
                        {
                            case 1:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Hermosillo, Sonora");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Subtotal: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());     
                                break;
                            case 2:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Guadalajara, Jalisco");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Subtotal: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());   
                                break;
                           case 3:
                               System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Tepic, Nayarit");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Subtotal: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());  
                                break;
                            case 4:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Culiacan, Sinaloa");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Subtotal: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());  
                                break;
                            case 5:
                                System.out.println("");
                                destino=Pasaje.getDestino();
                                System.out.println("Destino: Tijuana, Baja California");
                                System.out.println("Fecha: "+Pasaje.fechaConFormato());
                                System.out.println("Nombre: "+nombre);
                                System.out.println("Edad: "+edad+" años");
                                System.out.println("Costo: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Subtotal: $"+Pasaje.precioDestino()*1.8);
                                System.out.println("Impuestos: $"+Pasaje.calcularImpuestos());
                                System.out.println("Total: $"+Pasaje.calcularTotal());  
                                break;
                                 default:
                                    System.out.println("No es una Opcion Valida");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("No es opcion valida");
            }
            System.out.println("Oprima cualquier tecla para seguir.");
            in.nextInt();
        }while(tipoViaje!=3);
    }
    
}
