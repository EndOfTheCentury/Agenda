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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c =new GregorianCalendar(TimeZone.getDefault());
        JCalendar cal = new JCalendar();
        DateChooserPanel dcp = new DateChooserPanel();
       

         
    }
}
