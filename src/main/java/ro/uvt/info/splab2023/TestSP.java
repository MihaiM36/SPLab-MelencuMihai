package ro.uvt.info.splab2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class TestSP {


       public static void main(String[] args) {
           SpringApplication.run(TestSP.class, args);

           BattalionFactory factory = new BattalionFactory();


           Battalion gnomeBattalion = factory.createBattalion("gnome", 100, new GnomeBattleStrategy());
           gnomeBattalion.prepareForBattle();


           Battalion elfBattalion = factory.createBattalion("elf", 200, new ElfBattleStrategy());
           elfBattalion.prepareForBattle();


           Battalion entBattalion = new EntBattalionProxy(50, new EntBattleStrategy());
           entBattalion.prepareForBattle();

        }

}