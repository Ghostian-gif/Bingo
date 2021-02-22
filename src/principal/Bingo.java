/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import gui.Bienvenidos;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sebas
 */
public class Bingo {
    ArrayList Lb = new ArrayList();
    ArrayList Li = new ArrayList();
    ArrayList Ln = new ArrayList();
    ArrayList Lg = new ArrayList();
    ArrayList Lo = new ArrayList();
        
    boolean bingo = false;
    
    public void ilistas(){
        this.Lb.add("B");
        this.Li.add("I");
        this.Ln.add("N");
        this.Lg.add("G");
        this.Lo.add("O");
        
    }
    
    public void mcartilla(){
        this.glistas();
        System.out.println("-------------");
        for(int i=0; i<this.Lb.size();i++){
            System.out.println("|\t"+this.Lb.get(i)+"\t|\t"+this.Li.get(i)+"\t|\t"+this.Ln.get(i)+"\t|\t"+this.Lg.get(i)+"\t|\t"+this.Lo.get(i)+"\t|\t");
        }
        System.out.println("-------------");
    }
    public void glistas(){
        Random rd = new Random();
        for(int i=0; i<5;i++){
            this.Lb.add(rd.nextInt(15));
            this.Li.add(rd.nextInt(15)+15);
            this.Ln.add(rd.nextInt(15)+30);
            this.Lg.add(rd.nextInt(15)+45);
            this.Lo.add(rd.nextInt(15)+60);
          
        }
    }
    public void bolillas(){
        String[] bolillas = new String[5];
        bolillas[0]="B";
        bolillas[1]="I";
        bolillas[2]="N";
        bolillas[3]="G";
        bolillas[4]="O";
        
        Random r = new Random();
        
        String bolilla = bolillas[r.nextInt(5)];
        
        int numero = r.nextInt(15);
        switch(bolilla){
            case "B":
                break;
            case "I":
                numero += 15;
                break;
            case "N":
                numero += 30;
                break;
            case "G":
                numero += 45;
                break;
            case "O":
                numero += 60;
                break;
        }
        System.out.println(bolilla + numero);
    }
    public static void main(String[] args) {
        Bingo bn = new Bingo();
        bn.ilistas();
        bn.mcartilla();
        bn.bolillas();
        
        Bienvenidos b = new Bienvenidos();
        b.setVisible(true);
        
        
    }
    
}
