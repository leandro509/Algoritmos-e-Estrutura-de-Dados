/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista07;

/**
 *
 * @author leandro
 */
public class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria<T> direita;
    private NoArvoreBinaria<T> esquerda;
    
    public NoArvoreBinaria(T info) {
        this.info = info;
        esquerda = null;
        direita = null;
    }
    
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        this.info = info;
        esquerda = esq;
        direita = dir;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }
    
    
    
    
}
