/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;


/**
 *
 * @author sebas
 */
public class Bienvenidos extends JFrame implements ActionListener{
    
    private int VBAncho = 1920, VBAlto =1080;
    private JLabel LBienvenidos;
    private ImageIcon IBienvenidos;
    public Bienvenidos(){
        this.setLayout(null);
        this.setTitle("BIENVENIDOS");
        this.setSize(VBAncho, VBAlto);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.lightGray);
        
        crearComponentes();
        Acciones();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void crearComponentes(){
        crearPanel();
        crearIcon();
        crearLabel();
        
        crearBotones();
        
    }
    public void crearPanel(){
        
    }
    public void crearLabel(){
        LBienvenidos = new JLabel();
        LBienvenidos.setLayout(null);
        LBienvenidos.setBounds(0, 0, 1920, 1080);
        LBienvenidos.setIcon(new ImageIcon(IBienvenidos.getImage().getScaledInstance(LBienvenidos.getWidth(), LBienvenidos.getHeight(), Image.SCALE_AREA_AVERAGING)));
        this.getContentPane().add(LBienvenidos);
    }
    public void crearIcon(){
        IBienvenidos = new ImageIcon(getClass().getResource("/imagenes/BingoPrincipal.png"));
    }
    public void crearBotones(){
        
    }
    private void Acciones(){
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
