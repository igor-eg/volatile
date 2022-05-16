public class StreamUser extends Thread {

    @Override
    public void run() {
        int toggleSwitchOnPeriod = 3000;
        try {
            while (!isInterrupted()) {
                if (!Main.toggleSwitch) {
                    Main.toggleSwitch = true;
                    Thread.sleep(toggleSwitchOnPeriod);
                    System.out.printf("%s включает тумблер!\n", getName());
                }
            }
        } catch (InterruptedException err) {
        }
    }

}

