package main;

public class Ingridients {
	public static class Ingridient {
		Integer amount;
		String unit;
		public Ingridient(Integer amount,String unit){
			this.amount=amount;
			this.unit=unit;
		}
		
		public Ingridient() {
			// TODO Auto-generated constructor stub
		}
		
		
		

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		@Override
		public String toString() {
			
			return "("+amount.toString()+" , " +unit +")"; 
		}
	}

	Ingridients.Ingridient sugar;
	Ingridient fructose;
	public Ingridients.Ingridient getSugar() {
		return sugar;
	}

	public void setSugar(Ingridients.Ingridient sugar) {
		this.sugar = sugar;
	}

	public Ingridient getFructose() {
		return fructose;
	}

	public void setFructose(Ingridient fructose) {
		this.fructose = fructose;
	}

	public Ingridient getVanilin() {
		return vanilin;
	}

	public void setVanilin(Ingridient vanilin) {
		this.vanilin = vanilin;
	}

	Ingridient vanilin;
	
	public Ingridients(Ingridient sugar, Ingridient fructose,Ingridient vanilin){
		this.sugar=sugar;
		this.fructose=fructose;
		this.vanilin=vanilin;
		
	}

	public Ingridients() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "sugar: "+getSugar()+" vanilin: "+getVanilin()+" fructose: "+getFructose();
	}
	
	
}
