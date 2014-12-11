package my.ilya.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterBean {
	
	private int input ;
	private int output = 100;
	
	public void submit(){
		output = input;
	}
	
	public int getTime(){
		return 8;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

}
