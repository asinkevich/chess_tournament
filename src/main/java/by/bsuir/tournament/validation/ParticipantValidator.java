package by.bsuir.tournament.validation;

import org.springframework.validation.Errors;
import by.bsuir.tournament.model.Participant;

public class ParticipantValidator extends PersonValidator {
  public void validate(Participant participant, Errors errors) {
    super.validate(participant, errors);
  }
}
