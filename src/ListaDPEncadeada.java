// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ListaDPEncadeada {


    class Nodo{
        public int elemento;
        public int proximo;
        public  int anterior;

        public Nodo(int elemento){
            this.elemento = elemento;
            this.proximo = proximo;
            this.anterior = anterior;



        }
        private Nodo inicio;
        private Nodo fim;
        private int nElementos;

        public ListaDPEncadeada(){
            this.inicio = null;
            this.fim = null;
            this.nElementos = 0;

        }

        public boolean estaVazia(){
            return  this.nElementos==0;

        }
        public  int tamanho(){
            return this.nElementos;
        }

        public void imprime(){
            System.out.print("[");
            Nodo cursor = this.inicio;

            for (int i = 0; i< this.nElementos; i++){
                System.out.print(cursor.elemento +" ");
                cursor = cursor.proximo;


            }
            System.out.println("]");
        }

        public void imprimeInverso() {
            System.out.print("[");

            Nodo cursor = this.fim;
            for (int i = 0; i < this.nElementos; i++) {
                System.out.print(cursor.elemento + " ");
                cursor = cursor.anterior;


            }
            System.out.println("]");
        }

        public void insereInicio(int elemento){
            Nnodo novo = new Nodo(elemento);

            if (this.estaVazia()){
                this.fim = novo;
            }
            else{
                novo.proximo = this.inicio;
                this.inicio.anterior = novo;
            }

            this.inicio= novo;
            this.nElementos++;
        }

        public Integer removeInicio(){
            if(this.estaVazia()){
                System.out.println("Lista Vazia");
            }
            Nodo removido = this.inicio;
            if (this.nElementos==1){
                this.inicio = null;
                this.fim = null;
            }
            else{
                this.inicio = removido.proximo;
                this.inicio.anterior = null;
                removido.proximo = null;

            }
            this.nElementos--;
            return removido.elemento;
        }

        public void insereFinal(int elemento){
            Nodo novo = new Nodo(elemento);
            if (this.estaVazia()){
                this.inicio.novo;
            }
            novo.anterior = this.fim;
            this.fim.proximo = novo;
            this.fim = novo;


        }


    public static void main(String[] args) {
    
        }
    }
}