public class Pessoa {

public class Pessoa {
    private String estadoCivil;

    public Pessoa(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}
-----------------------------
public class Motorista extends Pessoa {
    private String automovel;
    private boolean estacionamento;

    public Motorista(String automovel, boolean estacionamento, String estadoCivil) {
        super(estadoCivil);
        this.automovel = automovel;
        this.estacionamento = estacionamento;
    }

    public String getAutomovel() {
        return automovel;
    }

    public boolean hasEstacionamento() {
        return estacionamento;
    }
}
-----------------------------
public enum TipoAutomovel {

}
-----------------------------
public class Automovel {
    private double valorBaseFipe;
    private TipoAutomovel tipo;

    public Automovel(double valorBaseFipe, TipoAutomovel tipo) {
        this.valorBase = valorBaseFipe;
        this.tipo = tipo;
    }

    public double getValorBaseFipe() {
        return valorBaseFipe;
    }

    public TipoAutomovel getTipo() {
        return tipo;
    }
}
------------------------------
public class Automovel {
    private double valorBaseFipe;
    private TipoAutomovel tipo;

    public Automovel(double valorBaseFipe, TipoAutomovel tipo) {
        this.valorBase = valorBaseFipe;
        this.tipo = tipo;
    }

    public double getValorBaseFipe() {
        return valorBaseFipe;
    }

    public TipoAutomovel getTipo() {
        return tipo;
    }
}
