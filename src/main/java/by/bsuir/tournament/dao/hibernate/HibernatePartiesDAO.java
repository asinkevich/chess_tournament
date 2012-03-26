package by.bsuir.tournament.dao.hibernate;

import by.bsuir.tournament.dao.PartiesDAO;
import by.bsuir.tournament.model.Party;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public class HibernatePartiesDAO implements PartiesDAO {
  SessionFactory sessionFactory;

  @Autowired
  public HibernatePartiesDAO(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  @Transactional(readOnly = true)
  @SuppressWarnings("unchecked")
  public Collection<Party> findAllParties() throws DataAccessException {
    return sessionFactory.getCurrentSession().createQuery("from Party").list();
  }
}
