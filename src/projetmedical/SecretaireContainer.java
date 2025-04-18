/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetmedical;

import jade.core.Runtime ;
import jade.core.Profile ;
import jade.core.ProfileImpl ;
import jade.util.leap.Properties ;
import jade.util.ExtendedProperties ;
import jade.wrapper.AgentContainer ;
import jade.wrapper.ControllerException ;

public class SecretaireContainer {
    public static void main(String[] args){
        try{
            Runtime runtime = Runtime.instance() ;
            Properties properties = new ExtendedProperties() ;
            properties.setProperty(Profile.GUI, "false") ;
            Profile profile = new ProfileImpl(properties) ;
            AgentContainer secretaireContainer = runtime.createAgentContainer(profile) ;
            secretaireContainer.start() ;
        }
        catch(ControllerException e){
            e.printStackTrace() ;
        }
    }
}
