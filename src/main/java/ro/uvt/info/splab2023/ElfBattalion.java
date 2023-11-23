package ro.uvt.info.splab2023;

public class ElfBattalion extends Battalion{

    public ElfBattalion(int size, BattleStrategy battleStrategy) {
        super(size, battleStrategy);
    }

    @Override
    public void prepareForBattle() {
        battleStrategy.applyStrategy();
    }


}
