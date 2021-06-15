package lambda;

import java.util.function.Predicate;

public class LambdaMain {

	public static void main(String[] args) {
		Predicate<String> p=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return (t.contains("g")) ;
			}
			
		};
		
		Predicate<String> p1=t->t.contains("g");

	}

}
