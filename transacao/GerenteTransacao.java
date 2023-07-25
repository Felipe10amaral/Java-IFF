package transacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GerenteTransacao {
	
	List <Transacao> list = new ArrayList<Transacao>();
	
	public GerenteTransacao() {}
	
	public void executar() {
		for(Transacao t : list) {
			t.executar();
		}
		
		list.clear();
	}
	
	public void adicionarTransacao(Transacao t) {
		list.add(t);
	}
	
	public void removerTransacao(Transacao t) {
		list.remove(t);
	}
	
	public Iterator<Transacao> getTransacoes() {
		List<Transacao> listImutavel = Collections.unmodifiableList(list);
		
		return listImutavel.listIterator();
	}
	
}
