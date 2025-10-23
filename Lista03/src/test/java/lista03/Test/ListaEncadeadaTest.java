/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista03.Test;

import lista03.ListaEncadeada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class ListaEncadeadaTest {

    @Test
    public void testeMetodoEstaVaziaTrue() {
        ListaEncadeada lista = new ListaEncadeada();
        assertEquals(true, lista.estaVazia());
    }

    @Test
    public void testeMetodoEstaVaziaFalse() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        assertEquals(false, lista.estaVazia());
    }

    @Test
    public void testeInclusaoDeNo() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        assertEquals(lista.obterNo(0).getInfo(), 5);
        assertEquals(lista.obterComprimento(), 1);
    }

    @Test
    public void testeInclusaoNumeros() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        assertEquals(3, lista.obterComprimento());
        assertEquals("15,10,5", lista.toString());
    }
    
    @Test
    public void testeBuscaDados() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.buscar(20);
        assertEquals(20, lista.buscar(20).getInfo());
    }
    
      @Test
    public void testeBuscaDadosMeioDaLista() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.buscar(15);
        assertEquals(15, lista.buscar(15).getInfo());
    }
    
     @Test
    public void testeBuscaDadoInesxitente() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(null, lista.buscar(50));
    }
    
     @Test
    public void testeExclusaoPrimeiroItem() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15,10,5", lista.toString());
    }
    
     @Test
    public void testeExclusaoMeioDaLista() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        assertEquals("20,10,5", lista.toString());
    }
    
     @Test
    public void testeObterNo() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(20, lista.obterNo(0).getInfo());
    }
    
     @Test
    public void testeObterNoUltimaPosicao() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(5, lista.obterNo(3).getInfo());
    }
    
     @Test
    public void testeObterNoPosicaoInvalida() {
        
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.obterNo(10);
        });        
    }
    
    @Test
    public void testeObterComprimentoListaVazia() {
        ListaEncadeada lista = new ListaEncadeada();
        assertEquals(0, lista.obterComprimento());
    }
    
    @Test
    public void testeObterComprimentoListaNaoVazia() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.obterComprimento());
    }
}
