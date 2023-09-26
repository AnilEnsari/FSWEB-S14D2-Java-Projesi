public class Room {
   private int size ;
   private int width ;
   private boolean isSeenSun ;
   public Room (int size , int width,boolean isSeenSun){

       this.size = size;
       this.width = width;
       this.isSeenSun = isSeenSun;
   }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public boolean isSeenSun() {
        return isSeenSun;
    }

    @Override
    public String toString() {
        return "Room{" +
                "size=" + size +
                ", width=" + width +
                ", isSeenSun=" + isSeenSun +
                '}';
    }

}


