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
            p.getProximo();
        }
        
        return null;
    }
    
    
}
