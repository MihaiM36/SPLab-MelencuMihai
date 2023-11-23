package ro.uvt.info.splab2023;

public class BattalionFactory {
    public Battalion createBattalion(String type, int size, BattleStrategy battleStrategy) {
        if (type.equals("gnome")) {
            return new GnomeBattalion(size, battleStrategy);
        } else if (type.equals("elf")) {
            return new ElfBattalion(size, battleStrategy);
        } else if (type.equals("ent")) {
            return new EntBattalion(size, battleStrategy);
        } else {
            return null;
        }
    }

}
