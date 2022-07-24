package com.upchiapas.urbanpass.modelos;

import java.time.LocalDate;

public class Corrida {
    private LocalDate localDate;
    private String hora;
    private String lugarOrigen, lugarDestino;

    public Corrida(LocalDate localDate, String hora, String lugarOrigen, String lugarDestino) {
        this.localDate = localDate;
        this.hora = hora;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }
}
