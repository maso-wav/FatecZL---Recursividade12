package Controller;

public class InverteController {
    
    public InverteController(){
        
        super();
    }
    
    public int[] inverteValores(int[] vetor, int tamanho, int i, int tamanhoAux){
        
        if(tamanho == tamanhoAux){
            
            return vetor;
            
        } else {            
                                    
            int aux = vetor[i];
            vetor[i] = vetor[tamanho];
            vetor[tamanho] = aux;
            
            return inverteValores(vetor, (tamanho - 1), (i + 1), tamanhoAux);
        }
        
        
    }
}
