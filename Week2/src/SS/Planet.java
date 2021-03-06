package SS;

import java.util.HashMap;

public enum Planet {

	MERCURY(1),
	VENUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	URANUS(7),
	NEPTUNE(8),
	PLUTO(9);
	
	private final int planNum;
	Planet(int planNum){
		this.planNum = planNum;
	}
	
	//hashmap is a datatype kind of like an array
	public static HashMap<Planet,Integer> getOrder(double order){
		HashMap<Planet, Integer> fromSun = new HashMap<Planet, Integer>();
		//array
		Planet[] myPlanets = {PLUTO,NEPTUNE,URANUS,SATURN,JUPITER,MARS,EARTH,VENUS,MERCURY};
		
		//fix the math here
		double InOrder = order*9;
		//for condition
		for(int i=0; i<myPlanets.length; i++){
			Planet myPlanet = myPlanets[i];
			int num = (int) Math.floor(InOrder/myPlanet.planNum);
			InOrder = InOrder%myPlanet.planNum;
			fromSun.put(myPlanet,num);
		}
		return fromSun;
	}
	
}

