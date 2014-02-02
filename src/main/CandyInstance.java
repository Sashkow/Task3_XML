package main;
//CandyInstance
public class CandyInstance {
	Ingridients ingridients;
	Values values;
	String producion;
	Integer id;
	String name;
	Integer energy;
	
	
	public Ingridients getIngridients() {
		return ingridients;
	}

	public void setIngridients(Ingridients ingridients) {
		this.ingridients = ingridients;
	}

	public Values getValues() {
		return values;
	}

	public void setValues(Values values) {
		this.values = values;
	}

	public String getProducion() {
		return producion;
	}

	public void setProducion(String producion) {
		this.producion = producion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public CandyType getType() {
		return type;
	}

	public void setType(CandyType type) {
		this.type = type;
	}

	public ChocolateType getChocolate() {
		return chocolate;
	}

	public void setChocolate(ChocolateType chocolate) {
		this.chocolate = chocolate;
	}

	public boolean isHasWater() {
		return hasWater;
	}

	public void setHasWater(boolean hasWater) {
		this.hasWater = hasWater;
	}

	CandyType type;
	ChocolateType chocolate;
	boolean hasWater;
	
	public CandyInstance(){
		
	}
	
	
	

}
