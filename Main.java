abstract class Transportadora {
    public abstract double calculaFrete(int altura, int largura);
}

class TransporteNautico extends Transportadora {
    @Override
    public double calculaFrete(int altura, int largura) {
        return 0.1 * (altura + largura);
    }
}

class TransporteTerrestre extends Transportadora {
    @Override
    public double calculaFrete(int altura, int largura) {
        return 0.2 * (altura / largura);
    }
}

public class Main {
    public static void main(String[] args) {
        Transportadora transportadoraNautica = new TransporteNautico();
        Transportadora transportadoraTerrestre = new TransporteTerrestre();
        int altura = 10;
        int largura = 5;
        double freteNautico = transportadoraNautica.calculaFrete(altura, largura);
        double freteTerrestre = transportadoraTerrestre.calculaFrete(altura, largura);
        System.out.println("Frete Náutico: " + freteNautico);
        System.out.println("Frete Terrestre: " + freteTerrestre);
    }
}
