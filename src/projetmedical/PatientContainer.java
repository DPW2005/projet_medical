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
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException ;
import javafx.application.Application;
import javafx.stage.Stage;

public class PatientContainer extends Application {
    public static void main(String[] args){
        launch(PatientContainer.class) ;
    }
    
    @Override
    public void start(Stage primaryStage){
        startContainer();
        primaryStage.setTitle("Patient Form") ;
    }
    
    public void startContainer(){
        try{
            Runtime runtime = Runtime.instance() ;
            Properties properties = new ExtendedProperties() ;
            properties.setProperty(Profile.GUI, "false") ;
            Profile profile = new ProfileImpl(properties) ;
            AgentContainer patientContainer = runtime.createAgentContainer(profile) ;
            AgentController agentController = patientContainer.createNewAgent("patient", PatientAgent.class.getName(), new Object[]{}) ;
            agentController.start() ;
        }
        catch(ControllerException e){
            e.printStackTrace() ;
        }
    }
}
