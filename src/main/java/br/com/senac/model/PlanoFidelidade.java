package br.com.senac.model;

public class PlanoFidelidade {
    
    public static double calcularValorComDesconto(String tipoSeguro, double valorApolice, boolean fiel){
        if(!fiel){
            return valorApolice;
        }
        
        switch(tipoSeguro){
            case "Carro":
                return valorApolice * 0.95;
            case "Casa":
                return valorApolice * 0.90;
            case "Vida":
                return valorApolice * 0.85;
            default:
                return valorApolice;
        }
    }
}
