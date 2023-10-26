package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {

        // Exemplo Poo
        Pessoas pessoa1 = new Pessoas("Vitor",  18);
        Pessoas pessoas2 = new Pessoas("Pablo", 22);

        //Exemplo Encapsulamento
        System.out.println(pessoa1.getNome());
        System.out.println(pessoas2.getNome());

        // Exemplo Herança
        Pessoas aluno1 = new Aluno(  "Pedro " , 17, 2006);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getIdade());

        // Exemplo Polimorfismo
        aluno1.passarTempo();
        System.out.println(aluno1.getSaldo());

        // Exemplo abstração
        aluno1.notaAluno(8, 7);
    }
}
