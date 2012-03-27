package by.bsuir.tournament.web;

import by.bsuir.tournament.model.NewsArticle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/news/new")
@SessionAttributes(types = NewsArticle.class)

public class AddNewsForm {
  @RequestMapping(method = RequestMethod.GET)
  public String setupForm(Model model) {
    NewsArticle news = new NewsArticle();
    model.addAttribute(news);
    return "news/form";
  }
}
