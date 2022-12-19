import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java ");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js ");
        curso2.setCargaHoraria(4);

        //polimorfismo
        //Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());




        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        //precisamos instanciar a classe bootcamp e adicionar 2 devs
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao: Bootcamp Java Development");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //agora vamos criar os devs
        Dev devJuliana = new Dev();
        devJuliana.setNome("Juliana");
        //increver no bootcamp
        devJuliana.inscreverBootcamp(bootcamp);

        //imprimir o que cada dev esta inscrito
        System.out.println("Conteudos Inscritos Juliana: " + devJuliana.getConteudoInscritos());
        devJuliana.progredir();
        devJuliana.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos Juliana: " + devJuliana.getConteudoInscritos());
        System.out.println("Conteudos Concluido Juliana: "+ devJuliana.getConteudosConcluidos());
        System.out.println("XP: " + devJuliana.calcularTotalXp());


        System.out.println("-------------------");
        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        //increver no bootcamp
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudoInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();

        System.out.println("---");
        System.out.println("Conteudos Inscritos Carlos: " + devCarlos.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());


    }
}