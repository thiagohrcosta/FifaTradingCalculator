/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifatrade;

import Entities.jogador;
import Price.eaDiscount5;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class FifaTrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner
        
        Scanner sc = new Scanner (System.in);
        
        // Name of the Player
        System.out.println("============================================================================");
        jogador newPlayer = new jogador();
        System.out.print("Digite o nome do jogador:          ");
        newPlayer.Name = sc.nextLine();
        System.out.print("Digite o overall do jogador:       ");
        newPlayer.Overall = sc.nextInt();
        System.out.print("Digite o preço de compra:          ");
        newPlayer.buyPrice = sc.nextDouble();
        System.out.print("Digite o preço de venda:           ");
        newPlayer.sellPrice = sc.nextDouble();
                        
        // The EA Discount is 5% of the selling price
        
        eaDiscount5 discount = new eaDiscount5();
        discount.eaDiscount = 0.05;
        
        eaDiscount5 profit = new eaDiscount5();
        profit.eaDiscount = 0.95;
        
        System.out.println("============================================================================");
        System.out.println("Player Name:       " + newPlayer.Name);
        System.out.println("Player Overall :   " + newPlayer.Overall);
        System.out.println("Players bought by: " + newPlayer.buyPrice);
        System.out.println("Player selling by: " + newPlayer.sellPrice);
        System.out.println("============================================================================");
        System.out.println("O seu lucro líquido será de: " + 
                ((newPlayer.sellPrice) * profit.eaDiscount - newPlayer.buyPrice) + " por carta vendida");
        System.out.println("============================================================================");
        System.out.println("Você receberá em sua conta após a venda o total de: " + 
                ((newPlayer.sellPrice*discount.eaDiscount) - newPlayer.sellPrice)*(-1) + " coins");
        
        
        
        
       
    }
    
}
