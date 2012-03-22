package by.bsuir.tournament.web;

import by.bsuir.tournament.dao.TournamentDAO;
import by.bsuir.tournament.model.NewsArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class NewsController {

  private TournamentDAO tournamentDAO;

  @Autowired
  public NewsController(TournamentDAO tournamentDAO) {
    this.tournamentDAO = tournamentDAO;
  }

  @RequestMapping(value = "/news", method = RequestMethod.GET)
  public String getListOfNews(Model model) {
    model.addAttribute("news", tournamentDAO.findNews());
    return "news/newsList";
  }
}
