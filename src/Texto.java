public class Texto {
    private String texto;
    Texto proximo;
    
    public Texto(String texto){
        this.texto = texto;
        this.proximo = null;
    }

    public String getTexto() {
        return texto;
    }
}
