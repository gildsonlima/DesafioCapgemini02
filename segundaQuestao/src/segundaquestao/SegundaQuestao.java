/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundaquestao;

import javax.swing.JOptionPane;

/**
 *
 * @author GCL
 */
public class SegundaQuestao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] n = {1, 5, 3, 4, 2};                                                          //Declarando o vetor predefinido para exemplo podendo ser mudado
        int x = 0,cont = 0;                                                                 //Declarandoa a variavel que ser usada para medir a diferenca
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da difereça."));   //Atribuindo valor a variavel x para usar para media a diferença
        
        System.out.println(x);                                                              //Imprimindo a variavel x para teste de fucionamento da atribuição
        
        for (int j = 0; j < n.length; j++)                                                  //Estrutura de repetição usado para valor o valor a referencia para medir a diferença com os outros
        {
            for (int i = 0; i < n.length; i++)                                              //Estrutura de repetição usada para mudar o valor que vai ser medido a diferença com o valor referencia
            {
                if(i!=j)                                                                    //Estrutura de condicional para evitar a comparação de numeros na mesma posição
                {
                    if(x == (n[j]-n[i]))if(i!=j)                                            //Estrutura de condicional verificar de os dois numero tem a deferença igual a informada e contabilizar
                    {
                        cont++; 
                        System.out.println("["+n[i]+","+n[j]+"]");                          //Imprimindo o valore que tem a diferença igual a informada
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Exitem "+cont+" pares de numeros com essa diferença entre eles."); //Mostrando o numero de pares
        
    }
    
}
