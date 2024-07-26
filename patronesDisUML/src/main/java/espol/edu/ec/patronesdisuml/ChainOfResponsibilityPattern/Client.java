/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.patronesdisuml.ChainOfResponsibilityPattern;

import espol.edu.ec.patronesdisenouml.StrategyPattern.ChainOfResponsibilityPattern.AbstractCambioHandler;
import espol.edu.ec.patronesdisenouml.StrategyPattern.ChainOfResponsibilityPattern.InventarioHandler;
import espol.edu.ec.patronesdisenouml.StrategyPattern.ChainOfResponsibilityPattern.TecnicoHandler;
import espol.edu.ec.patronesdisenouml.StrategyPattern.ChainOfResponsibilityPattern.TiendaGerenciaHandler;
import espol.edu.ec.patronesdisuml.ChainOfResponsibilityPattern.AtencionUsuarioHandler;

/**
 *
 * @author isabella
 */
public class Client {
    private static AbstractCambioHandler doChaining(){  
    AbstractCambioHandler atenUser = new AtencionUsuarioHandler();  

    AbstractCambioHandler tecnico = new TecnicoHandler();  
    atenUser.setNextAbstractCambioHandler(tecnico);  

    AbstractCambioHandler inventario = new InventarioHandler();  
    tecnico.setNextAbstractCambioHandler(inventario);
    
    AbstractCambioHandler gerencia = new TiendaGerenciaHandler();  
    inventario.setNextAbstractCambioHandler(gerencia); 

    return atenUser;   
    }
    
    public static void main(String args[]){  
        AbstractCambioHandler chainCambio = doChaining();   
    }  
}
