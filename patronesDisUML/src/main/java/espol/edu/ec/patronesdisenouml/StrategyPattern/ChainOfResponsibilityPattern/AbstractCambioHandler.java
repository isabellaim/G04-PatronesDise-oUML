/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.patronesdisenouml.StrategyPattern.ChainOfResponsibilityPattern;

/**
 *
 * @author isabella
 */
public abstract class AbstractCambioHandler {
    protected AbstractCambioHandler nextAbstractCambioHandler; 
    
    public void setNextAbstractCambioHandler(AbstractCambioHandler next) {  
        this.nextAbstractCambioHandler = next;  
    }  
    public abstract Object handleCambio(Object request);
}
