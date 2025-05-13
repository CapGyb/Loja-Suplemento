public class App {
    public class Fatura {
        public int numeroItem, quantidadeItem;
        public String descricaoItem;
        public double precoItem;
        public void inicializarFatura() {
            numeroItem = 0;
            quantidadeItem = 0;
            descricaoItem = " ";
            precoItem = 0.0;

        }
    }
        public void calcularValorFatura(int quant, double preco){
            System.out.println();
            System.out.printf("Valor Total: %.2f\n", (preco * quant));
    }

    
    public static void main(String[] args) throws Exception {
        

    }
}
