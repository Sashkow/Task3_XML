package main;

public class Values {
	public class Value {
		Integer amount;
		String unit;
		public Value(Integer amount,String unit){
			this.amount=amount;
			this.unit=unit;
		}
		
		
	}
	Value protein;
	Value fat;
	Value carbohydrate;
	
	public Values(Value protein, Value fat, Value carbohydrate){
		this.protein=protein;
		this.fat=fat;
		this.carbohydrate=carbohydrate;
	}

}
