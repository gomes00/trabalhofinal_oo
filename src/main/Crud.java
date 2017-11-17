package main;

import java.util.ArrayList;

public interface Crud {
	public String pesquisar();
	public String toString();
	public ArrayList<Crud> getList();
	public void cadastrar();
	public void excluir();
	public void imprimir();
}
