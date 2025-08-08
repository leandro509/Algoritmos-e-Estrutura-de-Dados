/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

import Questao01.*;

/**
 *
 * @author leandro
 */
public class ListaEstatica<ClasseEnviadaComoParametro> {

    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar() {
        Object[] novo = new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(ClasseEnviadaComoParametro valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(ClasseEnviadaComoParametro valor) {

        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(ClasseEnviadaComoParametro valor) {

        Object posicao = buscar(valor);
        
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                for (int j = i; j < tamanho - 1; j++) {
                    info[j] = info[j + 1];
                }
                tamanho--;

                break;
            }
        }

    }

    public void liberar() {
        while (info.length != 10) {
            Object[] novo = new Object[info.length - 10];
            info = novo;
        }

        for (int i = 0; i < info.length; i++) {
            info[i] = 0;
        }

    }

    public ClasseEnviadaComoParametro obterElemento(int posicao) {
        
        if (posicao >= 0 && (posicao < tamanho)) {
            return (ClasseEnviadaComoParametro) info[posicao];
        }else {
            throw new IndexOutOfBoundsException("Posicao Invalido");
        }
    }

    public boolean estaVazia() {
        if (info[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String numeros = "";
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == null) {
                break;
            }
            numeros += info[i] + ",";
        }
        String semUltimaVirgula = numeros.substring(0, numeros.length() - 1);
        return semUltimaVirgula;
    }

}
