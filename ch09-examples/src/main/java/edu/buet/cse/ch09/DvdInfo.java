package edu.buet.cse.ch09;

/**
 * Class to contain basic DVD info
 * 
 * @author shamim
 *
 */
public class DvdInfo {
  private final String title;
  private final String genre;
  private final String leadActor;

  public DvdInfo(String title, String genre, String leadActor) {
    this.title = title;
    this.genre = genre;
    this.leadActor = leadActor;
  }

  public String getTitle() {
    return title;
  }

  public String getGenre() {
    return genre;
  }

  public String getLeadActor() {
    return leadActor;
  }

  @Override
  public String toString() {
    return String.format("Title: %s, Genre: %s, Lead Actor: %s", title, genre, leadActor);
  }
}
