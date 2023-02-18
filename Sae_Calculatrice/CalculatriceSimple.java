public class CalculatriceSimple {
public static void main(String[] args) {

Expression six = new Nombre(6);

Expression dix = new Nombre(10);

Expression s = new Addition(dix,six);
System.out.println(s+" = "+s.valeur());

Expression s1 = new Soustraction(dix,six);
System.out.println(s1+" = "+s1.valeur());

Expression s2 = new Multiplication(dix,six);
System.out.println(s2+" = "+s2.valeur());

Expression s3 = new Division(dix,six);
System.out.println(s3+" = "+s3.valeur());

Expression s5 = new Soustraction(s,s1);
System.out.println(s+" - "+s1+" = "+s5 +" = "+s5.valeur());








}
}
