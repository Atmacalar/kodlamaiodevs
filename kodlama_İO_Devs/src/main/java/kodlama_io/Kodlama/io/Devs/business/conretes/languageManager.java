package kodlama_io.Kodlama.io.Devs.business.conretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama_io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama_io.Kodlama.io.Devs.dataAcces.abstracts.Repository;
import kodlama_io.Kodlama.io.Devs.entities.programmingLanguage;

@Service
public class languageManager implements LanguageService  {
	
   
private Repository repository;

@Autowired
public languageManager(Repository repository) {
	
	this.repository=repository;
	
}


@Override
public List<programmingLanguage> getAll() {
    return this.repository.getAll();
}

@Override
public void add(programmingLanguage programmingLanguages) throws Exception {
	  if (programmingLanguages.getName().isEmpty()) {
          throw new Exception("Programlama ismi bos olamaz");
      }
        if (isName(programmingLanguages)) throw new Exception("Mevcut Proglama Dili");
      repository.add(programmingLanguages);
	
}

@Override
public void delete(int id) throws Exception {
	  repository.delete(id);
	
}

@Override
public programmingLanguage getById(int id) throws Exception {
	return repository.getByid(id);
}

@Override
public void update(int id, programmingLanguage programmingLanguages) throws Exception {
	 if (isName(programmingLanguages)) throw  new Exception("Ad  eyni ola bilmez");
     repository.update(id, programmingLanguages);
    }
	

	

	//mevcut name var mı kontrolü
public boolean isName(programmingLanguage programmingLanguages) {
    for (programmingLanguage mylanguage : getAll()) {
        if (mylanguage.getName().equals(programmingLanguages.getName())) {
            return true;

        }
    }
    return false;
}
	
	

}
