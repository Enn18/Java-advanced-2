package DaysOfTheWeek1;

public enum Cereals {
    CAPTAIN(100),
    FROOT_LOOPS(50),
    REESES(75),
    COCOA_PUFFS(25);

    final int levelOfDeliciousness;

    Cereals (int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
