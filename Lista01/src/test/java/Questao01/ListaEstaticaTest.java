/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Questao01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class ListaEstaticaTest {
    
    

    @Test
    public void inclusaoDadosLsita() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        
        String esperado = "5,10,15,20";
        assertEquals(lista01.toString(), esperado);
        
    }
    
    @Test
    public void obterLista() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        
        int valorEsperado = 4;
        
        assertEquals(valorEsperado, lista01.getTamanho());
    }
    
    @Test
    public void metodoBuscar() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        
        Integer valorEsperado = 2;
        assertEquals(valorEsperado, lista01.buscar(15));
    }
    
     @Test
    public void metodoBuscarInexistente() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        
        Integer valorEsperado = -1;
        assertEquals(valorEsperado, lista01.buscar(30));
        
    }
    
    @Test
    public void metodoRetirar() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        lista01.retirar(10);
        
        
        String esperada = ("5,15,20");
        assertEquals(esperada, lista01.toString());
        assertEquals(3, lista01.getTamanho());
        
    }
    
    @Test
    public void inclusaoComRedimensionamento() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(1);
        lista01.inserir(2);
        lista01.inserir(3);
        lista01.inserir(4);
        lista01.inserir(5);
        lista01.inserir(6);
        lista01.inserir(7);
        lista01.inserir(8);
        lista01.inserir(9);
        lista01.inserir(10);
        lista01.inserir(11);
        lista01.inserir(12);
        lista01.inserir(13);
        lista01.inserir(14);
        lista01.inserir(15);
        
        String esperada = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
        assertEquals(esperada, lista01.toString());
        assertEquals(15, lista01.getTamanho());
        
    }
    
    @Test
    public void obterElemento() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        
        assertEquals(20, lista01.obterElemento(3));
    }
    
    @Test
    public void obterElementoExcecao() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        lista01.obterElemento(5);});
        
            String esperado = "Posicao Invalida";
            String resultado = exception.getMessage();
            
            assertEquals(esperado, resultado);
        
       
    }
    
    @Test
    public void metodoLiberar() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        lista01.liberar();
        boolean esperado = true;
        assertEquals(esperado, lista01.estaVazia());
    }
    
}
