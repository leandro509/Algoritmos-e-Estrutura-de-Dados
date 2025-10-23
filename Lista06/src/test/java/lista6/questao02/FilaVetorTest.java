/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista6.questao02;

import lista6.questao01.FilaCheiaException;
import lista6.questao01.FilaVaziaException;
import lista6.questao01.FilaVetor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class FilaVetorTest {
    
    @Test
    public void testeMetodoFilaVazia() {
        FilaVetor f1 = new FilaVetor(10);
        assertEquals(true, f1.estaVazia());
    }
    
    @Test
    public void testeMetodoFilaNaoVazia() {
        FilaVetor f1 = new FilaVetor(5);
        f1.inserir(10);
        assertEquals(false, f1.estaVazia());
    }
    
    @Test
    public void testeMetodosInserirAndRetirar() {
        FilaVetor f1 = new FilaVetor(10);
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        assertEquals(10 ,f1.retirar());
        assertEquals(20 ,f1.retirar());
        assertEquals(30 ,f1.retirar());
        assertEquals(true, f1.estaVazia());
        
    }
    
    
    @Test 
    public void tesetFilaCheiaException() {
        Exception ex = assertThrows (FilaCheiaException.class, () -> {
        FilaVetor f1 = new FilaVetor(3);
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        f1.inserir(40);});
        
        String esperado = "A fila esta cheia";
        String resultado = ex.getMessage();
        assertEquals(esperado, resultado); 
    }
    
    @Test 
    public void tesetFilaVaziaException() {
        Exception ex = assertThrows (FilaVaziaException.class, () -> {
        FilaVetor f1 = new FilaVetor(3);
        f1.retirar();});
        
        String esperado = "A fila esta vazia";
        String resultado = ex.getMessage();
        assertEquals(esperado, resultado); 
    }
    
}
