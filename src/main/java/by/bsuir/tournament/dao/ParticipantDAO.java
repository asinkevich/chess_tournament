package by.bsuir.tournament.dao;

import by.bsuir.tournament.model.Participant;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface ParticipantDAO {
  Participant loadParticipant(int id);

  Collection<Participant> findAllFemaleParticipants();

  Collection<Participant> findAllMaleParticipants();

  void storeParticipant(Participant participant);
}
