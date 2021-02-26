/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import gui.Bienvenidos;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Bingo {
    boolean bingo = false;
    public static void main(String[] args) {
        Targetillas bn = new Targetillas();
        
        bn.ilistas();
        Scanner sc = new Scanner(System.in);
        bn.mcartilla();
        Bienvenidos b = new Bienvenidos();
        b.setVisible(true);
    }
}
