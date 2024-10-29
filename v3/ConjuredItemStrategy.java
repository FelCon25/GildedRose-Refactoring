package v3;

class ConjuredItemStrategy extends RegularItemStrategy {
    @Override
    public void updateQuality(Item item) {
        decreaseQuality(item);
        decreaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            decreaseQuality(item);
            decreaseQuality(item);
        }
    }
}