package by.bsuir.tournament.model;

import org.springframework.samples.petclinic.BaseEntity;

import java.util.HashSet;
import java.util.Set;

public class Tour extends BaseEntity {
  private int index;
  private Set<Party> parties;

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public Set<Party> getParties() {
    return parties;
  }

  public void setParties(Set<Party> parties) {
    this.parties = parties;
  }

  public void addParty(Party party) {
    if (parties == null) {
      parties = new HashSet<Party>();
    }
    parties.add(party);
  }
}
