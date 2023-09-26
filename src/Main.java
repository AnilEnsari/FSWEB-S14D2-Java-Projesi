import Enums.LampType;
import Enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("east");
        wall1.create();
        Wall wall2 = new Wall("west");
        wall2.create();

        Wall wall3 = new Wall("south");
        wall3.create();
        Wall wall4 = new Wall("north");

        wall4.create();

        Ceiling ceiling = new Ceiling(2, PaintColor.WHITE);
        ceiling.create();
        Bed bed = new Bed("Double", 120, 180, 220, 200);
        bed.make();
        Lamp lamp = new Lamp(LampType.SPOT_LAMP, true, 54);

        lamp.turnOn();
        Wardrobe wardrobe = new Wardrobe(100, 220, 60);
        wardrobe.add();
        Carpet carpet = new Carpet(120, 150, PaintColor.BLUE);
        carpet.lying();

        Bedroom myBedroom = new Bedroom(450,200,true,"Anil",wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println(myBedroom);

    }
}