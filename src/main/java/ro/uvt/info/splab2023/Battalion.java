package ro.uvt.info.splab2023;

abstract class Battalion {


    protected int size;
    protected BattleStrategy battleStrategy;

    public Battalion(int size, BattleStrategy battleStrategy) {
        this.size = size;
        this.battleStrategy = battleStrategy;
    }

    public abstract void prepareForBattle();


}
