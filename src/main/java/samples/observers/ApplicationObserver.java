/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.observers;

import java.util.logging.Logger;
import javax.enterprise.event.Observes;
import samples.events.ApplicationStartedEvent;
import samples.qualifiers.ApplicationStarted;

/**
 *
 * @author MARMAR Soufiane
 */
public class ApplicationObserver {
    
    public void started(@Observes @ApplicationStarted final ApplicationStartedEvent event) {
        Logger.getAnonymousLogger().info(event.getStartedApplicationType().getTypeName());
    }
    
}
