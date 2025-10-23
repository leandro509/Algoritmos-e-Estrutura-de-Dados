/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista08;

/**
 *
 * @author leandro
 */
public class NoArvore<T> {
    private T info;
    private NoArvore<T> primeiro;
    private NoArvore<T> proximo;
    
    public NoArvore(T info) {
        this.info = info;
        primeiro = null;
        proximo = null;
    }
    
    public void inserirFilho(NoArvore<T> sa) {
        sa.proximo = primeiro;
        this.primeiro = (NoArvore<T>) sa.getInfo();
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore<T> proximo) {
        this.proximo = proximo;
    }
    
    
    
    
}
