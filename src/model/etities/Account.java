/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.etities;

import model.exceptions.DomainException;
import sun.util.calendar.CalendarUtils;

/**
 *
 * @author faust
 */
public class Account {

    private Integer numero;
    private String titulo;
    private Double saldo;
    private Double saque;

    public Account() {
    }

    public Account(Integer numero, String titulo, Double saldo, Double saque) {
        this.numero = numero;
        this.titulo = titulo;
        this.saldo = saldo;
        this.saque = saque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public void deposit(Double montante) {
        this.saldo += montante;

    }

    public void levantamento(Double montante) {

        if (montante > saque) {
            throw new DomainException("O montante excede o limite de saque");
        }
        if (montante > saldo) {
            throw new DomainException("Montante maior que o saldo");

        }
        saldo -= montante;

    }

}
