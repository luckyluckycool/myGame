package luckycoolgames.mygame.Resources.types;

public class Fiber extends BasicRes {


    private int fiber=0;

    @Override
   public void add(int value) {
        res = fiber;
        super.add(value);
    }
    public int getFiber() {
        return fiber;
    }
}