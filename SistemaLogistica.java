class Produto {

    String nome;
    double precoUnitario;
    int pontoCritico;

    public Produto(String nome, double precoUnitario, int pontoCritico) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.pontoCritico = pontoCritico;
    }
}

class Estoque {

    int quantidadeAtual;
    String localizacaoCorredor;

    public Estoque(int quantidadeAtual, String localizacaoCorredor) {
        this.quantidadeAtual = quantidadeAtual;
        this.localizacaoCorredor = localizacaoCorredor;
    }

    public void reduzirEstoque(int qtd) {
        quantidadeAtual -= qtd;
    }

    public void adicionarEstoque(int qtd) {
        quantidadeAtual += qtd;
    }
}

class Fornecedor {

    String nomeEmpresa;
    int tempoEntregaDias;

    public Fornecedor(String nomeEmpresa, int tempoEntregaDias) {
        this.nomeEmpresa = nomeEmpresa;
        this.tempoEntregaDias = tempoEntregaDias;
    }

    public void enviarProdutos(int qtd) {
        System.out.println("Fornecedor enviando " + qtd + " unidades.");
    }
}

class PedidoCompra {

    int idPedido;
    String status;

    public PedidoCompra(int idPedido) {
        this.idPedido = idPedido;
        this.status = "Pendente";
    }

    public void atualizarStatus(String novoStatus) {
        status = novoStatus;
    }
}

class GerenteLogistico {

    public void realizarVenda(int qtd, Produto produto, Estoque estoque, Fornecedor fornecedor) {

        estoque.reduzirEstoque(qtd);

        if (estoque.quantidadeAtual <= produto.pontoCritico) {

            PedidoCompra pedido = new PedidoCompra(1);
            fornecedor.enviarProdutos(20);
            pedido.atualizarStatus("Enviado");

            System.out.println("Estoque Crítico detectado para " + produto.nome +
                    ". Gerando Pedido de Compra com o fornecedor " +
                    fornecedor.nomeEmpresa + ". Status: " + pedido.status);
        }
    }
}

public class SistemaLogistica {

    public static void main(String[] args) {

        Produto produto = new Produto("Processador", 1200.0, 10);
        Estoque estoque = new Estoque(15, "Corredor A");
        Fornecedor fornecedor = new Fornecedor("TechSupplier", 5);
        GerenteLogistico gerente = new GerenteLogistico();

        gerente.realizarVenda(7, produto, estoque, fornecedor);
    }
}