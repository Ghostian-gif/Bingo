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
import java.util.Random;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import principal.Bingo;



/**
 *
 * @author sebas
 */
public class Bienvenidos extends JFrame implements ActionListener{
    
    private int VBAncho = 1920, VBAlto =1080;
    private int estado=0;
    private int contador=0;
    private JPanel RBola;
    private JPanel Pmostrar;
    private JPanel Pocultar;
    private JPanel Pspin;
    private JPanel Pjugar;
    private JPanel Ptargeta;
    private JLabel LBienvenidos;
    private JLabel Bolas;
    private JLabel Ltargeta;
    private JButton mostrarB;
    private JButton ocultarB;
    private JButton spin;
    private JButton jugar;
    private JButton retornar;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton i1;
    private JButton i2;
    private JButton i3;
    private JButton i4;
    private JButton i5;
    private JButton n1;
    private JButton n2;
    private JButton n3;
    private JButton n4;
    private JButton n5;
    private JButton g1;
    private JButton g2;
    private JButton g3;
    private JButton g4;
    private JButton g5;
    private JButton o1;
    private JButton o2;
    private JButton o3;
    private JButton o4;
    private JButton o5;
    private ImageIcon Ix;
    private ImageIcon Ib1;
    private ImageIcon Ib2;
    private ImageIcon Ib3;
    private ImageIcon Ib4;
    private ImageIcon Ib5;
    private ImageIcon Ii1;
    private ImageIcon Ii2;
    private ImageIcon Ii3;
    private ImageIcon Ii4;
    private ImageIcon Ii5;
    private ImageIcon In1;
    private ImageIcon In2;
    private ImageIcon In3;
    private ImageIcon In4;
    private ImageIcon In5;
    private ImageIcon Ig1;
    private ImageIcon Ig2;
    private ImageIcon Ig3;
    private ImageIcon Ig4;
    private ImageIcon Ig5;
    private ImageIcon Io1;
    private ImageIcon Io2;
    private ImageIcon Io3;
    private ImageIcon Io4;
    private ImageIcon Io5;
    
    private ImageIcon IBienvenidos;
    private ImageIcon mostrarI;
    private ImageIcon ocultarI;
    private ImageIcon girador;
    private ImageIcon spinI;
    private ImageIcon Ijugar;
    private ImageIcon Itargeta;
    private Timer timer;
    private TimerTask task;
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
        RBola = new JPanel();
        RBola.setLayout(null);
        RBola.setBounds(200, 500, 400, 400);
        RBola.setBackground(Color.WHITE);
        this.getContentPane().add(RBola);
        RBola.setVisible(false);
        
        Pmostrar = new JPanel();
        Pmostrar.setLayout(null);
        Pmostrar.setBounds(40,1000,40,40);
        this.getContentPane().add(Pmostrar);
        Pmostrar.setVisible(false);
        
        Pocultar = new JPanel();
        Pocultar.setLayout(null);
        Pocultar.setBounds(40,950,40,40);
        this.getContentPane().add(Pocultar);
        Pocultar.setVisible(false);
        
        Pspin = new JPanel();
        Pspin.setLayout(null);
        Pspin.setBounds(250, 950, 300, 80);
        this.getContentPane().add(Pspin);
        Pspin.setVisible(false);
        
        Pjugar = new JPanel();
        Pjugar.setLayout(null);
        Pjugar.setBounds(800, 800, 400, 100);
        this.getContentPane().add(Pjugar);
        
        Ptargeta = new JPanel();
        Ptargeta.setLayout(null);
        Ptargeta.setBounds(1300, 200, 500, 600);
        this.getContentPane().add(Ptargeta);
        Ptargeta.setVisible(false);
    }
    public void crearLabel(){
        LBienvenidos = new JLabel();
        LBienvenidos.setLayout(null);
        LBienvenidos.setBounds(0, 0, 1920, 1080);
        LBienvenidos.setIcon(new ImageIcon(IBienvenidos.getImage().getScaledInstance(LBienvenidos.getWidth(), LBienvenidos.getHeight(), Image.SCALE_AREA_AVERAGING)));
        this.getContentPane().add(LBienvenidos);
        
        Bolas = new JLabel();
        Bolas.setLayout(null);
        Bolas.setBounds(0,0, 400, 400);
        Bolas.setIcon(new ImageIcon(girador.getImage().getScaledInstance(Bolas.getWidth(), Bolas.getHeight(), Image.SCALE_AREA_AVERAGING)));
        RBola.add(Bolas);
        
        Ltargeta = new JLabel();
        Ltargeta.setLayout(null);
        Ltargeta.setBounds(0, 0, 500, 600);
        Ltargeta.setIcon(new ImageIcon(Itargeta.getImage().getScaledInstance(Ltargeta.getWidth(), Ltargeta.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(Ltargeta);
        
    }
    public void crearIcon(){
        Bingo b = new Bingo();
        Ix=new ImageIcon(getClass().getResource("/imagenes/x.jpg"));
        IBienvenidos = new ImageIcon(getClass().getResource("/imagenes/BingoPrincipal.png"));
        mostrarI = new ImageIcon(getClass().getResource("/imagenes/mostrar.png"));
        ocultarI = new ImageIcon(getClass().getResource("/imagenes/ocultar.png"));
        girador = new ImageIcon(getClass().getResource("/imagenes/Girador.jpg"));
        spinI = new ImageIcon(getClass().getResource("/imagenes/girar.png"));
        Ijugar = new ImageIcon(getClass().getResource("/imagenes/jugar.png"));
        Itargeta = new ImageIcon(getClass().getResource("/imagenes/TargetaBingo.png"));
        int num = (int) b.Lb.get(1);
        Ib1 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lb.get(2);
        Ib2 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lb.get(3);
        Ib3 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lb.get(4);
        Ib4 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lb.get(5);
        Ib5 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Li.get(1);
        Ii1 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Li.get(2);
        Ii2 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Li.get(3);
        Ii3 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Li.get(4);
        Ii4 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Li.get(5);
        Ii5 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Ln.get(1);
        In1 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Ln.get(2);
        In2 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Ln.get(3);
        In3 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Ln.get(4);
        In4 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Ln.get(5);
        In5 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lg.get(1);
        Ig1 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lg.get(2);
        Ig2 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lg.get(3);
        Ig3 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lg.get(4);
        Ig4 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lg.get(5);
        Ig5 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lo.get(1);
        Io1 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lo.get(2);
        Io2 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lo.get(3);
        Io3 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lo.get(4);
        Io4 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
        num = (int) b.Lo.get(5);
        Io5 = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
    }
    public void crearBotones(){
        Bingo b = new Bingo();
        mostrarB = new JButton();
        mostrarB.setLayout(null);
        mostrarB.setBounds(0,0,40,40);
        mostrarB.setBackground(Color.WHITE);
        mostrarB.setIcon(new ImageIcon(mostrarI.getImage().getScaledInstance(mostrarB.getWidth(), mostrarB.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Pmostrar.add(mostrarB);
        
        ocultarB = new JButton();
        ocultarB.setLayout(null);
        ocultarB.setBounds(0,0,40,40);
        ocultarB.setBackground(Color.WHITE);
        ocultarB.setIcon(new ImageIcon(ocultarI.getImage().getScaledInstance(ocultarB.getWidth(), ocultarB.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Pocultar.add(ocultarB);
        
        spin = new JButton("spin");
        spin.setLayout(null);
        spin.setBounds(0,0,300,80);
        spin.setBackground(Color.BLACK);
        spin.setIcon(new ImageIcon(spinI.getImage().getScaledInstance(spin.getWidth(), spin.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Pspin.add(spin);
        
        retornar = new JButton("retornar");
        retornar.setLayout(null);
        retornar.setBounds(1300,880,400,80);
        this.getContentPane().add(retornar);
        
        jugar = new JButton("jugar");
        jugar.setLayout(null);
        jugar.setBounds(0,0,400,100);
        jugar.setBackground(Color.MAGENTA);
        jugar.setIcon(new ImageIcon(Ijugar.getImage().getScaledInstance(jugar.getWidth(), jugar.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Pjugar.add(jugar);
        
        b1 = new JButton("b1");
        b1.setLayout(null);
        b1.setBounds(45, 200, 45, 45);
        b1.setIcon(new ImageIcon(Ib1.getImage().getScaledInstance(b1.getWidth()+12, b1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(b1);
        b2 = new JButton("b2");
        b2.setLayout(null);
        b2.setBounds(45, 270, 45, 45);
        b2.setIcon(new ImageIcon(Ib2.getImage().getScaledInstance(b2.getWidth()+12, b2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(b2);
        b3 = new JButton("b3");
        b3.setLayout(null);
        b3.setBounds(45, 340, 45, 45);
        b3.setIcon(new ImageIcon(Ib3.getImage().getScaledInstance(b3.getWidth()+12, b3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        
        Ptargeta.add(b3);
        b4 = new JButton("b4");
        b4.setLayout(null);
        b4.setBounds(45, 410, 45, 45);
        b4.setIcon(new ImageIcon(Ib4.getImage().getScaledInstance(b4.getWidth()+12, b4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(b4);
        b5 = new JButton("b5");
        b5.setLayout(null);
        b5.setBounds(45, 480, 45, 45);
        b5.setIcon(new ImageIcon(Ib5.getImage().getScaledInstance(b5.getWidth()+12, b5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(b5);
        i1 = new JButton("i1");
        i1.setLayout(null);
        i1.setBounds(135, 200, 45, 45);
        i1.setIcon(new ImageIcon(Ii1.getImage().getScaledInstance(i1.getWidth()+12, i1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(i1);
        i2 = new JButton("i1");
        i2.setLayout(null);
        i2.setBounds(135, 270, 45, 45);
        i2.setIcon(new ImageIcon(Ii2.getImage().getScaledInstance(i2.getWidth()+12, i2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(i2);
        i3 = new JButton("i1");
        i3.setLayout(null);
        i3.setBounds(135, 340, 45, 45);
        i3.setIcon(new ImageIcon(Ii3.getImage().getScaledInstance(i3.getWidth()+12, i3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(i3);
        i4 = new JButton("i1");
        i4.setLayout(null);
        i4.setBounds(135, 410, 45, 45);
        i4.setIcon(new ImageIcon(Ii4.getImage().getScaledInstance(i4.getWidth()+12, i4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(i4);
        i5 = new JButton("i1");
        i5.setLayout(null);
        i5.setBounds(135, 480, 45, 45);
        i5.setIcon(new ImageIcon(Ii5.getImage().getScaledInstance(i5.getWidth()+12, i5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(i5);
        n1 = new JButton("n1");
        n1.setLayout(null);
        n1.setBounds(225, 200, 45, 45);
        n1.setIcon(new ImageIcon(In1.getImage().getScaledInstance(n1.getWidth()+12, n1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(n1);
        n2 = new JButton("n1");
        n2.setLayout(null);
        n2.setBounds(225, 270, 45, 45);
        n2.setIcon(new ImageIcon(In2.getImage().getScaledInstance(n2.getWidth()+12, n2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(n2);
        n3 = new JButton("n1");
        n3.setLayout(null);
        n3.setBounds(225, 340, 45, 45);
        n3.setIcon(new ImageIcon(In3.getImage().getScaledInstance(n3.getWidth()+12, n3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(n3);
        n4 = new JButton("n1");
        n4.setLayout(null);
        n4.setBounds(225, 410, 45, 45);
        n4.setIcon(new ImageIcon(In4.getImage().getScaledInstance(n4.getWidth()+12, n4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(n4);
        n5 = new JButton("n1");
        n5.setLayout(null);
        n5.setBounds(225, 480, 45, 45);
        n5.setIcon(new ImageIcon(In5.getImage().getScaledInstance(n5.getWidth()+12, n5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(n5);
        g1 = new JButton("n1");
        g1.setLayout(null);
        g1.setBounds(315, 200, 45, 45);
        g1.setIcon(new ImageIcon(Ig1.getImage().getScaledInstance(g1.getWidth()+12, g1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(g1);
        g2 = new JButton("n1");
        g2.setLayout(null);
        g2.setBounds(315, 270, 45, 45);
        g2.setIcon(new ImageIcon(Ig2.getImage().getScaledInstance(g2.getWidth()+12, g2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(g2);
        g3 = new JButton("n1");
        g3.setLayout(null);
        g3.setBounds(315, 340, 45, 45);
        g3.setIcon(new ImageIcon(Ig3.getImage().getScaledInstance(g3.getWidth()+12, g3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(g3);
        g4 = new JButton("n1");
        g4.setLayout(null);
        g4.setBounds(315, 410, 45, 45);
        g4.setIcon(new ImageIcon(Ig4.getImage().getScaledInstance(g4.getWidth()+12, g4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(g4);
        g5 = new JButton("n1");
        g5.setLayout(null);
        g5.setBounds(315, 480, 45, 45);
        g5.setIcon(new ImageIcon(Ig5.getImage().getScaledInstance(g5.getWidth()+12, g5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(g5);
        o1 = new JButton("n1");
        o1.setLayout(null);
        o1.setBounds(405, 200, 45, 45);
        o1.setIcon(new ImageIcon(Io1.getImage().getScaledInstance(o1.getWidth()+12, o1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(o1);
        o2 = new JButton("n1");
        o2.setLayout(null);
        o2.setBounds(405, 270, 45, 45);
        o2.setIcon(new ImageIcon(Io2.getImage().getScaledInstance(o2.getWidth()+12, o2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(o2);
        o3 = new JButton("n1");
        o3.setLayout(null);
        o3.setBounds(405, 340, 45, 45);
        o3.setIcon(new ImageIcon(Io3.getImage().getScaledInstance(o3.getWidth()+12, o3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(o3);
        o4 = new JButton("n1");
        o4.setLayout(null);
        o4.setBounds(405, 410, 45, 45);
        o4.setIcon(new ImageIcon(Io4.getImage().getScaledInstance(o4.getWidth()+12, o4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(o4);
        o5 = new JButton("n1");
        o5.setLayout(null);
        o5.setBounds(405, 480, 45, 45);
        o5.setIcon(new ImageIcon(Io5.getImage().getScaledInstance(o5.getWidth()+12, o5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        Ptargeta.add(o5);
    }
    private void Acciones(){
        mostrarB.setActionCommand("mostrarB");
        mostrarB.addActionListener(this);
        
        ocultarB.setActionCommand("ocultarB");
        ocultarB.addActionListener(this);
        
        spin.setActionCommand("spin");
        spin.addActionListener(this);
        
        jugar.setActionCommand("jugar");
        jugar.addActionListener(this);
        
        b1.setActionCommand("b1");
        b1.addActionListener(this);
        
        b2.setActionCommand("b2");
        b2.addActionListener(this);
        
        b3.setActionCommand("b3");
        b3.addActionListener(this);
        
        b4.setActionCommand("b4");
        b4.addActionListener(this);
        
        b5.setActionCommand("b5");
        b5.addActionListener(this);
        
        i1.setActionCommand("i1");
        i1.addActionListener(this);
        
        i2.setActionCommand("i2");
        i2.addActionListener(this);
        
        i3.setActionCommand("i3");
        i3.addActionListener(this);
        
        i4.setActionCommand("i4");
        i4.addActionListener(this);
        
        i5.setActionCommand("i5");
        i5.addActionListener(this);
        
        n1.setActionCommand("n1");
        n1.addActionListener(this);
        
        n2.setActionCommand("n2");
        n2.addActionListener(this);
        
        n3.setActionCommand("n3");
        n3.addActionListener(this);
        
        n4.setActionCommand("n4");
        n4.addActionListener(this);
        
        n5.setActionCommand("n5");
        n5.addActionListener(this);
        
        g1.setActionCommand("g1");
        g1.addActionListener(this);
        
        g2.setActionCommand("g2");
        g2.addActionListener(this);
        
        g3.setActionCommand("g3");
        g3.addActionListener(this);
        
        g4.setActionCommand("g4");
        g4.addActionListener(this);
        
        g5.setActionCommand("g5");
        g5.addActionListener(this);
        
        o1.setActionCommand("o1");
        o1.addActionListener(this);
        
        o2.setActionCommand("o2");
        o2.addActionListener(this);
        
        o3.setActionCommand("o3");
        o3.addActionListener(this);
        
        o4.setActionCommand("o4");
        o4.addActionListener(this);
        
        o5.setActionCommand("o5");
        o5.addActionListener(this);
        
        retornar.setActionCommand("retornar");
        retornar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("mostrarB")){
            RBola.setVisible(true);
        }
        else if (ae.getActionCommand().equals("ocultarB")){
            RBola.setVisible(false);
        }
        else if (ae.getActionCommand().equals("spin")){
            estado = 1;
            timer = new Timer();
            task = new TimerTask(){
                @Override
                
                public void run() {
                    if(estado==0){
                       
                    }
                    else if(estado==1 && contador <15){
                        Random ri = new Random();
                        int rinter = ri.nextInt(75);
                        girador = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(rinter)+".jpg"));
                        Bolas.setIcon(new ImageIcon(girador.getImage().getScaledInstance(Bolas.getWidth(), Bolas.getHeight(), Image.SCALE_AREA_AVERAGING)));
                        contador++;
                    }
                    else if(estado==1 && contador==15){
                        estado = 2;
                        System.out.println(contador);
                    }
                    else if(estado==2){
                        System.out.println(contador);
                        Bingo bn = new Bingo();
                        bn.bolillas();
                        int num = 0;
                        num = bn.getNumero();
                        girador = new ImageIcon(getClass().getResource("/imagenes/Bola"+String.valueOf(num)+".jpg"));
                        Bolas.setIcon(new ImageIcon(girador.getImage().getScaledInstance(Bolas.getWidth(), Bolas.getHeight(), Image.SCALE_AREA_AVERAGING)));
                        contador =0;
                        timer.cancel();
                        
                        estado =0;
                    }
                }
                
            };
            timer.schedule(task,0,100);
        }
        else if (ae.getActionCommand().equals("jugar")){
            Pspin.setVisible(true);
            Pmostrar.setVisible(true);
            Pocultar.setVisible(true);
            Ptargeta.setVisible(true);
            Pjugar.setVisible(false);
        }
        else if (ae.getActionCommand().equals("b1")){
            b1.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(b1.getWidth()+12, b1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("b2")){
            b2.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(b2.getWidth()+12, b2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("b3")){
            b3.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(b3.getWidth()+12, b3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("b4")){
            b4.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(b4.getWidth()+12, b4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("b5")){
            b5.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(b5.getWidth()+12, b5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("i1")){
            i1.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(i1.getWidth()+12, i1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("i2")){
            i2.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(i2.getWidth()+12, i2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("i3")){
            i3.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(i3.getWidth()+12, i3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("i4")){
            i4.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(i4.getWidth()+12, i4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("i5")){
            i5.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(i5.getWidth()+12, i5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("n1")){
            n1.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(n1.getWidth()+12, n1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("n2")){
            n2.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(n2.getWidth()+12, n2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("n3")){
            n3.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(n3.getWidth()+12, n3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("n4")){
            n4.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(n4.getWidth()+12, n4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("n5")){
            n5.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(n5.getWidth()+12, n5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("g1")){
            g1.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(g1.getWidth()+12, g1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("g2")){
            g2.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(g2.getWidth()+12, g2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("g3")){
            g3.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(g3.getWidth()+12, g3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("g4")){
            g4.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(g4.getWidth()+12, g4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("g5")){
            g5.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(g5.getWidth()+12, g5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("o1")){
            o1.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(o1.getWidth()+12, o1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("o2")){
            o2.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(o2.getWidth()+12, o2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("o3")){
            o3.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(o3.getWidth()+12, o3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("o4")){
            o4.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(o4.getWidth()+12, o4.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }
        else if (ae.getActionCommand().equals("o5")){
            o5.setIcon(new ImageIcon(Ix.getImage().getScaledInstance(o5.getWidth()+12, o5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }else if (ae.getActionCommand().equals("retornar")){
            b1.setIcon(new ImageIcon(Ib1.getImage().getScaledInstance(b1.getWidth()+12, b1.getHeight(), Image.SCALE_AREA_AVERAGING)));
            b2.setIcon(new ImageIcon(Ib2.getImage().getScaledInstance(b2.getWidth()+12, b2.getHeight(), Image.SCALE_AREA_AVERAGING)));
            b3.setIcon(new ImageIcon(Ib3.getImage().getScaledInstance(b3.getWidth()+12, b3.getHeight(), Image.SCALE_AREA_AVERAGING)));
            b4.setIcon(new ImageIcon(Ib4.getImage().getScaledInstance(b4.getWidth()+12, b4.getHeight(), Image.SCALE_AREA_AVERAGING)));
            b5.setIcon(new ImageIcon(Ib5.getImage().getScaledInstance(b5.getWidth()+12, b5.getHeight(), Image.SCALE_AREA_AVERAGING)));
            i1.setIcon(new ImageIcon(Ii1.getImage().getScaledInstance(i1.getWidth()+12, i1.getHeight(), Image.SCALE_AREA_AVERAGING)));
            i2.setIcon(new ImageIcon(Ii2.getImage().getScaledInstance(i2.getWidth()+12, i2.getHeight(), Image.SCALE_AREA_AVERAGING)));
            i3.setIcon(new ImageIcon(Ii3.getImage().getScaledInstance(i3.getWidth()+12, i3.getHeight(), Image.SCALE_AREA_AVERAGING)));
            i4.setIcon(new ImageIcon(Ii4.getImage().getScaledInstance(i4.getWidth()+12, i4.getHeight(), Image.SCALE_AREA_AVERAGING)));
            i5.setIcon(new ImageIcon(Ii5.getImage().getScaledInstance(i5.getWidth()+12, i5.getHeight(), Image.SCALE_AREA_AVERAGING)));
            n1.setIcon(new ImageIcon(In1.getImage().getScaledInstance(n1.getWidth()+12, n1.getHeight(), Image.SCALE_AREA_AVERAGING)));
            n2.setIcon(new ImageIcon(In2.getImage().getScaledInstance(n2.getWidth()+12, n2.getHeight(), Image.SCALE_AREA_AVERAGING)));
            n3.setIcon(new ImageIcon(In3.getImage().getScaledInstance(n3.getWidth()+12, n3.getHeight(), Image.SCALE_AREA_AVERAGING)));
            n4.setIcon(new ImageIcon(In4.getImage().getScaledInstance(n4.getWidth()+12, n4.getHeight(), Image.SCALE_AREA_AVERAGING)));
            n5.setIcon(new ImageIcon(In5.getImage().getScaledInstance(n5.getWidth()+12, n5.getHeight(), Image.SCALE_AREA_AVERAGING)));
            g1.setIcon(new ImageIcon(Ig1.getImage().getScaledInstance(g1.getWidth()+12, g1.getHeight(), Image.SCALE_AREA_AVERAGING)));
            g2.setIcon(new ImageIcon(Ig2.getImage().getScaledInstance(g2.getWidth()+12, g2.getHeight(), Image.SCALE_AREA_AVERAGING)));
            g3.setIcon(new ImageIcon(Ig3.getImage().getScaledInstance(g3.getWidth()+12, g3.getHeight(), Image.SCALE_AREA_AVERAGING)));
            g4.setIcon(new ImageIcon(Ig4.getImage().getScaledInstance(g4.getWidth()+12, g4.getHeight(), Image.SCALE_AREA_AVERAGING)));
            g5.setIcon(new ImageIcon(Ig5.getImage().getScaledInstance(g5.getWidth()+12, g5.getHeight(), Image.SCALE_AREA_AVERAGING)));
            o1.setIcon(new ImageIcon(Io1.getImage().getScaledInstance(o1.getWidth()+12, o1.getHeight(), Image.SCALE_AREA_AVERAGING)));
            o2.setIcon(new ImageIcon(Io2.getImage().getScaledInstance(o2.getWidth()+12, o2.getHeight(), Image.SCALE_AREA_AVERAGING)));
            o3.setIcon(new ImageIcon(Io3.getImage().getScaledInstance(o3.getWidth()+12, o3.getHeight(), Image.SCALE_AREA_AVERAGING)));
            o4.setIcon(new ImageIcon(Io4.getImage().getScaledInstance(o4.getWidth()+12, o4.getHeight(), Image.SCALE_AREA_AVERAGING)));
            o5.setIcon(new ImageIcon(Io5.getImage().getScaledInstance(o5.getWidth()+12, o5.getHeight(), Image.SCALE_AREA_AVERAGING)));
        }

    }
}
