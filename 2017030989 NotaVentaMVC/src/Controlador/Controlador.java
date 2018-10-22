package Controlador;
import Modelo.Factura;
import Modelo.Perecedero;
import Modelo.NotaVenta;
import Modelo.Producto;
import Vista.vNotaVenta;
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
    private vNotaVenta vista;
    private Factura factura;

    public Controlador(Factura factura, vNotaVenta vista)
    {
        this.factura = factura;
        this.vista = vista;
        vista.btnSubtotal.addActionListener(this);
        vista.btnTotal.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnMostrar.addActionListener(this);
        vista.btnLimpiar.addActionListener(this);
        vista.setVisible(true);
        vista.setTitle("Nota venta");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnGuardar)
        {
            factura.setDomicilio(vista.txtDomicilio.getText());
            factura.setFechaF(vista.txtFechaF.getText());
            factura.setIva(Integer.parseInt(vista.txtIva.getText()));
            factura.setNombre(vista.txtNombreC.getText());
            factura.setRfc(vista.txtRfc.getText());
            factura.setFecha(vista.txtFecha.getText());
            factura.setConcepto(vista.txtConcepto.getText());
            factura.setNumero(Integer.parseInt(vista.txtNumeroV.getText()));
            factura.setCantidad(Integer.parseInt(vista.txtCantidad.getText()));
            factura.setTipoPago(vista.cmbTPago.getSelectedIndex() + 1);
            Perecedero perecedero = new Perecedero(Integer.parseInt(vista.txtIdProducto.getText()), vista.txtNombreP.getText(), vista.cmbUnidad.getSelectedIndex() + 1,
                    Float.parseFloat(vista.txtPrecio.getText()), vista.txtFechaC.getText(), Integer.parseInt(vista.txtTemperatura.getText()));
            factura.setProducto(perecedero);
        }
        else if(e.getSource() == vista.btnSubtotal)
        {
            if(factura.getNumero() <= 0)
            {
                JOptionPane.showMessageDialog(null, "No hay Venta Creada", "Nota Venta", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Subtotal: $" + factura.calcularPago(), "Nota Venta", JOptionPane.QUESTION_MESSAGE);
            }
        }
        else if(e.getSource() == vista.btnTotal)
        {
            if(factura.getNumero() <= 0)
            {
                JOptionPane.showMessageDialog(null, "No hay Venta Creada", "Nota Venta", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Total a pagar: $" + factura.calcularTotal(),
                        "Factura", JOptionPane.QUESTION_MESSAGE);
            }
        }
        else if(e.getSource() == vista.btnLimpiar)
        {
            vista.txtCantidad.setText("");
            vista.txtConcepto.setText("");
            vista.txtFecha.setText("");
            vista.txtDomicilio.setText("");
            vista.txtFechaC.setText("");
            vista.txtFechaF.setText("");
            vista.txtIdProducto.setText("");
            vista.txtNombreC.setText("");
            vista.txtIva.setText("");
            vista.txtNombreP.setText("");
            vista.txtNumeroV.setText("");
            vista.txtPrecio.setText("");
            vista.txtRfc.setText("");
            vista.txtTemperatura.setText("");
            vista.cmbUnidad.setSelectedIndex(-1);
            vista.cmbTPago.setSelectedIndex(-1);
        }
        else if(e.getSource() == vista.btnMostrar)
        {
            if(factura.getNumero() <= 0)
            {
                JOptionPane.showMessageDialog(null, "No hay Venta Creada", "Nota Venta", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                vista.txtCantidad.setText(String.valueOf(factura.getCantidad()));
                vista.txtConcepto.setText(factura.getConcepto());
                vista.txtDomicilio.setText(factura.getDomicilio());
                vista.txtFecha.setText(factura.getFecha());
                vista.txtFechaC.setText(factura.getProducto().getFechaCaducidad());
                vista.txtFechaF.setText(factura.getFechaF());
                vista.txtIdProducto.setText(String.valueOf(factura.getProducto().getIdProducto()));
                vista.txtIva.setText(String.valueOf(factura.getIva()));
                vista.txtNombreC.setText(factura.getNombre());
                vista.txtNombreP.setText(factura.getProducto().getNombreP());
                vista.txtNumeroV.setText(String.valueOf(factura.getNumero()));
                vista.txtPrecio.setText(String.valueOf(factura.getProducto().getPrecio()));
                vista.txtRfc.setText(factura.getRfc());
                vista.txtTemperatura.setText(String.valueOf(factura.getProducto().getTemperatura()));
                vista.cmbTPago.setSelectedIndex(factura.getTipoPago() - 1);
                vista.cmbUnidad.setSelectedIndex(factura.getProducto().getUnidad() - 1);

            }

        }

    }
}
