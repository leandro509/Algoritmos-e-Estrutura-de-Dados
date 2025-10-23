/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista08;

/**
 *
 * @author leandro
 */
public class Arvore<T> {

    private NoArvore<T> raiz;

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public Arvore() {
        raiz = null;
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz, info);
        }
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo() == info) {
            return true;
        } else {
            NoArvore p;
            p = no.getPrimeiro();
            while (p != null) {
                if (pertence(p, info)) {
                    return true;
                }
                p = p.getProximo();
            }
            return false;
        }
    }
    
    public int contarNos () {
        if(raiz == null) {
            return 0;
        }else {
           return contarNos();
        }
    }

    private int contarNos(NoArvore<T> no) {
        int contador = 0;
        no = raiz;
        NoArvore p;
        p = no.getPrimeiro();
        
        while(p != null) {
            
        }
    }
}
