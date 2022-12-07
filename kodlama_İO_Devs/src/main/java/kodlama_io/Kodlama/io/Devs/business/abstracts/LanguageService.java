package kodlama_io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama_io.Kodlama.io.Devs.entities.programmingLanguage;

public interface LanguageService {
	
	List<programmingLanguage> getAll();
	void  add(programmingLanguage programmingLanguages) throws Exception;
	void delete(int id) throws Exception;
	programmingLanguage getById(int id) throws Exception;
	void update(int id, programmingLanguage programmingLanguages) throws  Exception;
	

}
