/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Questao02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class ListaEstaticaTest {
    
  
    @Test
    public void testeMetodoInverter() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        lista01.inverter();
        
        String esperado = "20,15,10,5";
        assertEquals(esperado, lista01.toString());
        
    }
    
    @Test
    public void metodoInverterNumeroImpar() {
        ListaEstatica lista01 = new ListaEstatica();
        lista01.inserir(5);
        lista01.inserir(10);
        lista01.inserir(15);
        lista01.inserir(20);
        lista01.inserir(25);
        lista01.inverter();
        
        String esperado = "25,20,15,10,5";
        assertEquals(esperado, lista01.toString());
    }
    
}
