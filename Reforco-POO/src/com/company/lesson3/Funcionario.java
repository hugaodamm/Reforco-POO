package com.company.lesson3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {

    private String nome;
    private String sexo;
    private double salario;

    private static DecimalFormat df = new DecimalFormat("#.##");
    private static NumberFormat df2 = NumberFormat.getInstance(Locale.US);

    public Funcionario() {
    }

    public Funcionario(String nome, String sexo,  double sal) {
        this.nome = nome;
        this.sexo = sexo;

        df.setRoundingMode(RoundingMode.UP);
        String format = df.format(sal);
//        salario = Double.valueOf(format);

//        Number number = format.("6.03");
//        double d = number.doubleValue();

//        df.setRoundingMode(RoundingMode.UP);
//        String format = df2.format(sal);
//        salario = Double.parseDouble(format);
//        String format = "3000.198";
//        salario = Double.parseDouble(format);

//        System.out.println("Salário:" + salario);
//        sal = String.format("%.2f", )
        String convert = String.format("%.2f", sal);
        salario = Double.parseDouble(convert);
//        String strDouble = String.format("%.2f", sal);
    }

    public double getSalario(){
        return salario;
    }

    public String getNome(){
        return nome;
    }

    public String getSexo(){
        return sexo;
    }

    @Override
    public String toString() {
        return nome + "         " + sexo + "        " + salario;
    }

}
