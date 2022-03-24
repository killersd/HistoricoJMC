package br.com.historico.historico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunosController {

	@Autowired
	private AlunosRepository ar;

	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.GET)
	public String cadastro() {
		return "alunos/formCadastro";
	}

	@RequestMapping(value = "/cadastrarAluno", method = RequestMethod.POST)
	public String cadastro(Aluno aluno) {
		
		ar.save(aluno);
		
		return "redirect:/formCadastro";
	}
	
	@RequestMapping("/alunos")
	public ModelAndView listaAlunos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Aluno> alunos = ar.findAll();
		mv.addObject("alunos", alunos);
		return mv;
	}
	
	
}
