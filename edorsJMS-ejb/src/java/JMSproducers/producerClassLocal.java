/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JMSproducers;

import javax.ejb.Local;

/**
 *
 * @author AcerPC
 */
@Local
public interface producerClassLocal {
    
    public void sendMessageToQueue(String message);
}
