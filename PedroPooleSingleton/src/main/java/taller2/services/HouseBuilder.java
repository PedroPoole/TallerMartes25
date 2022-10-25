package taller2.services;

import taller2.persistence.House;

public class HouseBuilder {
	private House house;
	
	public HouseBuilder() {
		this.house = new House();
	}
	
	public HouseBuilder addWalls(int number, String color) {
		house.setWallNumber(number);
		house.setWallColor(color);
		return this;
	}
	
	public HouseBuilder addDoors(int number, String material) {
		house.setDoorNumber(number);
		house.setDoorMaterial(material);
		return this;
	}
	
	public HouseBuilder defineFloors(int number) {
		house.setFloors(number);
		return this;
	}
	
	public HouseBuilder addTerraces(int number, String material) {
		house.setTerraces(number);
		house.setTerraceFloorMaterial(material);
		return this;
	}
	
	public HouseBuilder definePorch(int width, int length) {
		house.setHasPorch(true);
		house.setPorchLength(length);
		house.setPorchWidth(width);
		return this;
	}
	
	public HouseBuilder addGarden(String floortype, int numberOfTrees) {
		house.setHasGarden(true);
		house.setGardenFloor(floortype);
		house.setNumberOfTrees(numberOfTrees);
		return this;
	}
	
	public House build(){
		return this.house;
	}
	
	
	
}
