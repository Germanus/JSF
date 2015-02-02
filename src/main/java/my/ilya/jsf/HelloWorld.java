package my.ilya.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import my.ilya.jsf.dao.ProfessorRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
   public String getMessage() {
	   ApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
	   ProfessorRepository professorRepository = ctx.getBean(ProfessorRepository.class);
      return professorRepository.findAll().toString();
   }
}