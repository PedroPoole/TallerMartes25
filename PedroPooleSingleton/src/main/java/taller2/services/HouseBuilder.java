package taller2.services;

import taller2.persistence.House;

public class HouseBuilder implements HouseBuilderI {
	private House house;
	
	public HouseBuilder() {
		this.house = new House();
	}
	
	@Override
	public HouseBuilderI addWalls(int number, String color) {
		house.setWallNumber(number);
		house.setWallColor(color);
		return this;
	}
	
	@Override
	public HouseBuilderI addDoors(int number, String material) {
		house.setDoorNumber(number);
		house.setDoorMaterial(material);
		return this;
	}
	
	@Override
	public HouseBuilderI defineFloors(int number) {
		house.setFloors(number);
		return this;
	}
	
	@Override
	public HouseBuilderI addTerraces(int number, String material) {
		house.setTerraces(number);
		house.setTerraceFloorMaterial(material);
		return this;
	}
	
	@Override
	public HouseBuilderI definePorch(int width, int length) {
		house.setHasPorch(true);
		house.setPorchLength(length);
		house.setPorchWidth(width);
		return this;
	}
	
	@Override
	public HouseBuilderI addGarden(String floortype, int numberOfTrees) {
		house.setHasGarden(true);
		house.setGardenFloor(floortype);
		house.setNumberOfTrees(numberOfTrees);
		return this;
	}
	
	@Override
	public House build(){
		return this.house;
	}
	
	
	
}
