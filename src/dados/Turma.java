package dados;

import java.util.ArrayList;

import execoes.DisciplinaEmBrancoException;
import execoes.TurmaCheiaException;
import execoes.TurmaVaziaException;
import main.Crud;

public class Turma implements Crud {

	private String disciplina;
	private Alunos alunos;
	static ArrayList<Turma> turmas = new ArrayList<>();
	ArrayList<Alunos> aluno = new ArrayList<>();
	private int quant_Alunos;
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		if(disciplina.equals(" ")){
			try{
				throw new DisciplinaEmBrancoException();
			} catch (DisciplinaEmBrancoException d) {
				
			}
		}
		this.disciplina = disciplina;
	}
	public Alunos getAlunos() {
		return alunos;
	}
	public void setAlunos(Alunos alunos) {
		this.alunos = alunos;
	}
	
	public void matricular(Alunos a){
		
		if(this.quant_Alunos < 45){
			
		}
		try {
			if(this.quant_Alunos > 45){
				throw new TurmaCheiaException();
			}
		} catch (TurmaCheiaException e) {
			System.out.println("Turma cheia.");
		}
	}
	
	public void desmatricular(Alunos a){
		
		try{
		if(this.quant_Alunos == 0)
			throw new TurmaVaziaException();
		} catch (TurmaVaziaException e){
			System.out.println("Turma vazia, não há alunos para desmatricular");
		}
	
		
	}

	@Override
	public String pesquisar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Crud> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cadastrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
}