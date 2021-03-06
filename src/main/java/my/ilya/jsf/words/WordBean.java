package my.ilya.jsf.words;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.jsf.FacesContextUtils;

import my.ilya.jsf.core.Word;
import my.ilya.jsf.dao.ProfessorRepository;
import my.ilya.jsf.words.dao.WordRepository;
@ManagedBean(name = "wordBean", eager = true)
@ViewScoped
public class WordBean implements Serializable {
	
	@ManagedProperty(value = "#{wordRepository}")
	private WordRepository wordRepository;	
	private static final long serialVersionUID = 1L;
	private List<Word> words = new ArrayList<Word>();

	@PostConstruct
	public void init(){
		words = getWordRepository().findAll();
	}
	
	public void insert(ActionEvent event){
		Word word = new Word();
		word.setName("ball");
		word.setTranslate("мяч");
		word.setSentence("It's nice ball");
		getWordRepository().create(word);
	}

	public WordRepository getWordRepository() {
		return wordRepository;
	}

	public void setWordRepository(WordRepository wordRepository) {
		this.wordRepository = wordRepository;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}
	
}

