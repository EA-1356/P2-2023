package predavanje10;

import edu.princeton.cs.algs4.StdDraw;
import java.awt.Color;

/**
 *
 * @author tomaz
 */
public class Krog extends Lik {

  private double r;  // polmer kroga

  public Krog(double x, double y, double r, Color barva) {
    super(x, y, barva);
    this.r = r;
  }

  
  
  public double getR() {
    return r;
  }
  public void setR(double r) {
    this.r = r;
  }
  
  void narisiSe() {
    StdDraw.setPenColor(getBarva());
    StdDraw.filledCircle(getX(), getY(), r);
  }
  
  void povecajSe(double f) {
    this.r = this.r * f;
  }
}
