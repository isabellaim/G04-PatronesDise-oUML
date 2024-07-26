/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.edu.ec.patronesdisuml.StrategyPattern;

import espol.edu.ec.patronesdisenouml.prueba.ContextDistribucion;
import espol.edu.ec.patronesdisenouml.prueba.FerreaStrategy;
import espol.edu.ec.patronesdisenouml.prueba.FluvialStrategy;
import espol.edu.ec.patronesdisuml.StrategyPattern.CiclistaStrategy;
import espol.edu.ec.patronesdisuml.StrategyPattern.AutomotrizStrategy;
import espol.edu.ec.patronesdisuml.StrategyPattern.AereaStrategy;

/**
 *
 * @author isabella
 */
public class Client {
    public static void main(String[] args){
        ContextDistribucion context = new ContextDistribucion();
        String strategy = //escojo estrategia

        if (strategy.equals("automotriz")){
            context.setStrategy(new AutomotrizStrategy());

        }else if (strategy.equals("ciclista")){
            context.setStrategy(new CiclistaStrategy());

        } else if (strategy.equals("fluvial")){
            context.setStrategy(new FluvialStrategy());
        
        } else if (strategy.equals("ferrea")){
            context.setStrategy(new FerreaStrategy());
            
        } else if (strategy.equals("aerea")){
            context.setStrategy(new AereaStrategy());
            
        }
        Object result = context.distribuyeArticulo(new Object());
    }
}

