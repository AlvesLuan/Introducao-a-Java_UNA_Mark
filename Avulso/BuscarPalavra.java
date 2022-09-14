package buscarpalavra;


public class BuscarPalavra {
    public static void main (String args[]){
    
        String textoAleatorio = "olá jõao";
        String palavra = "olá";
        
        int vezes = 0;
        for (int i = 0; i < textoAleatorio.length(); i++) {
            if (textoAleatorio.substring(i).startsWith(palavra)) {
                vezes ++;
        }
    }
        System.out.println(textoAleatorio + "\nA palavra *" + palavra + "* foi usada " + vezes + " vez(s)");

    }
}
