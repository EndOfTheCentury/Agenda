/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author SONY
 */
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JFrame;
public class VentanaInicial extends JFrame {
    
    private JCalendar calendario;
    
    public VentanaInicial(){
        setTitle("Calendario");
        setName("VentanaInicial");
        Container contenedor =  getContentPane();
        contenedor.setLayout(null);
        
        calendario = new JCalendar(new GregorianCalendar(TimeZone.getDefault()));
        calendario.setSize(300,250);
        calendario.setLocation(0,0);
        calendario.setVisible(true);
        contenedor.add(calendario);
        
        Toolkit tool = getToolkit();
        Dimension d = tool.getScreenSize();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(d.width/3, d.height/2);
        setLocation((d.width/2)-(getWidth()/2),(d.height/2)-(getHeight()/2));      
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        VentanaInicial ventana=new VentanaInicial();
    }
}
