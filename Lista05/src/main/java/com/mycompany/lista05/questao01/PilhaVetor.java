/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista05.questao01;

/**
 *
 * @author lgonascimento
 */
public class PilhaVetor<T> implements Pilha<T> {
    private T info[];
    private int limite;
    private int tamanho;

    

    
    public PilhaVetor(int limite) {
       info = (T[]) new Object[limite];
       this.limite = limite;
       this.tamanho = 0;
    }

    @Override
    public boolean estaVazia() {
        if(this.tamanho > 0) {
            return false;
        }
        return true;
    }


    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new PilhaCheiaException("A pilha já está cheia!");      
        }
        
        this.info[tamanho] = info;
        this.tamanho += 1;
    }

    @Override
    public T pop() {
        if(estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
       T valor;
       valor = peek();
       this.info[tamanho - 1] = null;
       this.tamanho -=  1;
       return valor;
    }

    @Override
    public T peek() {
        if(estaVazia()) {
             throw new PilhaVaziaException("A pilha está vazia");
        }
        return this.info[tamanho - 1];
    }
    
    @Override
    public void liberar() {
        while(peek() != null){
            pop();
        }
    }
    
    @Override 
    public String toString() {
        String pilha = "";
      for(int i = tamanho - 1; i >= 0; i--) {
          if(i == 0) {
              pilha += info[i];
          }
          pilha += info[i] + ",";
      }
        return pilha;
    }
    
    public void concatenar(PilhaVetor<T> p ){
           while(tamanho != (tamanho + p.tamanho)) {
            for(int i = 0; i < p.tamanho; i++) {
                push(p.info[i]);
            }
           }
           
        }
        
    }

