/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista6.questao01;

/**
 *
 * @author leandro
 */
public class FilaVetor<T> implements Fila<T> {

    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException("A fila esta cheia");
        }
        int posicaoInserir;
        posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException("A fila esta vazia");
        }
        return (T) info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        while (retirar() != null) {
            retirar();
        }
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<T>(this.tamanho + f2.tamanho);

        
        for (int i = 0; i < this.tamanho; i++) {
            int pos = (this.inicio + i) % this.limite;
            f3.inserir((T) this.info[pos]);
        }

        for (int i = 0; i < f2.tamanho; i++) {
            int pos = (f2.inicio + i) % f2.limite;
            f3.inserir((T) f2.info[pos]);
        }

        return f3;

    }

    public int getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        String lista = "";
        for (int i = 0; i < tamanho; i++) {
            int pos = (inicio + i) % limite;
            lista += info[pos] + ",";
        }

        if (lista.endsWith(",")) {
            lista = lista.substring(0, lista.length() - 1);
        }
        
        return lista;
    }

}
