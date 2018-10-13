package bomba;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chayito
 */
public class BombaMain 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Gasolina Aux2 = new Gasolina();
        Bomba Aux = new Bomba();
        Object menu[]={"[1] Iniciar Bomba","[2] Hacer Venta","[3] Revisar Inventario","[4] Total Venta","[5] Salir"};
        int idGasolina, tipo, precioBase, numBomba, capacidad, litros;
        String marca, opcMenu=" ";
        do
        {
            
            opcMenu=(String)JOptionPane.showInputDialog(null, "Elige una opcion", "Menu",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch((String)(opcMenu))
            {
                case (String)"[1] Iniciar Bomba":
                    Aux.iniciarBomba();
                break;
                
                case (String)"[2] Hacer Venta":
                    litros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos litros desea comprar?"));
                    if(litros <= Aux.revisarInventario())
                    {
                        JOptionPane.showMessageDialog(null, "Gasolina suficiente para la venta");
                        idGasolina=Integer.parseInt(JOptionPane.showInputDialog("Id de Gasolina: "));
                        Aux2.getIdGasolina();
                        marca=JOptionPane.showInputDialog("Marca: ");
                        Aux2.getMarca();
                        tipo=Integer.parseInt(JOptionPane.showInputDialog("Tipo: "));
                        Aux2.getTipo();
                        precioBase=Integer.parseInt(JOptionPane.showInputDialog("Precio Base: "));
                        Aux2.getPrecioBase();
                        JOptionPane.showMessageDialog(null,"El costo de la Venta es de: $"+Aux.realizarVenta(litros));
                    }
                     else
                        JOptionPane.showMessageDialog(null,"Lo sentimos, no contamos con la gasolina suficiente en nuestro inventario");
                    break;
                
                case (String)"[3] Revisar Inventario":
                    JOptionPane.showMessageDialog(null, "Esta la Bomba con "+Aux.revisarInventario()+" litros");
                break;
                
                case (String)"[4] Total Venta":
                    JOptionPane.showMessageDialog(null, "Venta Total: $"+Aux.calcularVentaTotal());
                break;
                
                case (String)"[5] Salir":
                 JOptionPane.showMessageDialog(null, "Salir...");
               break;
               default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(!opcMenu.equals("Salir"));
    }
    
}
