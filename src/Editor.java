public class Editor {
    Texto topo;
    int tamanho;

    public Editor(){
        this.topo = null;
        this.tamanho = 0;
    }


    public void escrever (String texto){
        Texto t = new Texto (texto);
        t.proximo = topo;
        topo = t;
        tamanho++;
    } 

    public boolean empty(){
        return this.tamanho == 0;
    }

    public String desfazer(){
        if(empty()){
            System.out.println("Pilha vazia!");
            return "";
        }
        Texto t = topo;
        String s = t.getTexto();
        topo = topo.proximo;
        tamanho--;
        return s;
    }

    public void imprimirTexto(){
        if(!empty()){
            Texto atual = topo;
            while(atual != null){
                System.out.print(atual.getTexto());
                if(atual.proximo != null){
                    System.out.print("\n");
                }
                atual = atual.proximo;
            }
        }else{
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.println();
    }
}
