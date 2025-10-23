/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista07;

/**
 *
 * @author leandro
 */
public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;
    public ArvoreBinaria() {
        raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }
    
    
    
    public boolean estaVazia() {
        if(raiz == null) {
            return true;
        }
        return false;
    }
    
    public boolean pertence(T info) {
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if(no == null) {
            return false;
        }
        return  info = no.info;
    }
    
    
    public String f(NoArvoreBinaria<T> raizSub) {
        if(raizSub == null) {
            System.out.println("<>");
        }
    }
    
    private String arvorePre(NoArvoreBinaria<T> no) {
        String arvore = "";
        if(!estaVazia()) {
            arvore += no.getInfo();
            if(no.getEsquerda() != null) {
                
            }
        }
    }
    
    public int contarNos() {
        
    }
    
    private int contarNos(NoArvoreBinaria<T> no) {
        
    }
}
