import java.util.*;
import java.lang.ArithmeticException;
public class Division extends Operation {
		private Expression n1;
		private Expression n2;

			public Division(Expression n1,Expression n2){
				super(n1,n2);
			}

			public int valeur() throws ArithmeticException {
			int nombre1 = this.getOperande1().valeur();
			int nombre2 = this.getOperande2().valeur();
			if (nombre2==0) {throw new ArithmeticException();}
			return nombre1 / nombre2;
			}

			public String toString () {
				return "("+this.getOperande1().valeur()+"/"+this.getOperande2().valeur()+")"; 	}




		}
