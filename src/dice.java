public class dice {
    int[] d20;

    private void createNewRep() {

        this.d20 = new int[20];

    }

    public dice() {

        this.createNewRep();

    }

    public dice(int x) {
        assert x <= 20;

        this.createNewRep();
        for (int i = 0; i < x; i++) {
            this.d20[i] = i + 1;
        }

    }

    public static int roll(int[] die) {
        int roll = (int) (Math.random() * ((die.length - 1) + 1) + 1);
        return roll;
    }

    public static void main(String[] args) {
        int[] die = { 1, 2, 3, 4, 5, 6 };
        System.out.println(roll(die));
    }
}
