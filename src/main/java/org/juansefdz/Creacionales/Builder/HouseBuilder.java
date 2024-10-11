package org.juansefdz.Creacionales.Builder;

public class HouseBuilder {

    // Atributos de la casa
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private int rooms;
    private int bathrooms;
    private boolean garage;
    private boolean swimmingPool;

    // Constructor del Builder con atributos obligatorios
    public HouseBuilder(String foundation, String structure, String roof, int rooms, int bathrooms) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    // Setters encadenados para los atributos opcionales
    public HouseBuilder setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    public HouseBuilder setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    // Método para construir el objeto final House
    public House build() {
        return new House(this);
    }

    // Getters para acceder a los atributos desde la clase House
    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean isGarage() {
        return garage;
    }

    public boolean isSwimmingPool() {
        return swimmingPool;
    }
}

