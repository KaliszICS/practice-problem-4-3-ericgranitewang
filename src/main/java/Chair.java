/**
 * class about chair
 * @author Eric Wang
 */

public class Chair {
    private int legs;
    private String material;

    /**
     * base constructor
     * legs (int) defaulted to 4, material (String) defaulted to wood
     */
    public Chair () {
        legs = 4;
        material = "wood";
    }

    /**
     * constructor with only legs
     * @param legs int number of legs
     * material (String) is automatically set to wood
     */
    public Chair (int legs) {
        this.legs = legs;
        material = "wood";
    }

    /**
     * constructor with legs and material
     * @param legs int number of legs
     * @param material String material of chair
     */
    public Chair (int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * gets legs
     * @return returns int legs
     */
    public int getLegs() {
        return legs;
    }

    /**
     * gets material
     * @return returns String material
     */
    public String getMaterial () {
        return material;
    }
}