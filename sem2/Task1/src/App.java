import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.AmethystGenerator;
import Fabric.DiamondGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.IronGenerator;
import Fabric.ItemGenerator;
import Fabric.RubinGenerator;
import Fabric.SilverGenerator;

public class App {
    public static void main(String[] args) {

        // Генерируем список генераторов
        List<ItemGenerator> generators = initFabrics();

        // Создаем рандомайзер
        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }

    }

    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();

        fabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            fabrics.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            fabrics.add(new AmethystGenerator());
            fabrics.add(new DiamondGenerator());
            fabrics.add(new IronGenerator());
            fabrics.add(new RubinGenerator());
            fabrics.add(new SilverGenerator());
        }

        return fabrics;
    }
}
