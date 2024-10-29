package v6.gildedrose;

import v6.gildedrose.strategy.*;
import v6.gildedrose.model.*;
import v6.gildedrose.utils.Logger;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * The main class for the Gilded Rose inventory system.
 */
public class GildedRose {
    private final Map<ItemType, ItemStrategy> strategies;
    private final Logger logger;
    Item[] items;

    /**
     * Constructs a new GildedRose inventory system.
     * 
     * @param items The array of items to manage.
     */
    public GildedRose(Item[] items) {
        this.items = items;
        this.logger = new Logger();
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

    /**
     * Updates the quality of all items in the inventory.
     */
    public void updateQuality() {
        Arrays.stream(items)
                .forEach(item -> {
                    ItemType type = ItemType.fromString(item.name);
                    ItemStrategy strategy = strategies.get(type);
                    strategy.updateQuality(item);
                    validateItemQuality(item);
                    logger.log("Updated item: " + item);
                });
    }

    private void validateItemQuality(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.quality = Math.min(50, Math.max(0, item.quality));
        }
    }
}