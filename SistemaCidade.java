class Semaforo {

    String cor;

    public Semaforo(String corInicial) {
        this.cor = corInicial;
    }

    public void trocar() {
        if (cor.equals("Vermelho")) {
            cor = "Verde";
        } else {
            cor = "Vermelho";
        }
    }
}

class Veiculo {

    String placa;
    String tipo;

    public Veiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }
}

class Via {

    String nome;
    int fluxoVeiculos;

    public Via(String nome, int fluxoVeiculos) {
        this.nome = nome;
        this.fluxoVeiculos = fluxoVeiculos;
    }
}

class SensorPassagem {

    int id;
    boolean estaAtivado;

    public SensorPassagem(int id) {
        this.id = id;
        this.estaAtivado = false;
    }

    public void ativar() {
        estaAtivado = true;
    }
}

class ControladorCentral {

    public void verificarPrioridade(Veiculo v, SensorPassagem s, Semaforo sem, Via via) {

        if (s.estaAtivado && v.tipo.equals("Ambulância")) {

            if (sem.cor.equals("Vermelho")) {
                sem.trocar();
                System.out.println("Prioridade detectada para " + v.placa +
                        " na " + via.nome + ". Sinal alterado para Verde.");
            }
        }
    }
}

public class SistemaCidade {

    public static void main(String[] args) {

        Semaforo sem = new Semaforo("Vermelho");
        Veiculo v = new Veiculo("ABC-1234", "Ambulância");
        Via via = new Via("Av. Principal", 20);
        SensorPassagem sensor = new SensorPassagem(1);
        ControladorCentral controlador = new ControladorCentral();

        sensor.ativar();

        controlador.verificarPrioridade(v, sensor, sem, via);
    }
}