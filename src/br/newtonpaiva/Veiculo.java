/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva;

import java.util.Objects;

/**
 *
 * @author Klecia
 */
public class Veiculo {
    private String placa;
    private Integer eixos;

    public Veiculo(String placa, Integer eixos) {
        this.placa = placa;
        this.eixos = eixos;
    }
    
    
    public Double calcularPedagio(){
        return 7.0 * this.eixos;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the eixos
     */
    public Integer getEixos() {
        return eixos;
    }

    /**
     * @param eixos the eixos to set
     */
    public void setEixos(Integer eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + " Eixos: " +eixos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }
    
    
    
}
