package ro.uvt.info.splab2023;

public class GnomeBattalion extends Battalion {

    public GnomeBattalion(int size, BattleStrategy battleStrategy) {
        super(size, battleStrategy);
    }

    @Override
    public void prepareForBattle() {
        battleStrategy.applyStrategy();
    }


}
