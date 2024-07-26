/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.patronesdisuml.StrategyPattern;

import espol.edu.ec.patronesdisenouml.prueba.DistribucionStrategy;

/**
 *
 * @author isabella
 */
public class ContextDistribucion {
    private DistribucionStrategy distribucionStrategy;
    
    public void setStrategy(DistribucionStrategy strategy){
        distribucionStrategy = strategy;
    }
    
    public Object distribuyeArticulos(Object parametros){
        return distribucionStrategy.distribuyeArticulos(parametros);
    }
}
