package by.bsuir.tournament.validation;

import org.springframework.samples.petclinic.Person;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class PersonValidator {
  protected void validate(Person person, Errors errors) {
    if (!StringUtils.hasLength(person.getFirstName())) {
      errors.rejectValue("firstName", "required", "required");
    }
    if (!StringUtils.hasLength(person.getLastName())) {
      errors.rejectValue("lastName", "required", "required");
    }
  }
}
