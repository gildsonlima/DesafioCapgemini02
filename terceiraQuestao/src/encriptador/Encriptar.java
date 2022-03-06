
package encriptador;

/**
 *
 * @author GCL
 */
public class Encriptar {
    
	public static String removerEspaco(String s) {				//Metodo para retirar os espa�os
		
		System.out.println(s);						//Testando a string recebida pelo metodo
		s = s.replaceAll(" ","");					//Usando o metodo replaceAll da biblioteca de strings para fazer a substtui��o dos espa�os por sem espa�o
		System.out.println(s);						//Testando a saida do metodo para verificar se foram retirados todo os espa�os
		return  s;							//Retornando a string ja sem os espa�os
		
	}
	
public static String criptografar(String s) {
	
    String c = "";								//Declarando uma variavel local para armazenar a variavel criptografada
    double raizTam = Math.sqrt(s.length());					//Declarando uma variavel para guardar a raiz do tamanho da string digitada aproximada para cima
    
    raizTam = Math.ceil(raizTam);						//Aproximando a variavel para cima
	
    System.out.println(raizTam);						//Exibindo a raiz do tamanho da string para teste
    
    System.out.println(s);							//Imprindo a string recebida pelo metodo 
    
    
    for (int i = 0; i < raizTam; i++)                                           //For usado para setar o inicio da impressao da string
    {									
        
        for (int j = i; j < s.length(); j+=raizTam) {				//For usado para imprimir a letras na ordem que � definida pela raiz do tamanho da string
            
            c += s.charAt(j);    						//Salvando o caracteres nos seus devidos lugares em uma string para depois ser impresso
    }
        c += " ";								//Salvando o os espa�os nos seus novos lugares em uma string para depois ser impresso
    }
    System.out.println(c);							//Exibindo a string ja criptografada no terminal para verifica��o
    return c;
	
	}
    
	
    
}
