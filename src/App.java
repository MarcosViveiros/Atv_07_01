public class App {
    public static void main(String[] args) throws Exception {
        Editor e = new Editor();
        
        e.escrever("Apenas um texto");
        e.escrever("Mais um texto");
        e.imprimirTexto();
        e.desfazer();
        e.imprimirTexto();
    }
}
