package SpringWork.controllers;

import SpringWork.models.MapTask;
import SpringWork.repositorys.MapTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/test")
    public String mapTask (Model model){
        model.addAttribute("task", "mapping");
        return "map-jsp";
    }

}
