/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author leandro
 */
public class ListaEstatica {

    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int[] novo = new int[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        } 
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        System.out.println(toString());
    }

    public int buscar(int valor) {

        for (int i = 0; i < info.length; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int contador = 0;
        for (int i = 0; i < info.length; i++) {
            contador++;
            if (info[i] == valor) {
                tamanho--;
                for (int j = i; j < info.length - 1; j++) {
                    info[j] = info[j + 1];
                }
            break;
            }
        }
        
    }

    public void liberar() {
        while (info.length != 10) {
            int[] novo = new int[info.length - 10];
            info = novo;
        }

        for (int i = 0; i < info.length; i++) {
            info[i] = 0;
        }

    }
    
    public int obterElemento(int posicao){
        if(posicao > tamanho || posicao == 0 ) {
            throw new IndexOutOfBoundsException("Posicao Invalido");
        }
        return info[posicao];
    }

    public boolean estaVazia() {
        if(info[0] == 0 ) {
            return true;
        }else{
            return false;
        }
    }
    
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String numeros = "";
        for(int i = 0; i < info.length; i++) {
            if(info[i] == 0) {
                break;
            }
            numeros += info[i] + ",";
        } 
        String semUltimaVirgula = numeros.substring(0,numeros.length() - 1);
        return semUltimaVirgula;
    }
    
    
    
    
    
    
}
