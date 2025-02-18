package org.example.cadastroempresa.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Telefone {

    private Long numero;

    private boolean celular;

    private  boolean whatsapp;

    private  boolean telegram;

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public boolean isCelular() {
        return celular;
    }

    public void setCelular(boolean celular) {
        this.celular = celular;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    public boolean isTelegram() {
        return telegram;
    }

    public void setTelegram(boolean telegram) {
        this.telegram = telegram;
    }
}
