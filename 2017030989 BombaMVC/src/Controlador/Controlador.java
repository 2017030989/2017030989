package Controlador;
import Modelo.Bomba;
import Modelo.Gasolina;
import Vista.vistaBomba;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 2017030989
 */
public class Controlador implements ActionListener
{
    private Bomba bomba;
    private Gasolina gasolina;
    private vistaBomba vbomba;
    
    public Controlador (Bomba bomba, vistaBomba vbomba, Gasolina gasolina)
    {
        this.bomba=bomba;
        this.vbomba=vbomba;
        this.gasolina=gasolina;
        
        vbomba.btnGuardar.addActionListener(this);
        vbomba.btnInventario.addActionListener(this);
        vbomba.btnLimpiar.addActionListener(this);
        vbomba.btnMostrarBomba.addActionListener(this);
        vbomba.btnMostrarVenta.addActionListener(this);
        vbomba.btnRealizarVenta.addActionListener(this);
        vbomba.setTitle("Bomba");
        vbomba.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==vbomba.btnGuardar)
        {
            bomba.setNumBomba(Integer.parseInt(vbomba.txtNBomba.getText()));
            bomba.setCapacidad(Integer.parseInt(vbomba.txtCapacidad.getText()));
            bomba.setLitrosVendidos(Integer.parseInt(vbomba.txtLitrosVendidos.getText()));
            bomba.setNumBomba(Integer.parseInt(vbomba.txtNBomba.getText()));
            gasolina.setIdGasolina(Integer.parseInt(vbomba.txtIdGasolina.getText()));
            gasolina.setMarca(vbomba.txtMarca.getText());
            gasolina.setPrecioBase(Integer.parseInt(vbomba.txtPrecioBase.getText()));
            gasolina.setTipo(vbomba.cbmTipo.checkImage(null, vbomba));
        }
        if(e.getSource()==vbomba.btnLimpiar)
        {
            vbomba.txtCapacidad.setText("");
            vbomba.txtIdGasolina.setText("");
            vbomba.txtLitrosVendidos.setText("");
            vbomba.txtMarca.setText("");
            vbomba.txtNBomba.setText("");
            vbomba.txtPrecioBase.setText("");
            vbomba.cbmTipo.setSelectedIndex(-1);
        }
        if(e.getSource()==vbomba.btnInventario)
        {
            JOptionPane.showMessageDialog(null, "El Inventario Total es de: " + bomba.revisarInventario(), "Bomba", JOptionPane.WARNING_MESSAGE);
        }
        if(e.getSource()==vbomba.btnMostrarBomba)
        {
            vbomba.txtCapacidad.setText(String.valueOf(bomba.getCapacidad()));
            vbomba.txtIdGasolina.setText(String.valueOf(bomba.getTGasolina().getIdGasolina()));
            vbomba.txtMarca.setText(bomba.getTGasolina().getMarca());
            vbomba.txtPrecioBase.setText(String.valueOf(bomba.getTGasolina().getPrecioBase()));
            vbomba.txtNBomba.setText(String.valueOf(bomba.getNumBomba()));
            vbomba.txtLitrosVendidos.setText(String.valueOf(bomba.getLitrosVendidos()));
            vbomba.cbmTipo.setSelectedIndex(bomba.getTGasolina().getTipo() - 1);
        }
        if(e.getSource()==vbomba.btnMostrarVenta)
        {
            JOptionPane.showMessageDialog(null, "La Venta Total es de: $" + bomba.calcularVentaTotal(), "Venta", JOptionPane.WARNING_MESSAGE);
        }
        if(e.getSource()==vbomba.btnRealizarVenta)
        {
             if(vbomba.txtLitrosVendidos.getText().matches(""))
            {
                JOptionPane.showMessageDialog(null, "Introduce la Cantidad de litros Deseados", "Venta", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(bomba.revisarInventario()<=bomba.getLitrosVendidos())
                {
                    JOptionPane.showMessageDialog(null, "No hay Combustible", "Venta", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "La Venta total es de: $" + bomba.calcularVentaTotal(), "Venta", JOptionPane.QUESTION_MESSAGE);
                }
            }
        }
    }
}
