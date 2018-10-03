/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacionventana;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Chayito
 */
public class CotizacionVentanaMain 
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion,numeroCotizacion=1,plazo = 0;
        String descripcion;
        float precio, porcentajePagoPrincipal;
        Object menu [] ={"[1] 12 Meses", "[2] 24 Meses", "[3] 36 Meses", "[4] 48 Meses"};
        String opcMenu="";
            CotizacionVentana Cot = new CotizacionVentana ();
            do
            {
                        JOptionPane.showMessageDialog(null,"La fecha es"+Cot.fechaConFormato());
                        JOptionPane.showMessageDialog(null,"Numero de Cotizacion: "+numeroCotizacion);
                        numeroCotizacion=numeroCotizacion+1;
                        descripcion = (JOptionPane.showInputDialog(null,"Dame la descripcion","Cotizacion",JOptionPane.QUESTION_MESSAGE));
                        precio = Float.parseFloat(JOptionPane.showInputDialog(null,"Dame el precio","Cotizacion",JOptionPane.QUESTION_MESSAGE));
                        porcentajePagoPrincipal = Float.parseFloat(JOptionPane.showInputDialog(null,"Dame el porcentaje de Pago Principal","Cotizacion",JOptionPane.QUESTION_MESSAGE));
                        Cot.setNumeroCotizacion(numeroCotizacion);
                        Cot.setDescripcion(descripcion);
                        Cot.setPrecio(precio);
                        Cot.setPorcentajePagoPrincipal(porcentajePagoPrincipal);
                        opcMenu = (String) JOptionPane.showInputDialog(null, "Elige un plazo", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
                        plazo=in.nextInt();
                        Cot.setPlazo(plazo);
                        switch((String)(opcMenu))
                        {
                            case (String)"[1] 12 Meses":
                                plazo=Cot.getPlazo();
                                JOptionPane.showMessageDialog(null,"El plazo es de 12 meses");
                                JOptionPane.showMessageDialog(null,"El pago mensual es de: $"+Cot.calcularPagoMensual());
                                JOptionPane.showMessageDialog(null,"Pago Inicial: $"+Cot.calcularPagoInicial());
                                JOptionPane.showMessageDialog(null,"Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                            case (String)"[2] 24 Meses":
                                plazo=Cot.getPlazo();
                                JOptionPane.showMessageDialog(null,"El plazo es de 24 meses");
                                JOptionPane.showMessageDialog(null,"El pago mensual es de: $"+Cot.calcularPagoMensual());
                                JOptionPane.showMessageDialog(null,"Pago Inicial: $"+Cot.calcularPagoInicial());
                                JOptionPane.showMessageDialog(null,"Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                            case (String)"[3] 36 Meses":
                                plazo=Cot.getPlazo();
                                JOptionPane.showMessageDialog(null,"El plazo es de 36 meses");
                                JOptionPane.showMessageDialog(null,"El pago mensual es de: $"+Cot.calcularPagoMensual());
                                JOptionPane.showMessageDialog(null,"Pago Inicial: $"+Cot.calcularPagoInicial());
                                JOptionPane.showMessageDialog(null,"Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                            case (String)"[4] 48 Meses":
                                plazo=Cot.getPlazo();
                                JOptionPane.showMessageDialog(null,"El plazo es de 48 meses");
                                JOptionPane.showMessageDialog(null,"El pago mensual es de: $"+Cot.calcularPagoMensual());
                                JOptionPane.showMessageDialog(null,"Pago Inicial: $"+Cot.calcularPagoInicial());
                                JOptionPane.showMessageDialog(null,"Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                        } 
                        JOptionPane.showMessageDialog(null, "Oprima cualquier tecla");
                        in.nextInt();
            }while(!opcMenu.equals("Salir"));
      
    }
    
}
    
