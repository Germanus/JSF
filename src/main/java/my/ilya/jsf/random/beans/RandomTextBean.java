package my.ilya.jsf.random.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.inject.Named;

//@Named(value = "random")
@ManagedBean(name="random")
@SessionScoped
public class RandomTextBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String textType = "gibberish";
	private String outputTag = "p";
	private Integer count = 10;
	private Integer minWords = 5;
	private Integer maxWords = 10;

	public String getTextType() {
		return textType;
	}

	public void setTextType(String textType) {
		this.textType = textType;
	}

	public String getOutputTag() {
		return outputTag;
	}

	public void setOutputTag(String outputTag) {
		this.outputTag = outputTag;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getMinWords() {
		return minWords;
	}

	public void setMinWords(Integer minWords) {
		this.minWords = minWords;
	}

	public Integer getMaxWords() {
		return maxWords;
	}

	public void setMaxWords(Integer maxWords) {
		this.maxWords = maxWords;
	}

}
