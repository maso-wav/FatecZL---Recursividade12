package View;

import Controller.InverteController;

public class InvertePrincipal {
    
    public static void main (String args[]){
        
        InverteController ic = new InverteController();
        
        int i = 0;
        int[] vetor = {3,2,5,9,15,32,52,17,10};
        int tamanho = vetor.length;
        int tamanhoAux = tamanho / 2;        
        int[] inversao = ic.inverteValores(vetor, (tamanho - 1), i, tamanhoAux);
        
        
        for(i = 0; i < vetor.length; i++){
            
            System.out.println("VETOR INVERTIDO: " + inversao[i] + ".");
        }
        
    }
    
}
