import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHorario(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMeirivaldo = new Dev();
        devMeirivaldo.setNome("Meirivaldo");
        devMeirivaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Meirivaldo" + devMeirivaldo.getConteudoInscritos());
        devMeirivaldo.progredir();
        devMeirivaldo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Meirivaldo" + devMeirivaldo.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devMeirivaldo.getConteudoConcluido());
        System.out.println("XP: " + devMeirivaldo.calcularTotalXP());

        System.out.println("______");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudoConcluido());
        System.out.println("XP: " + devJoao.calcularTotalXP());


    }



    }

