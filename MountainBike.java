public class MountainBike extends Bicycle {
        
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    } 
    
    public static void main()
    {
        //Bicycle aBike = new MountainBike(4, 3, 2, 1);
        //aBike.setHeight(4);
        
        MountainBike aMBike = new MountainBike(4, 3, 2, 1);
        aMBike.speedUp(4);
    }
}