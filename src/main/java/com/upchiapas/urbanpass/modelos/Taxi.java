package com.upchiapas.urbanpass.modelos;

public class Taxi {
    private String asiento;
    private String numeroTaxi;

    public Taxi(String asiento, String numeroTaxi) {
        this.asiento = asiento;
        this.numeroTaxi = numeroTaxi;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(String numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "numeroTaxi='" + numeroTaxi + '\'' +
                '}';
    }
}
