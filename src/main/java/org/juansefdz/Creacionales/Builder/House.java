package org.juansefdz.Creacionales.Builder;

public class House {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final String interior;
    private final int rooms;
    private final int bathrooms;
    private final boolean garage;
    private final boolean swimmingPool;

    // Constructor privado para ser usado por el Builder
    public House(HouseBuilder builder) {
        this.foundation = builder.getFoundation();
        this.structure = builder.getStructure();
        this.roof = builder.getRoof();
        this.interior = builder.getInterior();
        this.rooms = builder.getRooms();
        this.bathrooms = builder.getBathrooms();
        this.garage = builder.isGarage();
        this.swimmingPool = builder.isSwimmingPool();
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                ", rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                '}';
    }
}
