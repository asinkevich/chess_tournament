package by.bsuir.tournament.dao.hibernate;

import by.bsuir.tournament.dao.ParticipantDAO;
import by.bsuir.tournament.model.Gender;
import by.bsuir.tournament.model.Participant;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public class HibernateParticipantDAO implements ParticipantDAO {
  private SessionFactory sessionFactory;

  @Autowired
  public HibernateParticipantDAO(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  @Transactional(readOnly = true)
  public Participant loadParticipant(int id) {
    return (Participant) sessionFactory.getCurrentSession().load(Participant.class, id);
  }

  @Override
  @Transactional(readOnly = true)
  @SuppressWarnings("unchecked")
  public Collection<Participant> findAllFemaleParticipants() {
    return findAllParticipantsByGender(Gender.FEMALE);
  }

  @Override
  @Transactional(readOnly = true)
  @SuppressWarnings("unchecked")
  public Collection<Participant> findAllMaleParticipants() {
    return findAllParticipantsByGender(Gender.MALE);
  }

  @SuppressWarnings("unchecked")
  private Collection<Participant> findAllParticipantsByGender(Gender gender) {
    return sessionFactory.getCurrentSession().createQuery("from Participant participant where participant.gender like :gender")
        .setString("gender", gender.name()).list();
  }

  @Override
  @Transactional
  public void storeParticipant(Participant participant) {
    sessionFactory.getCurrentSession().merge(participant);
  }
}
