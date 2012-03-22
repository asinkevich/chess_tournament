package by.bsuir.tournament.dao;

import by.bsuir.tournament.model.Participant;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface ParticipantDAO {
  Collection<Participant> findAllParticipants() throws DataAccessException;

  Collection<Participant> findAllFemaleParticipants() throws DataAccessException;

  Collection<Participant> findAllMaleParticipants() throws DataAccessException;
}
