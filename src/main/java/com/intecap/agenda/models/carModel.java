package com.intecap.agenda.models;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class carModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car", nullable = false, unique = true)
    @Id
    private Long idCar;
    private String modelo;
    private String color;
    private String placa;
    private String anio;

    public carModel() {
    }

    public carModel(Long idCar, String modelo, String color, String placa, String anio) {
        this.idCar = idCar;
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.anio = anio;
    }

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "carModel{" +
                "idCar=" + idCar +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", placa='" + placa + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }
}

