/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista09.questao02;

/**
 *
 * @author leandro
 */
public class MapaDispersao<T> {

    private ListaEncadeada<NoMapa<T>> info[];

    public MapaDispersao(int tamanho) {
        info = (ListaEncadeada<NoMapa<T>>[]) new ListaEncadeada[tamanho];
    }

    private int calcularHash(int chave) {
        //inteiro eh o hash     
        chave = chave % this.info.length;
        return chave;
    }

    public void inserir(int chave, T dado) {
        int posicao = calcularHash(chave);

        NoMapa<T> novo = new NoMapa<>();
        novo.setChave(chave);
        novo.setValor(dado);

        info[posicao].inserir(novo);
    }

    public void remover(int chave) {
        int posicao = calcularHash(chave);
        NoMapa<T> n = new NoMapa<>();
        n.setChave(chave);
        if (info[posicao] != null) {
            info[posicao].retirar(n);
        }
    }

    public T buscar(int chave) {
        int posicao = calcularHash(chave);

        if (info[posicao] == null) {
            return null;
        }

        NoMapa<T> procurado = new NoMapa<>();
        procurado.setChave(chave);

        NoLista<NoMapa<T>> noEncontrado = info[posicao].buscar(procurado);

        if (noEncontrado != null) {
            return noEncontrado.getInfo().getValor();
        }

        return null;
    }

    public double calcularFatorCarga() {
    int quantidadeElementos = 0;

    for (ListaEncadeada<NoMapa<T>> lista : info) {
        if (lista != null) {
            quantidadeElementos += lista.obterComprimento();
        }
    }

    return (double) quantidadeElementos / info.length;
    }
       
}
    



