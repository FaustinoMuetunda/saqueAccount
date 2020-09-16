/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saqueaccount;

import java.util.Scanner;
import model.etities.Account;
import model.exceptions.DomainException;

/**
 *
 * @author faust
 */
public class SaqueAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Dados da conta:");
        System.out.print("Numero: ");
        int numero=sc.nextInt();
        System.out.print("Titulo: ");
        sc.nextLine();
        String nome=sc.nextLine();
        System.out.print("Saldo Inicial: ");
        double saldo=sc.nextDouble();
        System.out.print("Saque limite: ");
        double saque=sc.nextDouble();
        
        Account acc= new Account(numero, nome, saldo, saque);
        
        System.out.println();
        
        System.out.print("Montante de saque: ");
        double montante=sc.nextDouble();
        
        try{
            acc.levantamento(montante);
            
            System.out.println("Novo Saldo: "+String.format("%.2f", acc.getSaldo()));
        
        
        }
        catch(DomainException e){
            
            System.out.println("Erro no Saque:"+e.getMessage());
        
        }
        
         catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
        
        // TODO code application logic here
    }
    
}
