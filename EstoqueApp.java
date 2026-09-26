public class EstoqueApp {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        System.out.println("=== CADASTRO DE PRODUTOS ===");
        try {
            ProdutoComum p1 = new ProdutoComum("Feijão", 8.00, 50);
            ProdutoComum p2 = new ProdutoComum("Arroz", 22.00, 30);
            ProdutoPerecivel p3 = new ProdutoPerecivel("Leite", 5.50, 40, 15);
            ProdutoPerecivel p4 = new ProdutoPerecivel("Iogurte", 4.00, 20, 2); 

            estoque.adicionarProduto(p1);
            estoque.adicionarProduto(p2);
            estoque.adicionarProduto(p3);
            estoque.adicionarProduto(p4);
            
            estoque.exibirProdutos();

            System.out.printf("\nValor total do estoque (aplicando regras de desconto): R$%.2f\n", 
                              estoque.calcularValorTotalEstoque());

        } catch (QuantidadeInvalidaException e) {
            System.out.println("Erro na criação: " + e.getMessage());
        } catch (EstoqueException e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }

        System.out.println("\n=== TESTANDO EXCEÇÕES E VENDAS ===");
        try {
            System.out.println("1. Tentando criar produto com quantidade -5...");
            ProdutoComum pInvalido = new ProdutoComum("Sal", 2.00, -5);
            
        } catch (QuantidadeInvalidaException e) {
            System.out.println("[Capturado] QuantidadeInvalidaException: " + e.getMessage());
        } catch (EstoqueException e) {
            System.out.println("[Capturado] EstoqueException: " + e.getMessage());
        }

        try {
            System.out.println("\n2. Vendendo 10 unidades de Feijão (Índice 0)...");
            estoque.venderProduto(0, 10);
            System.out.println("Venda realizada com sucesso!");

            System.out.println("\n3. Tentando vender 60 unidades de Feijão (Índice 0)...");
            estoque.venderProduto(0, 60);

        } catch (QuantidadeInvalidaException e) {
            System.out.println("[Capturado] QuantidadeInvalidaException: " + e.getMessage());
        } catch (ProdutoIndisponivelException e) {
            System.out.println("[Capturado] ProdutoIndisponivelException: " + e.getMessage());
        } catch (EstoqueException e) {
            System.out.println("[Capturado] EstoqueException: " + e.getMessage());
        }

        System.out.println("\n=== RESUMO FINAL DO ESTOQUE ===");
        estoque.exibirProdutos();
        System.out.printf("Valor total atualizado: R$%.2f\n", estoque.calcularValorTotalEstoque());
    }
}
