package by.bsuir.tournament.validation;

import by.bsuir.tournament.model.Participant;
import org.springframework.validation.Errors;

public class ParticipantValidator extends PersonValidator {
  public void validate(Participant participant, Errors errors) {
    super.validate(participant, errors);
  }
}
