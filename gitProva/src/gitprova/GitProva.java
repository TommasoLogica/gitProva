/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitprova;

/**
 *
 * @author Antonio
 */
public class GitProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.print("Prova ");
        System.out.println(a+b);
        prova1 pr1 = new prova1();
        System.out.print("Nuova riga subMaster per prova merge");
        pr1.stampa();
        
    }
    
}
