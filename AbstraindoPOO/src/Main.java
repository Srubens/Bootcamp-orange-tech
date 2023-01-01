import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Bootcamp orange tech");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(8);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Bootcamp Javascript");
        cursoJS.setDescricao("Curso de JavaScript");
        cursoJS.setCargaHoraria(12);

        //System.out.println(curso);
        //System.out.println(cursoJS);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Sobre o curso de java");
        mentoria1.setData(LocalDate.now());
        //System.out.println(mentoria1);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp java developer");
        bootcampJava.setDescricao("Apredendo sobre a linguagem java");
        bootcampJava.getConteudos().add(curso);
        bootcampJava.getConteudos().add(cursoJS);
        bootcampJava.getConteudos().add(mentoria1);

        Dev pessoa1 = new Dev();
        pessoa1.setNome("Rubens");
        pessoa1.inscreverBootcamp(bootcampJava);
        pessoa1.progredir();
        //pessoa1.progredir();
        System.out.println("Conteudos inscritos Aluno Rubens" + pessoa1.getConteudoInscritos());
        System.out.println("Conteudos concluidos Aluno Rubens" + pessoa1.getConteudosConcluidos());
        System.out.println("XP: " + pessoa1.calcularTotalXP());

        Dev pessoa2 = new Dev();
        pessoa2.inscreverBootcamp(bootcampJava);
        pessoa2.setNome("Filipe");
        pessoa2.progredir();


        //System.out.println("Conteudos inscritos " + pessoa2.getConteudoInscritos());
        //System.out.println("Conteudos concluidos " + pessoa2.getConteudosConcluidos());

    }
}
