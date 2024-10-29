package v6.gildedrose.strategy;

import v6.gildedrose.model.Item;

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