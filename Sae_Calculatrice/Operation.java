public abstract class Operation extends Expression
{
	private Expression n1;
	private Expression n2;
	
	public Operation (Expression n1,Expression n2){ 
		this.n1=n1;
		this.n2=n2;
}

	public abstract int valeur();

	public Expression getOperande1() {
	return this.n1;}

	public Expression getOperande2(){
	return this.n2;
	}


}
