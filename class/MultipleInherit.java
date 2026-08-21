public class MultipleInherit {
    interface LandVehicle {
        default void landInfo() {
            System.out.println("This is a landvehicle");
        }
    }

    interface waterVehicle{
        default void waterInfo(){
            System.out.println("This is a WaterVehicle");
        }
    }

    static class AmphibiousVehicle implements LandVehicle, waterVehicle{
        AmphibiousVehicle(){
            System.out.println("This is a AmphibiousVehicle");
        }
    }public class Main {
        public static void main(String[] args) {
            AmphibiousVehicle obj = new AmphibiousVehicle();
            obj.waterInfo();
            obj.landInfo();
        }
    }
}
