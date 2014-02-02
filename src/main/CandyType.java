package main;

public enum CandyType {
	CHOCOLATE("chocolate"),
	SWEET("sweet"),
	WAFFEL("waffel");
	
	String candyType;
	
	private CandyType(String candyType) {
		this.candyType=candyType;
	}
	
	public static CandyType getCandyType(String str){
        for(CandyType currCandyType : CandyType.values()){
            if(currCandyType.candyType.equals(str))
                return currCandyType;
        }
        return null;
    }

}
