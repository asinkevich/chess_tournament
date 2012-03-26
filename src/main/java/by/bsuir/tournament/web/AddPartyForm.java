package by.bsuir.tournament.web;

import by.bsuir.tournament.dao.PartiesDAO;
import by.bsuir.tournament.model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/parties/new")
public class AddPartyForm {
  PartiesDAO partiesService;

  @Autowired
  public AddPartyForm(PartiesDAO partiesService) {
    this.partiesService = partiesService;
  }

  @InitBinder
  public void setDisallowedFields(WebDataBinder dataBinder) {
    dataBinder.setDisallowedFields("id");
  }

  @RequestMapping(method = RequestMethod.GET)
  public String setupForm(Model model) {
    Party party = new Party();
    model.addAttribute(party);
    return "parties/form";
  }
}
