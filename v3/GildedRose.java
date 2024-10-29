package v3;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    private final Map<String, ItemStrategy> strategies;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
        strategies = new HashMap<>();
        initializeStrategies();
    }

    private void initializeStrategies() {
        strategies.put("Aged Brie", new AgedBrieStrategy());
        strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassStrategy());
        strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasStrategy());
        strategies.put("Conjured", new ConjuredItemStrategy());
        // Default strategy for regular items
        strategies.put("default", new RegularItemStrategy());
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemStrategy strategy = getStrategy(item);
            strategy.updateQuality(item);
        }
    }

    private ItemStrategy getStrategy(Item item) {
        if (item.name.startsWith("Conjured")) {
            return strategies.get("Conjured");
        }
        return strategies.getOrDefault(item.name, strategies.get("default"));
    }
}