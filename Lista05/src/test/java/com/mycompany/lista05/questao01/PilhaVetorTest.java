/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lista05.questao01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lgonascimento
 */
public class PilhaVetorTest {

    @Test
    public void testeReconhecePilhaVazia() {
        PilhaVetor pilha1 = new PilhaVetor(10);
        assertEquals(true, pilha1.estaVazia());
    }

    @Test
    public void testeReconhecePilhaNaoVazia() {
        PilhaVetor pilha1 = new PilhaVetor(10);
        pilha1.push(10);
        assertEquals(false, pilha1.estaVazia());
    }

    @Test
    public void testeDadosEmpilhado() {
        PilhaVetor pilha1 = new PilhaVetor(10);
        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);

        assertEquals(30, pilha1.pop());
        assertEquals(20, pilha1.pop());
        assertEquals(10, pilha1.pop());
        assertEquals(true, pilha1.estaVazia());

    }

    @Test
    public void testePilhaCheiaException() {

        Exception exception = assertThrows(PilhaCheiaException.class, () -> {
            PilhaVetor pilha1 = new PilhaVetor(3);
            pilha1.push(10);
            pilha1.push(20);
            pilha1.push(30);
            pilha1.push(40);
        });
        String esperado = "A pilha já está cheia!";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);

    }

    @Test
    public void testPilhaVaziaException() {
        Exception exception = assertThrows(PilhaVaziaException.class, () -> {
            PilhaVetor pilha1 = new PilhaVetor(3);
            pilha1.pop();
        });
        String esperado = "A pilha está vazia";
        String resultado = exception.getMessage();

        assertEquals(esperado, resultado);
    }

    @Test
    public void testMetodoPeek() {
        PilhaVetor pilha1 = new PilhaVetor(5);
        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);
        
        assertEquals(30, pilha1.peek());
        assertEquals(30, pilha1.pop());
        
    }
    
    @Test
    public void testeMetodoLiberar() {
        PilhaVetor pilha1 = new PilhaVetor(5);
        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);
        pilha1.liberar();
        assertEquals(true, pilha1.estaVazia());
    }
    
    @Test
    public void conferirConcatenacao() {
        PilhaVetor pilha1 = new PilhaVetor(10);
        pilha1.push(10);
        pilha1.push(20);
        pilha1.push(30);
        
        PilhaVetor pilha2 = new PilhaVetor(5);
        pilha2.push(40);
        pilha2.push(50);
        pilha1.concatenar(pilha2);
        
        assertEquals("50,40,30,20,10", pilha1.toString());
    }
}
