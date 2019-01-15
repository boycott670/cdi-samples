/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import javax.enterprise.event.Event;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import samples.events.ApplicationStartedEvent;

/**
 *
 * @author MARMAR Soufiane
 */
public class App {
    
    @Inject
    Event<ApplicationStartedEvent> applicationStartedEventLaucher;
    
    public static void main(String[] args) {
        
        try (final SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            
            container.select(App.class).get().applicationStartedEventLaucher.fire(() -> App.class);
            
        }
        
    }
    
}
