/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author software 19
 */
public class FechasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Object menu []= {"1. Iniciar Objeto","2. Consultar Fecha","3. Cuanto dias tiene el Mes","4. Es Anio Bisiesto","5. Modificar Fecha","6. Salir"};
        Object subMenu []= {"1. Dia", "2. Mes", "3.Año", "Regresar"};
        int dia=0, mes=0, año=0, opcion=0;
        Fechas hoy = new Fechas();
        String opcMenu="";
        do
        {
         opcMenu = (String) JOptionPane.showInputDialog(null, "Elige un opcion", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
         opcion =in.nextInt();
         
         switch((String)(opcMenu))
         {
             case (String)"1. Iniciar Objeto":
                 dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el dia","Fecha",JOptionPane.QUESTION_MESSAGE));
                 mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el mes","Fecha",JOptionPane.QUESTION_MESSAGE));
                 año = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el año","Fecha",JOptionPane.QUESTION_MESSAGE));
                 hoy.setDia(dia);
                 hoy.setMes(mes);
                 hoy.setAño(año);    
                 break;
             case (String)"2. Consultar Fecha":
                 JOptionPane.showMessageDialog(null,"La fecha es"+hoy.fechaConFormato());
                 break;
                 
             case (String)"3. Cuanto dias tiene el Mes":
                 mes = hoy.getMes();
                 JOptionPane.showMessageDialog(null,"El mes tiene "+hoy.diasDelMes()+" Dias");  
                 break;
                 
             case (String)"4. Es AÃ±o Bisiesto":
                 if(hoy.esBisiesto())
                 {
                     JOptionPane.showMessageDialog(null, "El año "+hoy.getAño()+" es bisiesto");
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "El año "+hoy.getAño()+" no es bisiesto");
                 }
                 break;
              
             case (String)"5. Modificar Fecha":
                 String opcSubMenu="";
                 do{    
                 opcSubMenu = (String) JOptionPane.showInputDialog(null, "Elige un opcion", "Modificar Fecha", JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]);
                 opcion = in.nextInt();
                 switch((String)(opcMenu))
                 {
                     case (String)"1. Dia":
                        dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el dia","Fecha",JOptionPane.QUESTION_MESSAGE));
                        hoy.setDia(dia);
                        break;
                    case (String)"1. Mes":
                        mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el mes","Fecha",JOptionPane.QUESTION_MESSAGE));
                        hoy.setMes(mes);
                        break;
                    case (String)"1. Año":
                        año = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el año","Fecha",JOptionPane.QUESTION_MESSAGE));
                        hoy.setAño(año);
                        break;
                    case (String)"Regresar":
                        break;
                    default:
                        System.out.println("No es una Opcion Valida");
                 }
                }while(!opcSubMenu.equals("Regresar"));
               break;
             case (String)"6. Salir":
                 JOptionPane.showMessageDialog(null, "Salir...");
               break;
             
             default:    
            JOptionPane.showMessageDialog(null, "Opcion no valida");
         }
         
         JOptionPane.showMessageDialog(null, "Oprima cualquier tecla");
         in.nextInt();
         
        }while(!opcMenu.equals("Salir"));
    }
    
}