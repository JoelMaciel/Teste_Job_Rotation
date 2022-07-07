public class StringReversa   
{    
    public static void main(String[] args) {    
        String string = "ata";    

        //Armazena o inverso de determinada string    
        String stringReversa = "";    
            
        //Iterar através da sequência do passado e adicionar cada caractere à variável stringReversa    
        for(int i = string.length()-1; i >= 0; i--){    
            stringReversa = stringReversa + string.charAt(i);    
        }    
            
        System.out.println("String original: " + string);    
        //Exibe o inverso da determinada sequência     
        System.out.println("Reverso da determinada string: " + stringReversa );    
    }    
}    