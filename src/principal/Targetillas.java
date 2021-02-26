/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sebas
 */
public class Targetillas {
    public static ArrayList Lb = new ArrayList();
    public static ArrayList Li = new ArrayList();
    public static ArrayList Ln = new ArrayList();
    public static ArrayList Lg = new ArrayList();
    public static ArrayList Lo = new ArrayList();
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
        System.out.println(Lb.size());
        for(int i=0; i<this.Lb.size();i++){
            System.out.println("|\t"+this.Lb.get(i)+"\t|\t"+this.Li.get(i)+"\t|\t"+this.Ln.get(i)+"\t|\t"+this.Lg.get(i)+"\t|\t"+this.Lo.get(i)+"\t|\t");
        }
        System.out.println("-------------");
    }
    public void glistas(){
        Random rd = new Random();
        int estado = 0;
        int arreglo[] = new int[5];
        int arregloaux[] = new int[5];
        for(int i=0; i<5; i++){
            arregloaux[i]=80;
        }
        for(int i=0; i<5;i++){
            
            int r = rd.nextInt(15);
            
            arreglo[i]= r;
            for(int j =0; j<5;j++){
                if (r==0){
                    i--;
                    estado++;
                }
                else if(arreglo[i]==arregloaux[j]){
                    i--;
                    estado++;
                }
            }
            if(estado==0){
                this.Lb.add(r);
                this.Li.add(r+15);
                this.Ln.add(r+30);
                this.Lg.add(r+45);
                this.Lo.add(r+60);
            }
            else{
                estado=0;
            }
        }
    }
}
