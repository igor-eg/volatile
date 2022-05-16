public class StreamToy extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            if (Main.toggleSwitch) {
                Main.toggleSwitch = false;
                System.out.printf(" %s выключает тумблер!\n", getName());
            }
        }

    }
}

