package my.ilya.jsf.core;


import javax.persistence.Id;

public class BaseEntity {

	@Id
    private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
