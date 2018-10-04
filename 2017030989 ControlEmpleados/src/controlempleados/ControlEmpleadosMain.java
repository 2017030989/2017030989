package controlempleados;
import java.util.Scanner;
/**
 *
 * @author CarlosEduardoSànchezFlores INF4-4 2017030989
 */
public class ControlEmpleadosMain 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int numEmpleado, sueldoBase, nivel, comision, ventas;
        String nombre, domicilio;
        ControlEmpleados Aux = new ControlEmpleados();
         
         System.out.println("Capturar Informacion del Vendedor.");
         System.out.println("Numero de Empleado: ");
         numEmpleado=in.nextInt();
         System.out.println("Nombre: "); /*Sin espacio*/
         nombre=in.next();
         System.out.println("Domicilio: "); /*Sin espacio*/
         domicilio=in.next();
         System.out.println("Sueldo Base: ");
         sueldoBase=in.nextInt();
         System.out.println("Nivel: ");
         nivel=in.nextInt();
         System.out.println("Comision (%): ");
         comision=in.nextInt();
         System.out.println("Ventas: ");
         ventas=in.nextInt();
         Aux.setNumEmpleado(numEmpleado);
         Aux.setNombre(nombre);
         Aux.setDomicilio(domicilio);
         Aux.setNivel(nivel);
         Aux.setSueldoBase(sueldoBase);
         Aux.setComision(comision);
         Aux.pagoPorComision(ventas);
         System.out.println("Pago por comision: $"+Aux.pagoPorComision(ventas));
         System.out.println("Bono: $"+Aux.calcularBono());
         System.out.println("Pago Total: $"+Aux.calcularPago(ventas));
    }
}
