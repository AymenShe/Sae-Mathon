public class Nombre extends Expression {

private int valeurNombre;

public Nombre(int val) {
	this.valeurNombre=val;
}

public int valeur() {
return this.valeurNombre;
}

public String toString() {
return "Valeur de Nombre : "+this.valeurNombre;
}

}
