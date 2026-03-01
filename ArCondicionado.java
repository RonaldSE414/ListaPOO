public class ArCondicionado {

    int temperatura;

    public ArCondicionado() {
        this.temperatura = 22;
    }

    public void ajustarTemperatura(int novaTemperatura) {

        if (novaTemperatura < 16) {
            temperatura = 16;
        } else if (novaTemperatura > 28) {
            temperatura = 28;
        } else {
            temperatura = novaTemperatura;
        }
    }

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();

        ar.ajustarTemperatura(12);

        System.out.println("Temperatura atual: " + ar.temperatura + "°C");
    }
}