package org.example.cadastroempresa.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Documentacao {

    private String numero;

    private String orgaoEmissor;

    private String estadoEmissor;

    private Date dataValidade;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getEstadoEmissor() {
        return estadoEmissor;
    }

    public void setEstadoEmissor(String estadoEmissor) {
        this.estadoEmissor = estadoEmissor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
