package v5.strategy;

import v5.model.Item;

public class AgedBrieStrategy extends RegularItemStrategy {
    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}