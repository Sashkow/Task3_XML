package main;

public class Ingridients {
	public class Ingridient {
		Integer amount;
		String unit;
		public Ingridient(Integer amount,String unit){
			this.amount=amount;
			this.unit=unit;
		}
	}

	Ingridients.Ingridient sugar;
	Ingridient fructose;
	Ingridient vanilin;
	
	public Ingridients(Ingridient sugar, Ingridient fructose,Ingridient vanilin){
		this.sugar=sugar;
		this.fructose=fructose;
		this.vanilin=vanilin;
		
	}
	
	
	
}
