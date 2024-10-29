package v6.gildedrose.strategy;

import v6.gildedrose.model.Item;

public class SulfurasStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        // Sulfuras never changes
    }
}