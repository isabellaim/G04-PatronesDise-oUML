/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.patronesdisuml.ChainOfResponsibilityPattern;

/**
 *
 * @author isabella
 */
public abstract class AbstractCambioHandler {
    protected AbstractCambioHandler nextAbstractCambioHandler;
    
    public void setNextAbstraccionCambioHandler(AbstractCambioHandler next){
        nextAbstractCambioHandler = next;
    }
    public abstract Object handleCambio(Object request);
}
