package by.bsuir.tournament.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {

  @RequestMapping(value = "/news", method = RequestMethod.GET)
  public String getListOfNews(Model model) {
    return "news/list";
  }
}
