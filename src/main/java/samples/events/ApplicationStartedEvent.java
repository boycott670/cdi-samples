/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.events;

import java.lang.reflect.Type;

/**
 *
 * @author MARMAR Soufiane
 */
@FunctionalInterface
public interface ApplicationStartedEvent {
    
    Type getStartedApplicationType();
    
}
