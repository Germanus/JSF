package my.ilya.jsf.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Word {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	private String name;
	private String translate;
	private String sentence;
	
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public String getTranslate() {
		return translate;
	}
	public void setTranslate(String translate) {
		this.translate = translate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
