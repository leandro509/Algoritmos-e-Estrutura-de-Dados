/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author lgonascimento
 */
public class App {
    public static void main(String[] args) {
        ListaEstatica <Aluno> alunos = new ListaEstatica();
        
        alunos.inserir(new Aluno(5000, "Pedro"));
        alunos.inserir(new Aluno(6000, "Ana"));
        alunos.inserir(new Aluno(7000, "Lucas"));
        
        for(int i = 0; i < alunos.getTamanho(); i++) {
            System.out.println();
        }
        
        ListaEstatica <Veiculo> veiculos = new ListaEstatica();
        
        veiculos.inserir(new Veiculo("FER04234", "GOl"));
        veiculos.inserir(new Veiculo("ERE85543", "Jeep"));
        
    }
 
}
