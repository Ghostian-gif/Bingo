/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Random;

/**
 *
 * @author sebas
 */
public class Bolas {
    private int numero = 0;
    public void bolillas(){
        String[] bolillas = new String[5];
        bolillas[0]="B";
        bolillas[1]="I";
        bolillas[2]="N";
        bolillas[3]="G";
        bolillas[4]="O";
        
        Random r = new Random();
        
        String bolilla = bolillas[r.nextInt(5)];
        
        numero = r.nextInt(15);
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

    public int getNumero() {
        return numero;
    }
    
}
