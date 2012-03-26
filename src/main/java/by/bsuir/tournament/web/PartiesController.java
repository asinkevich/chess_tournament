package by.bsuir.tournament.web;

import by.bsuir.tournament.dao.PartiesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartiesController {

  private PartiesDAO partiesService;

  @Autowired
  public PartiesController(PartiesDAO partiesService) {
    this.partiesService = partiesService;
  }

  @RequestMapping(value = "/parties")
  public String getAllParties(Model model) {
    model.addAttribute("parties", partiesService.findAllParties());
    return "parties/list";
  }
}
