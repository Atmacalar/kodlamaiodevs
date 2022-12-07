package kodlama_io.Kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import kodlama_io.Kodlama.io.Devs.dataAcces.abstracts.Repository;
import kodlama_io.Kodlama.io.Devs.entities.programmingLanguage;




@org.springframework.stereotype.Repository
public class InMemoryProgrammingLanguage implements Repository {
	
	
	List<programmingLanguage> language;
	
	
	
	
   // entities türünde bir liste oluşturduk ve listeye veri ekledik(manuel olarak)
	public InMemoryProgrammingLanguage() {
		language= new ArrayList<>();
		language.add(new programmingLanguage(1,"java"));
		language.add(new programmingLanguage(2,"Pyhton"));
		language.add(new programmingLanguage(3,"C#")); 
		
	}

	//
	
	@Override 
	public List<programmingLanguage> getAll() {
		
		return language;
	}
	
	// listeye businesstan gelen veriyi ekledik

	@Override
	 public void add(programmingLanguage programmingLanguage) {
		 language.add(programmingLanguage);
    }

	@Override
	public void delete(int id) throws Exception {
		language.remove(getByid(id));
	}

	@Override
	public programmingLanguage getByid(int id) throws Exception {
		for (programmingLanguage languages1: language){
            if (languages1.getId()== id){
                return languages1 ;
            }
        }
        throw new Exception("kayit bulunamadi");
		
	}
	
	// getbyid ye id yi parametre gönder, getbyid sana o veriyi döndürecek

	@Override
	public void update(int id, programmingLanguage programmingLanguages) throws Exception {
		programmingLanguage programmingLanguages1 = getByid(id);
        programmingLanguages1.setName(programmingLanguages.getName());		
	}

	

	

	

	
	
	

}
