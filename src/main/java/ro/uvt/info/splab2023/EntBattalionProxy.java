package ro.uvt.info.splab2023;

public class EntBattalionProxy extends Battalion {

    private EntBattalion entBattalion;

    public EntBattalionProxy(int size, BattleStrategy battleStrategy) {
        super(size, battleStrategy);
    }

    @Override
    public void prepareForBattle() {
        if (entBattalion == null) {
            entBattalion = new EntBattalion(size, battleStrategy);
        }
        entBattalion.prepareForBattle();
    }
}
