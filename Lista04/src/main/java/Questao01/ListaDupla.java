/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Questao01;

/**
 *
 * @author lgonascimento
 */
public class ListaDupla<T> {
    private NoListaDupla<T> primeiro; 
    
    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor) {
        
       NoListaDupla<T> novo = new NoListaDupla<>();
       novo.setInfo(valor);
       novo.setProximo(primeiro);
       novo.setAnterior(null);
       
       if(primeiro != null) {
           primeiro.setAnterior(novo);
       }
       
       this.primeiro = novo;
       
       
    }
    
    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        
        while(p != null) {
            if(p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        }
        
        return null;
    }
    
    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);

        if(p != null) {
            if(primeiro.equals(p)) {
                primeiro = p.getProximo();
            }else{
                p.getProximo().setAnterior(p.getAnterior());
            }

            if(p.getProximo() != null) {
                p.getProximo().setAnterior(p.getAnterior());
            }
        }

    }

    public void exibirOrdemInversa() {
        NoListaDupla<T> p  = primeiro;
        String guardarValores = "";
        while(p.getProximo() != null) {
            p.getProximo
        }

        if(p.getProximo() == null) {
            while(p.getAnterior() != primeiro) {
                guardarValores += p.getInfo() + ", ";
            }
        }

        guardarValores += p.getInfo();

    }

    public void liberar() {
        NoListaDupla<T> p = primeiro;

        while(p.getProximo() != null) {
            p.getProximo();
        }

        while(p.getAnterior() != primeiro) {
            p.getAnterior();
            p.setProximo(null);
        }

        primeiro = null;
    }

    public String toString() {
        NoListaDupla<T> p = primeiro;
        String retorno = "";
        retorno += p.getInfo() + ", ";
        while(p.getProximo() != null) {
            p.getProximo();
            retorno += p.getInfo() + ", ";
        }
        retorno += p.getInfo();

        return retorno;


    }


}
