package v6.gildedrose.model;

/**
 * Represents an item in the Gilded Rose inventory.
 */
public class Item {
    public String name;
    public int sellIn;
    public int quality;

    /**
     * Constructs a new Item.
     * 
     * @param name    The name of the item.
     * @param sellIn  The number of days to sell the item.
     * @param quality The quality of the item.
     * @throws IllegalArgumentException if quality is outside the valid range.
     */
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        if (quality < 0 || (quality > 50 && !name.equals("Sulfuras, Hand of Ragnaros"))) {
            throw new IllegalArgumentException("Quality must be between 0 and 50, except for Sulfuras");
        }
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}