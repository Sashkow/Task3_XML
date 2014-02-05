package main;

public enum ChocolateType {
	WHITE("white"),
	BLACK("black"),
	MILK("milk");
	
	private String chocolateType;
	
	ChocolateType(String chocolateType) {
		this.chocolateType=chocolateType;
	}
	
	public static ChocolateType getChocolateType(String str){
        for(ChocolateType currChocolateType : ChocolateType.values()){
            if(currChocolateType.chocolateType.equals(str))
                return currChocolateType;
        }
        return null;
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return chocolateType;
	}
	

}
