package my.ilya.jsf.words.dao;

import javax.transaction.Transactional;

import my.ilya.jsf.core.Professor;


import my.ilya.jsf.core.Word;
import my.ilya.jsf.dao.BaseRepository;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class WordRepository extends BaseRepository<Word> {
	
	public WordRepository() {
		super(Word.class);
	}
		
}
