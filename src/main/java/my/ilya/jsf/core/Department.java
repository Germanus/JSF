package my.ilya.jsf.core;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy="department")
	private Collection<Professor> employees;
	
	public Department(){
		employees = new ArrayList<Professor>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
        return "Department no: " + getId() + 
               ", name: " + getName();
    }
}
