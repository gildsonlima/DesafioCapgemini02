/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Encriptador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String s = "";								//Inicializando a variavel que vai receber a string para ser incriptada
        
        s = JOptionPane.showInputDialog("Digite a string");			//Usando um JOptionpane para solicitar do usuario a string
        
        System.out.println(s);							//Testando para saber se foi adicionada algo na variavel realmente
        
        s = Encriptar.removerEspaco(s);						//Chamando o metodo que retira os espa�os da string
        
        System.out.println(s);							//Testando se foram retirados realmente os espa�os da string
        
        System.out.println(s.length());						//Imprimindo o tamanho da string sem os espa�os
        
        s = Encriptar.criptografar(s);						//Chamando metodo que criptografa a string
        
        JOptionPane.showMessageDialog(null,s);					//Imprimindo a string criptografada
        
        
        
    }

	
    
}
