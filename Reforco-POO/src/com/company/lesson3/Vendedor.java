package com.company.lesson3;

public class Vendedor extends Funcionario{

    private double faturamento;
    private double comissao;

    public Vendedor(String nome, String sexo, double sal, double f) {
        super(nome, sexo, sal);
        faturamento = f;
    }

    public double getComissao(){
        return faturamento * 0.05;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getComissao();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "      " + getComissao() + "     " + getSalario();
    }
}
