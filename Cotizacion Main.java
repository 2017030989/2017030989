# 2017030989
*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion;
import java.util.Scanner;
/**
 *
 * @author software 19
 */
public class CotizacionMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion,numeroCotizacion=1,plazo = 0;
        String descripcion;
        float precio, porcentajePagoPrincipal;
            Cotizacion Cot = new Cotizacion ();
            do
            {
                System.out.println("Cotizacion");
                        System.out.println("");
                        System.out.println("Fecha: "+Cot.fechaConFormato());
                        System.out.println("Numero de Cotizacion: "+numeroCotizacion);
                        numeroCotizacion=numeroCotizacion+1;
                        System.out.print("Descripcion: ");
                        descripcion=in.next();
                        System.out.print("Precio: $");
                        precio=in.nextFloat();
                        System.out.print("Porcentaje de pago inicial(%): ");
                        porcentajePagoPrincipal=in.nextFloat();
                        Cot.setNumeroCotizacion(numeroCotizacion);
                        Cot.setDescripcion(descripcion);
                        Cot.setPrecio(precio);
                        Cot.setPorcentajePagoPrincipal(porcentajePagoPrincipal);
                        System.out.println("Plazo: ");
                        System.out.println("[1] 12 Meses");
                        System.out.println("[2] 24 Meses");
                        System.out.println("[3] 36 Meses");
                        System.out.println("[4] 48 Meses");
                        System.out.println("");
                        System.out.print("Opcion: ");
                        plazo=in.nextInt();
                        Cot.setPlazo(plazo);
                        switch(plazo)
                        {
                            case 1:
                                plazo=Cot.getPlazo();
                                System.out.println("El plazo es de 12 meses");
                                System.out.println("El pago mensual es de: $"+Cot.calcularPagoMensual());
                                System.out.println("Pago Inicial: $"+Cot.calcularPagoInicial());
                                System.out.println("Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                            case 2:
                                plazo=Cot.getPlazo();
                                System.out.println("El plazo es de 24 meses");
                                System.out.println("El pago mensual es de: $"+Cot.calcularPagoMensual());
                                System.out.println("Pago Inicial: $"+Cot.calcularPagoInicial());
                                System.out.println("Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                            case 3:
                                plazo=Cot.getPlazo();
                                System.out.println("El plazo es de 36 meses");
                                System.out.println("El pago mensual es de: $"+Cot.calcularPagoMensual());
                                System.out.println("Pago Inicial: $"+Cot.calcularPagoInicial());
                                System.out.println("Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                            case 4:
                                plazo=Cot.getPlazo();
                                System.out.println("El plazo es de 48 meses");
                                System.out.println("El pago mensual es de: $"+Cot.calcularPagoMensual());
                                System.out.println("Pago Inicial: $"+Cot.calcularPagoInicial());
                                System.out.println("Pago Final: $"+Cot.calcularPagoTotal());
                                break;
                        } 
                        System.out.println("");
                        System.out.println("Oprima cualquier tecla para seguir.");
                        in.nextInt();
            }while(plazo!=4);
      
    }
    
}
