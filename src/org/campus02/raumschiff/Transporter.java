package org.campus02.raumschiff;

public class Transporter {

  public void beam(String person, String from, String to, boolean urgent)
      throws TransporterMalfunctionException {

    if(urgent && Math.random() < 0.5) {
      throw new TransporterMalfunctionException();
    }

    System.out.println("beaming "+person + " from " + from + " to "+ to);

  }

  public void shutdown() {
    System.out.println("shutting down the transporter");
  }

}
