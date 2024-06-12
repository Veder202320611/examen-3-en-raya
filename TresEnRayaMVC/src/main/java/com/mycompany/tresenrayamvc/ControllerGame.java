/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tresenrayamvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class ControllerGame {
    private ViewGame view;
    private ModelGame model;
    private JLabel[][] casillas;
    public ControllerGame(ViewGame view, ModelGame model){
      this.view=view;
      this.model=model;
      casillas = view.getCasillas();
      agregarListeners();
      crearJugadores();
    }

    private void agregarListeners() {
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                agregarEventoMouse(i,j);
            }
        }
        JButton botonreset = view.getBotonReset();
        botonreset.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            model.resetGame(casillas);
        }
        }
        );
     
    }

    private void agregarEventoMouse(int i, int j) {
        JLabel casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e){
            model.marcarCasilla(i,j,casillas);
        }
        });
        }

    private void crearJugadores() {
       JLabel J1 =view.getVictoriasJ1();
       JLabel J2 =view.getVictoriasJ2();
       model.setJugadores(J1,J2);
    }
        
}    

