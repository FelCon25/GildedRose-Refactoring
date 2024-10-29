package v4;

class AgedBrieStrategy extends RegularItemStrategy {
    @Override
    public void updateQuality(Item item) {
        increaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }
}