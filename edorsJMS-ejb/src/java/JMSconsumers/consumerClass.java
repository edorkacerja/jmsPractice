/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMSconsumers;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author AcerPC
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/edorsDJMDI")
})
public class consumerClass implements MessageListener {
    
    public consumerClass() {
        
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage myTMessage = (TextMessage) message;
            Thread.sleep(1000);
            for(int i=0; i<10; i++){
                System.out.println(myTMessage.getText());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(consumerClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JMSException ex) {
            Logger.getLogger(consumerClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
