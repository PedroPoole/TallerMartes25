package taller2.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class House {
	private int wallNumber;
	private String wallColor;
	private int doorNumber;
	private String doorMaterial;
	private int floors;
	private int terraces;
	private String terraceFloorMaterial;
	private boolean hasPorch;
	private int porchWidth;
	private int porchLength;
	private boolean hasGarden;
	private String gardenFloor;
	private int numberOfTrees;

}

