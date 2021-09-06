package com.company.lesson3;

public class Gerente extends Funcionario{

    private double gratificacao;

    public Gerente(String nome, String sexo, double sal) {
        super(nome, sexo, sal);
    }

    public double getGratificacao() {
        return super.getSalario() * 0.05;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getGratificacao();
    }

    @Override
    public String toString() {
        return super.toString() + "      " + getGratificacao();
    }
}
