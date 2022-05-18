public class StreamUser extends Thread {
    private static final int TOGGLE_SWITCH_ON_PERIOD = 1000;

    @Override
    public void run() {

        try {
            while (!isInterrupted()) {
                if (!Main.toggleSwitch) {
                    Main.toggleSwitch = true;
                    Thread.sleep(TOGGLE_SWITCH_ON_PERIOD);
                    System.out.printf("%s включает тумблер!\n", getName());
                }
            }
        } catch (InterruptedException err) {
        }
    }

}

