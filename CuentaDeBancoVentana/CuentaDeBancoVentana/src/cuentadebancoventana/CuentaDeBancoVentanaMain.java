/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentadebancoventana;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author software 19
 */
public class CuentaDeBancoVentanaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion, mes, dia, año, numeroCliente=1, edad=0, depositos=0;
        String nombre = null, domicilio, fechaNacimiento, fechaApertura, nombreSucursal;
        float saldo=1000, nsaldo=0, retiro=0;
        Object menu [] = {"1. Dar de alta a un usuario", "2. Depositar", "3. Retiros", "4. Consultar Cuentas", "5. Salir"};
        String opcMenu="";
        CuentaDeBancoVentana cotizacion = new CuentaDeBancoVentana();
            do
            {
                opcMenu = (String) JOptionPane.showInputDialog(null, "Elige un opcion", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
                /*REGISTRO-SALIR*/
                opcion =in.nextInt();

                switch((String)(opcMenu))
                {
                    case (String)"1. Dar de alta a un usuario":
                        JOptionPane.showInputDialog(null, "Dar de alta a un usuario");
                        JOptionPane.showInputDialog(null, "Fecha: "+cotizacion.fechaConFormato());
                        JOptionPane.showInputDialog(null, "Fecha de Nacimiento: ");
                        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el dia","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                        mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el mes","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                        año = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el año","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                        cotizacion.fechaNacimientoCF();    
                        cotizacion.fechaNacimientoCF();
                        cotizacion.fechaNacimientoCF();
                        cotizacion.setAñoN(año);
                        JOptionPane.showMessageDialog(null, "Edad: "+cotizacion.edad());
                        if(cotizacion.edad()>=18)
                        {
                            JOptionPane.showMessageDialog(null, "Numero de Cliente: "+numeroCliente);
                            numeroCliente=numeroCliente+1;
                            nombre=(JOptionPane.showInputDialog(null,"Dame el nombre","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                            cotizacion.setNombre(nombre);
                            domicilio=(JOptionPane.showInputDialog(null,"Dame el domicilio","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                            cotizacion.setDomicilio(domicilio);
                            JOptionPane.showMessageDialog(null, "Saldo: $"+saldo);
                            JOptionPane.showMessageDialog(null, "Fecha de Apertura: ");    
                            dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el dia","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                            mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el mes","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                            año = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el año","Cuenta de banco",JOptionPane.QUESTION_MESSAGE));
                            cotizacion.fechaApertura();                            
                            cotizacion.fechaApertura();                   
                            cotizacion.fechaApertura();
                            nombreSucursal=(JOptionPane.showInputDialog(null,"Dame el nombre de las sucursal", "Cuenta de Banco", JOptionPane.QUESTION_MESSAGE));
                            cotizacion.setNomreSucursal(nombreSucursal);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "No puede crear cuenta");
                        }
                        break;
                    case (String)"2. Depositar":
                        JOptionPane.showMessageDialog(null,"Hacer Depositos");
                        JOptionPane.showMessageDialog(null, "Hola "+nombre+" su saldo es de: $"+saldo);
                        JOptionPane.showMessageDialog(null,"¿Cuanto desea depositar?: $");
                        nsaldo=Float.parseFloat(JOptionPane.showInputDialog(null,"Deposito: ","Cuenta de Banco",JOptionPane.QUESTION_MESSAGE));
                        cotizacion.setNsaldo(nsaldo);
                        JOptionPane.showMessageDialog(null, "Sus saldo nuevo es de $"+cotizacion.hacerDepositos());
                        saldo=cotizacion.hacerDepositos();
                        cotizacion.setSaldo(saldo);
                        break;
                    case (String)"3. Retiros":
                        JOptionPane.showMessageDialog(null,"Hacer Retiros");
                        JOptionPane.showMessageDialog(null, "Hola "+nombre+" su saldo es de: $"+saldo);
                        retiro=Float.parseFloat(JOptionPane.showInputDialog(null,"Retiro: ", "Cuenta de Banco", JOptionPane.QUESTION_MESSAGE));
                        cotizacion.setRetiro(retiro);
                        JOptionPane.showMessageDialog(null, "Sus saldo nuevo es de $"+cotizacion.hacerRetiro());
                        saldo=cotizacion.hacerRetiro();
                        cotizacion.setSaldo(saldo);
                        break;
                    case (String)"4. Consultar Cuentas":
                        JOptionPane.showMessageDialog(null,"Fecha de Apertura: "+cotizacion.fechaApertura());
                        JOptionPane.showMessageDialog(null,"Numeto de Cliente: "+cotizacion.getNumeroCliente());
                        JOptionPane.showMessageDialog(null,"Nombre: "+cotizacion.getNombre());
                        JOptionPane.showMessageDialog(null,"Fecha de Nacimiento: "+cotizacion.fechaNacimientoCF());
                        JOptionPane.showMessageDialog(null,"Edad: "+cotizacion.edad());
                        JOptionPane.showMessageDialog(null,"Domicilio: "+cotizacion.getDomicilio());
                        JOptionPane.showMessageDialog(null,"Sucursal: "+cotizacion.getNombreSucursal());
                        JOptionPane.showMessageDialog(null,"Saldo: "+cotizacion.getSaldo()); 
                        break;
                    case (String)"5. Salir":
                        JOptionPane.showMessageDialog(null, "Salir...");
                        break;
                }
            }while(!opcMenu.equals("Salir"));
    }
    
}