package kodlama_io.Kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;

import kodlama_io.Kodlama.io.Devs.entities.programmingLanguage;

public interface Repository {


	List<programmingLanguage> getAll();
    void add(programmingLanguage programmingLanguages);
    void  delete( int id) throws Exception;
    programmingLanguage getByid(int id) throws Exception;
    void update(int id, programmingLanguage programmingLanguages) throws  Exception;
	
}
