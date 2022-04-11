package ma.enset.etudiantmvc.web;

import lombok.AllArgsConstructor;
import ma.enset.etudiantmvc.entities.Etudiant;
import ma.enset.etudiantmvc.repositories.EtudiantRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor

public class EtudiantController {
    private EtudiantRepository etudiantRepository ;

    @GetMapping(path = "/index")
    public String index(Model model,
                        @RequestParam(name="page",defaultValue = "0") int page ,
                        @RequestParam(name="size",defaultValue = "5") int size,
                        @RequestParam(name="keyword",defaultValue = "") String keyword){

        Page<Etudiant> etudiantPages =  etudiantRepository.findByNomContains(keyword,PageRequest.of(page,size));
        model.addAttribute("listEtudiants" ,etudiantPages.getContent()) ;
        model.addAttribute("pages",new int[etudiantPages.getTotalPages()]) ;
        model.addAttribute("currentPage",page) ;
        model.addAttribute("keyword",keyword) ;

        return "Etudiants";
    }

    @GetMapping(path = "/delete")
    public  String delete(Long id,String keyword , int page){
        etudiantRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword ;
    }
}
