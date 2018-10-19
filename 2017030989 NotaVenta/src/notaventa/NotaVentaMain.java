package notaventa;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author 2017030989 Sánchez Flores Carlos Eduardo
 */
public class NotaVentaMain 
{
    public static void main(String[] args) 
    {
        NotaVenta nV = new NotaVenta();
        Factura f = new Factura();
        Productos p = new Productos();
        NoPerecedero nP = new NoPerecedero();
        Perecedero pe = new Perecedero();
        Object menuP[]={"[1] Vender Producto", "[2] Solicitar Factura", "[3] Modificar Venta", "[4] Modificar Factura", "[5] Consultar Ventas", "[6] Consultar Facturas", "[7] Salir"};
        Object menuTPr[]={"[1] Perecedero", "[2] No Perecedero"};
        Object menuTP[]={"[1] Contado", "[2] Crédito"};
        Object menuUP[]={"[1] Kilogramos", "[2] Litros", "[3] Piezas"};
        Object desicion[] = {"Si","No"};
        int dia, mes, año, diaCad, mesCad, añoCad, diaL, mesL, añoL, diaF, mesF, añoF;
        float temperatura=0, iva=0;
        String opcMenuP, opcMenuTPr, opcDesicion, producto, rfc, nombreCliente, domicilio, fechaF, fechaC, fechaL;
        do
        {
            opcMenuP=(String)JOptionPane.showInputDialog(null,"Selecciona una opcion","Menú Principal",JOptionPane.QUESTION_MESSAGE,null,menuP,menuP[0]);
            switch(opcMenuP)
            {
                case "[1] Vender Producto":
                    nV.numeroNota++;
                    dia=Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: ", "Fecha Venta",JOptionPane.QUESTION_MESSAGE));
                    mes=Integer.parseInt(JOptionPane.showInputDialog(null, "Mes: ", "Fecha Venta",JOptionPane.QUESTION_MESSAGE));
                    año=Integer.parseInt(JOptionPane.showInputDialog(null, "Año: ", "Fecha Venta",JOptionPane.QUESTION_MESSAGE));
                    nV.concepto=JOptionPane.showInputDialog(null, "Concepto del Producto: ", "Venta de Producto",JOptionPane.QUESTION_MESSAGE);
                        opcMenuTPr=(String)JOptionPane.showInputDialog(null,"Selecciona una opcion", "Menú de Tipo de Producto", JOptionPane.QUESTION_MESSAGE, null, menuTPr, menuTPr[0]);
                        switch(opcMenuTPr)
                        {
                            case "[1] Perecedero":
                            p.idProducto++;
                            p.nombre=JOptionPane.showInputDialog(null, "Nombre del Producto: ", "Perecedero", JOptionPane.QUESTION_MESSAGE);
                            p.unidadProducto=(JOptionPane.showInputDialog(null, "Unidad Del Producto: ", "Perecedero", JOptionPane.QUESTION_MESSAGE));
                            p.precioUnitario=Float.parseFloat(JOptionPane.showInputDialog(null, "Precio Unitario: ", "Perecederos", JOptionPane.QUESTION_MESSAGE));
                            diaCad=Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: ", "Fecha Caducidad", JOptionPane.QUESTION_MESSAGE));
                            mesCad=Integer.parseInt(JOptionPane.showInputDialog(null, "Mes: ", "Fecha Caducidda", JOptionPane.QUESTION_MESSAGE));
                            añoCad=Integer.parseInt(JOptionPane.showInputDialog(null, "Año: ", "Fecha Caducidad", JOptionPane.QUESTION_MESSAGE));
                            fechaC= diaCad+"/"+mesCad+"/"+añoCad;
                            pe.setFechaCaducidad(fechaC);
                            temperatura=Float.parseFloat(JOptionPane.showInputDialog(null, "Temperatura (°C): ", "Perecedero", JOptionPane.QUESTION_MESSAGE));
                            pe.setTemperatura(temperatura);
                            break;
                            
                            case "[2] No Perecedero":
                            p.idProducto++;
                            p.nombre=JOptionPane.showInputDialog(null, "Nombre del Producto: ", "No Perecedero", JOptionPane.QUESTION_MESSAGE);
                            p.unidadProducto=(JOptionPane.showInputDialog(null, "Unidad Del Producto: ", "No Perecedero", JOptionPane.QUESTION_MESSAGE));
                            p.precioUnitario=Float.parseFloat(JOptionPane.showInputDialog(null, "Precio Unitario: ", "No Perecedero", JOptionPane.QUESTION_MESSAGE));
                            diaL=Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: ", "Fecha Lote", JOptionPane.QUESTION_MESSAGE));
                            mesL=Integer.parseInt(JOptionPane.showInputDialog(null, "Mes: ", "Fecha Lote", JOptionPane.QUESTION_MESSAGE));
                            añoL=Integer.parseInt(JOptionPane.showInputDialog(null, "Año: ", "Fecha Lote", JOptionPane.QUESTION_MESSAGE));
                            fechaL= diaL+"/"+mesL+"/"+añoL;
                            nP.setLoteFabricacion(fechaL);
                            break;
                        }
                   nV.cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad Producto: ","Venta de Producto",JOptionPane.QUESTION_MESSAGE));
                   nV.precio=p.calcularProducto(opcMenuTPr)*nV.cantidad;
                   nV.tipoPago=(String)JOptionPane.showInputDialog(null,"Tipo Pago: ","Venta de Producto",JOptionPane.QUESTION_MESSAGE,null,menuTP,menuTP[0]);
                   nV.fecha=dia+"/"+mes+"/"+año;
                   JOptionPane.showMessageDialog(null,"La Venta Ha Sido Guardada","Venta de Producto",JOptionPane.INFORMATION_MESSAGE);
                break;
                
                case "[2] Solicitar Factura":
                    rfc=JOptionPane.showInputDialog(null,"RFC: ","Facturación",JOptionPane.QUESTION_MESSAGE);
                    f.setRfc(rfc);
                    nombreCliente=JOptionPane.showInputDialog(null,"Nombre: ","Facturación",JOptionPane.QUESTION_MESSAGE);
                    f.setNombreCliente(nombreCliente);
                    domicilio=JOptionPane.showInputDialog(null,"Domicilio: ","Facturación",JOptionPane.QUESTION_MESSAGE);
                    f.setDomicilio(domicilio);
                    diaF=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia: ","Fecha Facturación",JOptionPane.QUESTION_MESSAGE));
                    mesF=Integer.parseInt(JOptionPane.showInputDialog(null,"Mes: ","Fecha Facturación",JOptionPane.QUESTION_MESSAGE));
                    añoF=Integer.parseInt(JOptionPane.showInputDialog(null,"Año: ","Fecha Facturación",JOptionPane.QUESTION_MESSAGE));
                    fechaF=diaF+"/"+mesF+"/"+añoF;
                    iva=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el iva","Solicitar Factura",JOptionPane.QUESTION_MESSAGE));
                    f.setFechaF(fechaF);
                    f.setIva(iva);
                    JOptionPane.showMessageDialog(null,"La Factura Ha Guardada","Facturación",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "[3] Modificar Venta":
                opcDesicion=(String)JOptionPane.showInputDialog(null,"Datos de Venta:\n"+"numero nota: "+nV.getNumeroNota()+"\nconcepto: "+nV.getConcepto()+"\n\tid Producto: "+p.getIdProducto()+"\n\tNombre del producto: "+p.getNombre()+"\n\tUnidad del Producto: "+p.getUnidadProducto()+"\n\tPrecio Unitario del Producto: "+p.getPrecioUnitario()+"\n\tFecha de caducación: "+pe.getFechaCaducidad()+"\n\tTemperatura: "+pe.getTemperatura()+"\nCantidad de Producto: "+nV.getCantidad()+"\nPrecio total de producto: "+nV.getPrecio()+"\nTipo de Pago: "+nV.getTipoPago()+"\n\n\t¿Desea Cambiar los datos?","Modifcar Venta",JOptionPane.QUESTION_MESSAGE,null,desicion,desicion[0]);
                if (opcDesicion.equals("Si"))
                {
                    dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia: ","Fecha de Compra",JOptionPane.QUESTION_MESSAGE));
                    mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Mes: ","Fecha de Compra",JOptionPane.QUESTION_MESSAGE));
                    año=Integer.parseInt(JOptionPane.showInputDialog(null,"Año: ","Fecha de Compra",JOptionPane.QUESTION_MESSAGE));
                    nV.concepto=JOptionPane.showInputDialog(null,"Concepto","Vender Producto",JOptionPane.QUESTION_MESSAGE);
                    opcMenuTPr=(String)JOptionPane.showInputDialog(null,"Selecciona una opcion", "Menú de Tipo de Producto", JOptionPane.QUESTION_MESSAGE, null, menuTPr, menuTPr[0]);
                        switch(opcMenuTPr)
                        {
                            case "[1] Perecedero":
                            p.idProducto++;
                            p.nombre=JOptionPane.showInputDialog(null, "Nombre del Producto: ", "Perecedero", JOptionPane.QUESTION_MESSAGE);
                            p.unidadProducto=(JOptionPane.showInputDialog(null, "Unidad Del Producto: ", "Perecedero", JOptionPane.QUESTION_MESSAGE));
                            p.precioUnitario=Float.parseFloat(JOptionPane.showInputDialog(null, "Precio Unitario: ", "Perecederos", JOptionPane.QUESTION_MESSAGE));
                            diaCad=Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: ", "Fecha Caducidad", JOptionPane.QUESTION_MESSAGE));
                            mesCad=Integer.parseInt(JOptionPane.showInputDialog(null, "Mes: ", "Fecha Caducidda", JOptionPane.QUESTION_MESSAGE));
                            añoCad=Integer.parseInt(JOptionPane.showInputDialog(null, "Año: ", "Fecha Caducidad", JOptionPane.QUESTION_MESSAGE));
                            fechaC= diaCad+"/"+mesCad+"/"+añoCad;
                            pe.setFechaCaducidad(fechaC);
                            temperatura=Float.parseFloat(JOptionPane.showInputDialog(null, "Temperatura (°C): ", "Perecedero", JOptionPane.QUESTION_MESSAGE));
                            pe.setTemperatura(temperatura);
                            break;
                            
                            case "[2] No Perecedero":
                            p.idProducto++;
                            p.nombre=JOptionPane.showInputDialog(null, "Nombre del Producto: ", "No Perecedero", JOptionPane.QUESTION_MESSAGE);
                            p.unidadProducto=(JOptionPane.showInputDialog(null, "Unidad Del Producto: ", "No Perecedero", JOptionPane.QUESTION_MESSAGE));
                            p.precioUnitario=Float.parseFloat(JOptionPane.showInputDialog(null, "Precio Unitario: ", "No Perecedero", JOptionPane.QUESTION_MESSAGE));
                            diaL=Integer.parseInt(JOptionPane.showInputDialog(null, "Dia: ", "Fecha Lote", JOptionPane.QUESTION_MESSAGE));
                            mesL=Integer.parseInt(JOptionPane.showInputDialog(null, "Mes: ", "Fecha Lote", JOptionPane.QUESTION_MESSAGE));
                            añoL=Integer.parseInt(JOptionPane.showInputDialog(null, "Año: ", "Fecha Lote", JOptionPane.QUESTION_MESSAGE));
                            fechaL= diaL+"/"+mesL+"/"+añoL;
                            nP.setLoteFabricacion(fechaL);
                            break;
                        }
                    nV.cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad Producto: ","Venta de Producto",JOptionPane.QUESTION_MESSAGE));
                   nV.precio=p.calcularProducto(opcMenuTPr)*nV.cantidad;
                   nV.tipoPago=(String)JOptionPane.showInputDialog(null,"Tipo Pago: ","Venta de Producto",JOptionPane.QUESTION_MESSAGE,null,menuTP,menuTP[0]);
                   nV.fecha=dia+"/"+mes+"/"+año;
                   JOptionPane.showMessageDialog(null,"La Venta Ha Sido Guardada","Modificación de Venta",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "[4] Modificar Factura":
                opcDesicion=(String)JOptionPane.showInputDialog(null,"RFC: "+f.getRfc()+"\nNombre del Cliente: "+f.getNombreCliente()+"\nDomicilio Fiscal: "+f.getDomicilio()+"\nFecha de Fabricación: "+f.getFechaF()+"\nIva: "+f.getIva(),"Modifcar Factura",JOptionPane.QUESTION_MESSAGE,null,desicion,desicion[0]);
                if (opcDesicion.equals("Si"))
                {
                    rfc=JOptionPane.showInputDialog(null,"RFC: ","Facturación",JOptionPane.QUESTION_MESSAGE);
                    f.setRfc(rfc);
                    nombreCliente=JOptionPane.showInputDialog(null,"Nombre: ","Facturación",JOptionPane.QUESTION_MESSAGE);
                    f.setNombreCliente(nombreCliente);
                    domicilio=JOptionPane.showInputDialog(null,"Domicilio: ","Facturación",JOptionPane.QUESTION_MESSAGE);
                    f.setDomicilio(domicilio);
                    diaF=Integer.parseInt(JOptionPane.showInputDialog(null,"Dia: ","Fecha Facturación",JOptionPane.QUESTION_MESSAGE));
                    mesF=Integer.parseInt(JOptionPane.showInputDialog(null,"Mes: ","Fecha Facturación",JOptionPane.QUESTION_MESSAGE));
                    añoF=Integer.parseInt(JOptionPane.showInputDialog(null,"Año: ","Fecha Facturación",JOptionPane.QUESTION_MESSAGE));
                    fechaF=diaF+"/"+mesF+"/"+añoF;
                    iva=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el iva","Solicitar Factura",JOptionPane.QUESTION_MESSAGE));
                    f.setFechaF(fechaF);
                    f.setIva(iva);
                    JOptionPane.showMessageDialog(null,"La Factura Ha Guardada","Modificación de Facturación",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                case "[5] Consultar Ventas":
                    JOptionPane.showMessageDialog(null,"Numero Nota: "+nV.getNumeroNota()+"\nConcepto: "+nV.getConcepto()+"\n\tId del Producto: "+p.getIdProducto()+"\n\tNombre del Producto: "+p.getNombre()+"\n\tUnidad del Producto: "+p.getUnidadProducto()+"\n\tPrecio Unitario: "+p.getPrecioUnitario()+"\n\tFecha de Caducación: "+pe.getFechaCaducidad()+"\n\tTemperatura(°C): "+pe.getTemperatura()+"\nCantidad de Producto: "+nV.getCantidad()+"\nPrecio total de producto: "+nV.getPrecio()+"\nTipo de Pago: "+nV.getTipoPago(),"Nota de Venta",JOptionPane.INFORMATION_MESSAGE);
                break;
                case "[6] Consultar Facturas":
                    JOptionPane.showMessageDialog(null,"RFC: "+f.getRfc()+"\nNombre del Cliente: "+f.getNombreCliente()+"\nDomicilio: "+f.getDomicilio()+"\nFecha de Fabricación: "+f.getFechaF()+"\nIva: "+f.getIva(),"Consultar Factura",JOptionPane.INFORMATION_MESSAGE);
                break;
                case "[7] Salir":
                break;
            }
        }while(!opcMenuP.equals("[7]. Salir"));
        
    }
    
}
