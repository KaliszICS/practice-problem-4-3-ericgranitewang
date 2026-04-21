class Chair {
    private int legs;
    private String material;

    public Chair () {
        legs = 4;
        material = "wood";
    }

    public Chair (int legs) {
        this.legs = legs;
        material = "wood";
    }

    public Chair (int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial () {
        return material;
    }
}