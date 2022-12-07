package kodlama_io.Kodlama.io.Devs.wepApi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama_io.Kodlama.io.Devs.business.abstracts.LanguageService;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {
	
	private LanguageService languageService;

    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<programmingLanguage> getAll() {
        return this.languageService.getAll();
    }

    @GetMapping("/{id}")
    programmingLanguage getById(@PathVariable int id) throws Exception {
        return languageService.getById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, programmingLanguage programmingLanguages) throws Exception {
        languageService.update(id, programmingLanguages);
    }

    @PostMapping("/add")
    public void add(@RequestBody() programmingLanguage programmingLanguages) throws Exception {
        languageService.add(programmingLanguages);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception {
        languageService.delete(id);
    }

}
