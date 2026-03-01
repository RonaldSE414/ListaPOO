class Cliente {

    String nome;
    String tipo;

    public Cliente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}

class Cupom {

    String codigo;
    int usosRestantes;

    public Cupom(String codigo, int usosRestantes) {
        this.codigo = codigo;
        this.usosRestantes = usosRestantes;
    }

    public boolean aplicarCupom() {
        if (codigo.equals("CONSUMIDOR20") && usosRestantes > 0) {
            usosRestantes--;
            return true;
        } else {
            return false;
        }
    }
}

class Compra {

    double valorBruto;

    public Compra(double valorBruto) {
        this.valorBruto = valorBruto;
    }
}

class ProcessadorVendas {

    public void processar(Cliente cliente, Cupom cupom, Compra compra) {

        double valorFinal = compra.valorBruto;
        double descontoTotal = 0;

        if (cliente.tipo.equals("VIP")) {
            double descontoVip = valorFinal * 0.05;
            valorFinal -= descontoVip;
            descontoTotal += descontoVip;
        }

        if (cupom.aplicarCupom()) {
            valorFinal -= 20;
            descontoTotal += 20;
        }

        System.out.println("Valor Original: R$ " + compra.valorBruto);
        System.out.println("Desconto Aplicado: R$ " + descontoTotal);
        System.out.println("Valor Final: R$ " + valorFinal);
    }
}

public class SistemaVendas {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "VIP");
        Cupom cupom = new Cupom("CONSUMIDOR20", 1);
        Compra compra = new Compra(100.0);
        ProcessadorVendas processador = new ProcessadorVendas();

        processador.processar(cliente, cupom, compra);

        processador.processar(cliente, cupom, compra);
    }
}