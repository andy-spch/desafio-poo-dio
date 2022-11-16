import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso javaScript");
		curso2.setDescricao("descricao curso javaScript");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAnderson = new Dev();
		devAnderson.setNome("Anderson");
		devAnderson.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de " + devAnderson.getNome() + ":" + devAnderson.getConteudosInscritos());
		devAnderson.progredir(); 
		devAnderson.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de " + devAnderson.getNome() + ":" + devAnderson.getConteudosInscritos());		
		System.out.println("Conteúdos Concluídos de " + devAnderson.getNome() + ":" + devAnderson.getConteudosConcluidos());
		System.out.println("XP: " + devAnderson.calcularTotalXp());
		
		System.out.println("-----------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devCamila.getNome() + ":" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
 		System.out.println("-");
		System.out.println("Conteúdos Inscritos" + devCamila.getNome() + ":" + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de " + devCamila.getNome() + ":" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		
		
	}

}
