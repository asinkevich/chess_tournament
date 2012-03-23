package by.bsuir.tournament.web;

import by.bsuir.tournament.dao.ParticipantDAO;
import by.bsuir.tournament.model.Country;
import by.bsuir.tournament.model.Gender;
import by.bsuir.tournament.model.Participant;
import by.bsuir.tournament.validation.ParticipantValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/participants/new")
@SessionAttributes(types = Participant.class)
public class AddParticipantForm {
  private final ParticipantDAO participantDAO;

  @Autowired
  public AddParticipantForm(ParticipantDAO participantDAO) {
    this.participantDAO = participantDAO;
  }

  @InitBinder
  public void setAllowedFields(WebDataBinder dataBinder) {
    dataBinder.setDisallowedFields("id");
  }

  @RequestMapping(method = RequestMethod.GET)
  public String setupForm(Model model) {
    Participant participant = new Participant();
    model.addAttribute(participant);
    model.addAttribute("countries", Country.values());
    model.addAttribute("genders", Gender.values());
    return "participants/form";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String processSubmit(@ModelAttribute Participant participant, BindingResult result, SessionStatus status) {
    new ParticipantValidator().validate(participant, result);
    if (result.hasErrors()) {
      return "participants/form";
    }
    participantDAO.storeParticipant(participant);
    status.setComplete();
    return "redirect:/participants";
  }
}
