package viljar;
public class Arvuta {
  public double Arvutapalk(double tunnitasu, double tooaeg ){
    return Math.round((tunnitasu*tooaeg)*100)/100 ;
  }
  public double ArvutaKulu(double tunnitasu, double tooaeg){
    return Math.round((Arvutapalk(tunnitasu,tooaeg)/0.7474)*100)/100;
  }
  public double Arvutakatte(double tunnitasu, double tooaeg){
  return Math.round((Arvutapalk(tunnitasu,tooaeg)-Arvutapalk(tunnitasu,tooaeg)*0.1486)*100)/100;

  }
}
