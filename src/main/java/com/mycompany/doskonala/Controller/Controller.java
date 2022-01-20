/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doskonala.Controller;

import com.mycompany.doskonala.Model.Model;
import com.mycompany.doskonala.View.View;
import java.util.Scanner;

/**
 *
 * @author J->J
 * @version 1
 */
/**
 Controller class*/
public class Controller {

    public Controller() {
    }
    /**
     Main method
     Ask user to put value of lower compartment and higher compartment.Then based on this scope looks for perfect number.
     Show our perfect number from typed scope.
     @param args
     * @throws com.mycompany.doskonala.Controller.ControllerExceptionHandler*/

    public static void main(String args[]) throws ControllerExceptionHandler {

        Model theModel = new Model();
        View theView = new View();
        Controller theController = new Controller();

        theView.showDialogLower();
        theModel.setLower(theModel.checkLowerCompartments(theModel.takeLowerCompartments()));
        theView.showDialogHigher();
        theModel.setHigher(theModel.checkHigherCompartments(theModel.takeHigherCompartments()));
        theView.showPerfectNumbers(theModel.findPerfectNumberBetweenLowerAndHigher(theModel.getLower(),theModel.getHigher()));
    }
}