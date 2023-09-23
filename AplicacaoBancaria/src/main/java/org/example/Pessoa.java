package org.example;
import org.example.enums.EstadoCivil;
import org.example.enums.TipoPessoa;
import org.example.enums.TipoDocumento;

public class Pessoa {
    private String nome;
    private EstadoCivil estadoCivil;
    private TipoPessoa tipoPessoa;
    private TipoDocumento tipoDocumento;

    public Pessoa(String nome, EstadoCivil estadoCivil,TipoPessoa tipoPessoa,TipoDocumento tipoDocumento){
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.tipoDocumento = tipoDocumento;
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
