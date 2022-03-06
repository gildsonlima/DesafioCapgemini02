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
        
        int[] n = {1, 5, 3, 4, 2};
        int x = 0,cont = 0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da difereça."));
        
        System.out.println(x);
        
        for (int j = 0; j < n.length; j++) 
        {
            for (int i = 0; i < n.length; i++) 
            {
                if(x == (n[i]-n[j]))
                {
                    if(i!=j)
                    {
                        cont++; 
                        System.out.println(cont+" pares");
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Exitem "+cont+" pares de numeros com essa diferença entre eles.");
        
    }
    
}
