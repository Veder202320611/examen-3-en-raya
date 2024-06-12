/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenrayamvc;

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String Args[]){
    ModelGame model = new ModelGame();
    ViewGame view = new ViewGame();
    ControllerGame controlador = new ControllerGame(view, model);
    view.setLocationRelativeTo(null);
    view.setVisible(true);
    
    }
}
