package v5.strategy;

import v5.model.Item;

public class SulfurasStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        // Sulfuras never changes
    }
}