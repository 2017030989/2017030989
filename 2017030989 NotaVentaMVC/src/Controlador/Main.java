package Controlador;
import Modelo.Factura;
import Vista.vNotaVenta;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;/**
 *
 * @author 2017030989
 */
public class Main 
{
    public static void main(String[] args) 
    {
        vNotaVenta view = new vNotaVenta(new JFrame(), true);
        Factura factura = new Factura();
        Controlador controller = new Controlador(factura, view);
    }   
}
