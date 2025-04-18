/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetmedical;

import jade.core.Agent ;
import jade.wrapper.ControllerException;

public class PatientAgent extends Agent {
    @Override
    protected void setup(){
        System.out.println("Initialisation de l'agent "+this.getAID().getName()) ;
    }
    
    @Override
    protected void takeDown(){
        System.out.println("Destruction de l'agent") ;
    }
    
    @Override
    protected void beforeMove(){
        try{
            System.out.println("Avant la migration......du container "+this.getContainerController().getContainerName()) ;
        }
        catch(ControllerException e){
            e.printStackTrace() ;
        }
    }
    
    @Override
    protected void afterMove(){
        try{
            System.out.println("Apres la migration......du container "+this.getContainerController().getContainerName()) ;
        }
        catch(ControllerException e){
            e.printStackTrace() ;
        }
    }
}
