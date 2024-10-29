package v5.strategy;

import v5.model.Item;

public class RegularItemStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        decreaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    protected void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    protected void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}