/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletosvent;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Eduardo Sánchez Flores 2017030989
 */
public class BoletosVentanaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
        String  nombre;
        int edad=0, numeroBoleto=1, numeroCliente=1, destino, opcion, costo = 0, tipoViaje,dia=0, mes=0, año=0;
        float precio, impuesto=0, total=0, totalConDescuento=0;
        BoletosVentana Pasaje = new BoletosVentana ();
        Object menu [] = {"1. Sencillo","2. Doble", "3. Salir"};
        Object subMenu []= {"1. Hermosillo, Sonora", "2. Guadalajara, Jalisco", "3.Tepic, Nayarit", "4. Culiacan, Sinaloa", "5. Tijuana, Baja California"};
        String opcMenu = "";
        String opcSubMenu ="";
        do
        {
            
            opcMenu = (String) JOptionPane.showInputDialog(null, "Elige un opcion", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            tipoViaje=in.nextInt();
            Pasaje.setTipoViaje(tipoViaje);
/*********************************************************************************************/
            switch((String)(opcMenu))
            {
                case (String)"1. Sencillo":
                    JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                    JOptionPane.showMessageDialog(null,"Numero de Cliente: "+numeroCliente);  
                    numeroCliente=numeroCliente+1;
                    JOptionPane.showMessageDialog(null,"Numero de Boleto: "+numeroBoleto); 
                    numeroBoleto=numeroBoleto+1;
                    nombre=(JOptionPane.showInputDialog(null, "Dame tu nombre", "Boletos",JOptionPane.QUESTION_MESSAGE));
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu edad", "Boletos", JOptionPane.QUESTION_MESSAGE));
                    Pasaje.setEdad(edad);
                    Pasaje.setNombre(nombre);
                    opcSubMenu = (String) JOptionPane.showInputDialog(null, "Elige un destino", "Menu", JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]); 
                    /*destino=in.nextInt();
                    Pasaje.setDestino(destino);*/
                        switch((String)(opcSubMenu))
                        {
                            case (String)"1. Hermosillo, Sonora":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Hermosillo, Sonora");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());   
                                break;
                            case (String)"2. Guadalajara, Jalisco":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Guadalajara, Jalisco");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());   
                                break;
                            case (String)"3.Tepic, Nayarit":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Tepic, Nayarit");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());  
                                break;
                            case (String)"4. Culiacan, Sinaloa":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Culiacan, Sinaloa");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());  
                                break;
                            case (String)"5. Tijuana, Baja California":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Tijuana, Baja California");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino());
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());  
                                break;
                                 default:
                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
/*********************************************************************************************/
                case (String)"2. Doble":
                    JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                    JOptionPane.showMessageDialog(null,"Numero de Cliente: "+numeroCliente);  
                    numeroCliente=numeroCliente+1;
                    JOptionPane.showMessageDialog(null,"Numero de Boleto: "+numeroBoleto); 
                    numeroBoleto=numeroBoleto+1;
                    nombre=(JOptionPane.showInputDialog(null, "Dame tu nombre", "Boletos",JOptionPane.QUESTION_MESSAGE));
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu edad", "Boletos", JOptionPane.QUESTION_MESSAGE));
                    Pasaje.setEdad(edad);
                    Pasaje.setNombre(nombre);
                    opcSubMenu = (String) JOptionPane.showInputDialog(null, "Elige un destino", "Menu", JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]); 
                    /*destino=in.nextInt();
                    Pasaje.setDestino(destino);*/

                            switch((String)(opcSubMenu))
                        {
                            case (String)"1. Hermosillo, Sonora":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Hermosillo, Sonora");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());   
                                break;
                            case (String)"2. Guadalajara, Jalisco":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Guadalajara, Jalisco");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());   
                                break;
                            case (String)"3.Tepic, Nayarit":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Tepic, Nayarit");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());  
                                break;
                            case (String)"4. Culiacan, Sinaloa":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Culiacan, Sinaloa");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());  
                                break;
                            case (String)"5. Tijuana, Baja California":
                                destino=Pasaje.getDestino();
                                JOptionPane.showMessageDialog(null,"Destino: Tijuana, Baja California");
                                JOptionPane.showMessageDialog(null,"Fecha: "+Pasaje.fechaConFormato());
                                JOptionPane.showMessageDialog(null,"Nombre: "+nombre);
                                JOptionPane.showMessageDialog(null,"Edad: "+edad+" años");
                                JOptionPane.showMessageDialog(null,"Costo: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Subtotal: $"+Pasaje.precioDestino()*1.8);
                                JOptionPane.showMessageDialog(null,"Impuestos: $"+Pasaje.calcularImpuestos());
                                JOptionPane.showMessageDialog(null,"Total: $"+Pasaje.calcularTotal());  
                                break;
                                 default:
                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case (String)"3. Salir":
                 JOptionPane.showMessageDialog(null, "Salir...");
               break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(!opcMenu.equals("Salir"));
    }
    
}
