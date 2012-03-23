package by.bsuir.tournament.web;

import by.bsuir.tournament.dao.ParticipantDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FindParticipantsForm {
  private ParticipantDAO participantDAO;

  @Autowired
  public FindParticipantsForm(ParticipantDAO participantDAO) {
    this.participantDAO = participantDAO;
  }

  @RequestMapping(value = "/participants", method = RequestMethod.GET)
  public String getAllParticipants(Model model) {
    model.addAttribute("girls", participantDAO.findAllFemaleParticipants());
    model.addAttribute("boys", participantDAO.findAllMaleParticipants());
    return "participants/allParticipants";
  }
}
