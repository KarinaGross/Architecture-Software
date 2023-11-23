package Fabric;

import Interface.IGameItem;
import Product.Amethyst;

public class AmethystGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Amethyst();
    }

}
