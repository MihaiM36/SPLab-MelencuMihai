package ro.uvt.info.splab2023;

public class EntBattalion extends Battalion{

    public EntBattalion(int size, BattleStrategy battleStrategy) {
        super(size, battleStrategy);
    }

    @Override
    public void prepareForBattle() {
        battleStrategy.applyStrategy();
    }


}
