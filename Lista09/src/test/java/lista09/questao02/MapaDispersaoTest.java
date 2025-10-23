/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista09.questao02;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author leandro
 */
public class MapaDispersaoTest {
    
    @Test
    public void testeInsercaoMapa() {
        MapaDispersao mapa = new MapaDispersao<>(53);
        Aluno aluno1 = new Aluno(12000, "Jean", LocalDate.of(2000, 1,1));
        
        mapa.inserir(12000, aluno1);
        mapa.buscar(12000);
        
        
        assertEquals(mapa.buscar(12000), aluno1);
    }
    
}
