import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Product> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Product p) {
        this.produtos.add(p);
    }

    public void venderProduto(int indice, int quantidade) throws ProdutoIndisponivelException {
        if (indice >= 0 && indice < produtos.size()) {
            produtos.get(indice).vender(quantidade);
        }
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Product p : produtos) {
            total += p.calcularValorTotal();
        }
        return total;
    }

    public void exibirProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Índice [" + i + "] -> " + produtos.get(i).getDescricao());
        }
    }
}
