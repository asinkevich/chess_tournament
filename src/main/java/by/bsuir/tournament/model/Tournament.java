package by.bsuir.tournament.model;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.samples.petclinic.BaseEntity;

import java.util.*;

public class Tournament extends BaseEntity {
  private String name;
  private String place;
  private Set<TournamentParticipant> participants;
  private Set<Tour> tours;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public void setParticipantsInternal(Set<TournamentParticipant> participants) {
    this.participants = participants;
  }

  public Set<TournamentParticipant> getParticipantsInternal() {
    if (participants == null) {
      participants = new HashSet<TournamentParticipant>();
    }
    return participants;
  }

  public void setToursInternal(Set<Tour> tours) {
    this.tours = tours;
  }

  public Set<Tour> getToursInternal() {
    if (tours == null) {
      tours = new HashSet<Tour>();
    }
    return tours;
  }

  public List<TournamentParticipant> getParticipants() {
    List<TournamentParticipant> sortedParticipants = new ArrayList<TournamentParticipant>(getParticipantsInternal());
    PropertyComparator.sort(sortedParticipants, new MutableSortDefinition("score", true, false));
    return Collections.unmodifiableList(sortedParticipants);
  }

  public List<Tour> getTours() {
    List<Tour> sortedTours = new ArrayList<Tour>(getToursInternal());
    PropertyComparator.sort(sortedTours, new MutableSortDefinition("index", true, true));
    return sortedTours;
  }

  public List<Participant> getCommonParticipants() {
    List<TournamentParticipant> participants = getParticipants();
    List<Participant> commonParticipants = new ArrayList<Participant>(participants.size());
    for (TournamentParticipant tournamentParticipant : participants) {
      commonParticipants.add(tournamentParticipant.getParticipant());
    }
    return Collections.unmodifiableList(commonParticipants);
  }
}
