package Controlador;
import Modelo.Bomba;
import Modelo.Gasolina;
import Vista.vistaBomba;
import javax.swing.JFrame;
/**
 *
 * @author 2017030989
 */
public class MVCBomba 
{
    public static void main(String[] args) 
    {
        Bomba bomba = new Bomba();
        Gasolina gasolina = new Gasolina();
        vistaBomba vbomba;
        vbomba = new vistaBomba(new JFrame(), true);

        Controlador controlador = new Controlador(bomba, vbomba, gasolina);
    }
    
}