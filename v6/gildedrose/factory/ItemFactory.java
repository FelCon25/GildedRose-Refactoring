package v6.gildedrose.factory;

import v6.gildedrose.model.Item;

/**
 * Factory class for creating items.
 */
public class ItemFactory {
    public static Item createItem(String name, int sellIn, int quality) {
        return new Item(name, sellIn, quality);
    }

    public static Item createAgedBrie(int sellIn, int quality) {
        return new Item("Aged Brie", sellIn, quality);
    }

    public static Item createBackstagePass(int sellIn, int quality) {
        return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static Item createSulfuras(int sellIn) {
        return new Item("Sulfuras, Hand of Ragnaros", sellIn, 80);
    }

    public static Item createConjuredItem(String name, int sellIn, int quality) {
        return new Item("Conjured " + name, sellIn, quality);
    }
}