# Sistema de Gerenciamento de Estoque 📦

Repositório criado para a entrega do Exercício de Implementação da Primeira Avaliação.

## 📝 Sobre o Projeto
Este é um programa em Java desenvolvido para gerenciar o estoque de uma loja. Ele permite cadastrar produtos de diferentes tipos (comuns e perecíveis), controlar a venda dos itens e tratar situações inválidas no sistema (como venda acima do limite ou cadastro com valores negativos).

## 🚀 Conceitos Aplicados
O código-fonte foi desenvolvido aplicando os seguintes pilares da Orientação a Objetos:
- **Classes Abstratas e Herança:** Classe base `Product` e subclasses `ProdutoComum` e `ProdutoPerecivel`.
- **Interfaces:** Interface `Vendavel` definindo o contrato de vendas.
- **Polimorfismo Dinâmico:** Sobrescrita do método `calcularValorTotal()` com regras de negócio diferentes para produtos próximos ao vencimento.
- **Polimorfismo Estático (Sobrecarga):** Duas versões do método `aplicarDesconto()`.
- **Composição:** A classe `Estoque` gerenciando uma lista de produtos.
- **Tratamento de Exceções:** Criação de uma hierarquia customizada (`EstoqueException`, `QuantidadeInvalidaException`, `ProdutoIndisponivelException`) e blocos `try-catch` respeitando a ordem do mais específico para o mais genérico.

## ⚙️ Como Executar
A classe principal do programa é a `EstoqueApp.java`. 
Ao executá-la, o sistema irá instanciar os produtos, exibir o valor total do estoque aplicando os descontos devidos e realizar os testes simulando cenários de sucesso e capturando as exceções em casos de falha.****
