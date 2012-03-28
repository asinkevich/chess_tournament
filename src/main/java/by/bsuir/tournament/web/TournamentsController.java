package by.bsuir.tournament.web;

import by.bsuir.tournament.dao.TournamentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TournamentsController {
  private TournamentDAO tournamentService;

  @Autowired
  public TournamentsController(TournamentDAO tournamentService) {
    this.tournamentService = tournamentService;
  }

  @RequestMapping(value = "/tournaments", method = RequestMethod.GET)
  public String getListOfTournaments(Model model) {
    model.addAttribute("tournaments", tournamentService.findTournaments());
    return "tournaments/list";
  }

  @RequestMapping("/tournaments/{tournamentId}")
  public ModelAndView tournamentHandler(@PathVariable("tournamentId") int tournamentId) {
    ModelAndView mav = new ModelAndView("tournaments/show");
    mav.addObject(tournamentService.loadTournament(tournamentId));
    return mav;
  }

  @RequestMapping("/tournaments/*/{tourId}")
  public ModelAndView tourHandler(@PathVariable("tourId") int tourId) {
    ModelAndView mav = new ModelAndView("tournaments/tour");
    mav.addObject(tournamentService.loadTour(tourId));
    return mav;
  }
}
