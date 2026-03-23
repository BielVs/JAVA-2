package com.sgp.util;

public class Validacoes {

    private Validacoes() {
    }

    public static boolean nomeValido(String tipo) {
        return !(tipo == null || tipo.trim().isEmpty() || tipo.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            return "Erro: O tipo não pode estar vazio!";
        } else if (tipo.matches(".*\\d+.*")) {
            return "Erro: O tipo não pode conter números!";
        }
        return "";
    }

    public static boolean idadeValida(int hora) {
        return hora >= 0 && hora <= 150;
    }

    public static String mensagemErroIdade(int hora) {
        if (hora < 0) {
            return "Erro: A hora não pode ser negativa!";
        } else if (hora > 150) {
            return "Erro: Hora inválida!";
        }
        return "";
    }

    public static boolean alturaValida(double tamanho) {
        return tamanho >= 0.3 && tamanho <= 3.0;
    }

    public static String mensagemErroAltura(double tamanho) {
        if (tamanho < 0.3) {
            return "Erro: Tamanho muito baixo!";
        } else if (tamanho > 3.0) {
            return "Erro: Tamanho inválido!";
        }
        return "";
    }
}