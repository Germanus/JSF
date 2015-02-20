package my.ilya.jsf.dao;

import javax.transaction.Transactional;

import my.ilya.jsf.core.Professor;


import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProfessorRepository extends BaseRepository<Professor> {
	
	public ProfessorRepository() {
		super(Professor.class);
	}
		
}
