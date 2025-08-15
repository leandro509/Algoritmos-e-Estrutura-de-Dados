/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.Questao01;

/**
 *
 * @author lgonascimento
 * @param <T>
 */
public class ListaEncadeada<T> {

    private NoLista<T> primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoLista novo = new NoLista();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;

    }

    public void exibir() {
        NoLista<T> p = primeiro;

        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProximo();
        }
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.getInfo() == valor) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while ((p != null) && (p.getInfo() != valor)) {
            anterior = p;
            p = p.getProximo();
        }

        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }
    
    public int obterComprimento() {
        int tamanho = 0;
        
        NoLista<T> p = primeiro;

        while (p != null) {
            p = p.getProximo();
            tamanho++;
        }   
        return tamanho;
    }
    
    public NoLista<T> obterNo(int idx) {
        
    }

}
