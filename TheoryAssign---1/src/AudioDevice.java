import com.sun.nio.sctp.AbstractNotificationHandler;

import java.security.SecureRandom;

public class AudioDevice extends Electronics{
    public AudioDevice(String name, double price,int stockQuantity, double tax,double powerConsumption,double warranty){
        super(name,price,stockQuantity,tax,powerConsumption,warranty,ElectronicsCategory.AUDIODEVICE);
    }
    public String toString(){
        String res = super.toString();
        return res;
    }
}
