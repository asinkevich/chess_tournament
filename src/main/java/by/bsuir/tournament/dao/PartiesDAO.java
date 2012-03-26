package by.bsuir.tournament.dao;

import by.bsuir.tournament.model.Party;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface PartiesDAO {
  Collection<Party> findAllParties() throws DataAccessException;
}
