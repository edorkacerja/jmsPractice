/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMSproducers;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;


@Stateless
public class producerClass implements producerClassLocal {

    @Resource(mappedName = "jms/edorsDJMDI")
    private Queue edorsDJMDI;

    @Inject
    @JMSConnectionFactory("jms/edorsCFJMDI")
    private JMSContext context;

    private void sendJMSMessageToEdorsDJMDI(String messageData) {
        context.createProducer().send(edorsDJMDI, messageData);
    }
    
    public void sendMessageToQueue(String message){
        sendJMSMessageToEdorsDJMDI(message);
    }

    
}
