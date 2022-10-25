package taller2.services;

import taller2.persistence.House;

public interface HouseBuilderI {

	HouseBuilderI addWalls(int number, String color);

	HouseBuilderI addDoors(int number, String material);

	HouseBuilderI defineFloors(int number);

	HouseBuilderI addTerraces(int number, String material);

	HouseBuilderI definePorch(int width, int length);

	HouseBuilderI addGarden(String floortype, int numberOfTrees);

	House build();

}