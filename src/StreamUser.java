public class StreamUser extends Thread {

    @Override
    public void run() {
        final int TOGGLE_SWITCH_ON_PERIOD = 3000;
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

