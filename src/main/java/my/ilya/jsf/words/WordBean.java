package my.ilya.jsf.words;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "wordBean", eager = true)
@RequestScoped
public class WordBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public String getWord(){
		return "fff";
	}
}
