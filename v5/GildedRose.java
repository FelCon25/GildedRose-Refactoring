package v5;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

import v5.model.Item;
import v5.model.ItemType;
import v5.strategy.AgedBrieStrategy;
import v5.strategy.BackstagePassStrategy;
import v5.strategy.ConjuredItemStrategy;
import v5.strategy.ItemStrategy;
import v5.strategy.RegularItemStrategy;
import v5.strategy.SulfurasStrategy;

public class GildedRose {
    private final Map<ItemType, ItemStrategy> strategies;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
        strategies = new EnumMap<>(ItemType.class);
        initializeStrategies();
    }

    private void initializeStrategies() {
        strategies.put(ItemType.AGED_BRIE, new AgedBrieStrategy());
        strategies.put(ItemType.BACKSTAGE_PASS, new BackstagePassStrategy());
        strategies.put(ItemType.SULFURAS, new SulfurasStrategy());
        strategies.put(ItemType.CONJURED, new ConjuredItemStrategy());
        strategies.put(ItemType.REGULAR, new RegularItemStrategy());
    }

    public void updateQuality() {
        Arrays.stream(items)
              .forEach(item -> {
                  ItemType type = ItemType.fromString(item.name);
                  ItemStrategy strategy = strategies.get(type);
                  strategy.updateQuality(item);
                  validateItemQuality(item);
              });
    }

    private void validateItemQuality(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros") && item.quality > 50) {
            item.quality = 50;
        }
    }
}