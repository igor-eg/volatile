public class Main {
    public static volatile boolean toggleSwitch = false;
    private static final int GAME_TIME = 10000;

    public static void main(String[] args) {

        System.out.println("Начало игры");
        StreamUser streamUser = new StreamUser();
        StreamToy streamToy = new StreamToy();

        streamUser.setName("пользователь");
        streamUser.start();
        streamToy.setName("кошка");
        streamToy.start();

        try {
            Thread.sleep(GAME_TIME);
            streamToy.interrupt();
            streamUser.interrupt();
            System.out.println("хватит мучать кошку");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}





