import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*Curso curso = new Curso();
        curso.setTitulo("Bootcamp orange tech");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Bootcamp Javascript");
        cursoJS.setDescricao("Curso de JavaScript");
        cursoJS.setCargaHoraria(12);

        System.out.println(curso);
        System.out.println(cursoJS);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Sobre o curso de java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);*/

        Conteudo conteudo1 = new Curso();
        conteudo1.setTitulo("Curso de Javascript");
        conteudo1.setDescricao("Aprenda a dominar o javascript!");
        conteudo1.calcularXP();
        System.out.println( conteudo1.toString() );

    }
}
