package org.campus02.raumschiff;

public class Starship {

  private String name;
  private Transporter transporter;

  public Starship(String name) {
    this.name = name;
    this.transporter = new Transporter();
  }

  public Starship(String name, Transporter transporter) {
    this.name = name;
    this.transporter = transporter;
  }

  public void beamUp(String person, String from) {
    try {
      transporter.beam(person,from,name,true);
    } catch (TransporterMalfunctionException e) {
      e.printStackTrace();
    } finally {
      transporter.shutdown();
    }
  }

}
