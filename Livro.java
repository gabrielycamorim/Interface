
interface Leitor {
    String lendo();
}
 
interface Escritor {
    void pagina(char[] ideias);
    String escrevendo();
}
 
class CriandoLivro implements Leitor, Escritor {
    String pensamento;
    public String lendo() { 
        return "Trono de Vidro";
    }
    public void  pagina(char[] ideias) { 
        pensamento = new String(ideias);
    }
    public String escrevendo() { 
        return pensamento;
    }
}
 
public class Livro {
    public static void main(String[] args) {
        CriandoLivro livro = new CriandoLivro (); 
        Leitor leitor = livro; 
        System.out.println("A(o) Leitora está lendo " + leitor.lendo());
        Escritor escritor = livro;
        String java = "escrevendo a sequencia";
        escritor.pagina(java.toCharArray());
        System.out.println ("E a(o) escritora está " + escritor.escrevendo());
    }
}
