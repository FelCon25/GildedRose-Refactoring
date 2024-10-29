package v2;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
        }
    }

    private void updateItemQuality(Item item) {
        switch (item.name) {
            case "Aged Brie":
                updateAgedBrie(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                updateBackstagePasses(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                // Sulfuras never changes
                break;
            default:
                updateRegularItem(item);
                break;
        }

        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn--;
        }

        if (item.sellIn < 0) {
            handleExpiredItem(item);
        }
    }

    private void updateRegularItem(Item item) {
        int degradeRate = item.name.startsWith("Conjured") ? 2 : 1;
        decreaseQuality(item, degradeRate);
    }

    private void updateAgedBrie(Item item) {
        increaseQuality(item);
    }

    private void updateBackstagePasses(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) {
            increaseQuality(item);
        }
        if (item.sellIn < 6) {
            increaseQuality(item);
        }
    }

    private void handleExpiredItem(Item item) {
        switch (item.name) {
            case "Aged Brie":
                increaseQuality(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                item.quality = 0;
                break;
            default:
                int degradeRate = item.name.startsWith("Conjured") ? 2 : 1;
                decreaseQuality(item, degradeRate);
                break;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private void decreaseQuality(Item item, int amount) {
        for (int i = 0; i < amount; i++) {
            if (item.quality > 0) {
                item.quality--;
            }
        }
    }
}