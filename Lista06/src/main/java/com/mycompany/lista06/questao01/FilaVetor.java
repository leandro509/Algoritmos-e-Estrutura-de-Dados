/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista06.questao01;

/**
 *
 * @author lgonascimento
 */
public class FilaVetor<T> implements Fila<T> {
    private []Object info;
    private int limite;
    private int tamanho;
    private int inicio;
    
    public FilaVetor(int limite) {
        info = new Object[limite];
        inicio = 0;
        tamanho = 0;
    }
    
    @Override
    public void inserir(T valor) {
        if(limite == tamanho) {
            throw new FilaCheiaException("A fila está cheia");
        }
        
        tamanho++;
        
    }

    @Override
    public boolean estaVazia() {

    }

    @Override
    public T peek() {

    }

    @Override
    public T retirar() {

    }

    @Override
    public void liberar() {

    }
    
}
