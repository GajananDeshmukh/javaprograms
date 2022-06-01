
package demo.localclass;
import java.util.Locale;
public class Localdemo {
    public static void main(String[] args) {
        Locale[] allLocales=Locale.getAvailableLocales();
        int i=0;
        for(Locale local : allLocales){
            i++;
            
            System.out.println(i + " country :  " + local.getDisplayCountry());
            System.out.println(" Language :  " + local.getDisplayLanguage());
            
            if(i>allLocales.length)
                break;
            
        }
    }
}
