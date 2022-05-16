public class Main {
    public static volatile boolean toggleSwitch = false;

    public static void main(String[] args) {
        int gameTime = 15000;

        System.out.println("Начало игры");
        StreamUser streamUser = new StreamUser();
        StreamToy streamToy = new StreamToy();

        streamUser.setName("пользователь");
        streamUser.start();
        streamToy.setName("кошка");
        streamToy.start();

        try {
            Thread.sleep(gameTime);
            streamToy.interrupt();
            streamUser.interrupt();
            System.out.println("хватит мучать кошку");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}





