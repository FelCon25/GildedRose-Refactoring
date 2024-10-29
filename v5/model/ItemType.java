package v5.model;

public enum ItemType {
    AGED_BRIE,
    BACKSTAGE_PASS,
    SULFURAS,
    CONJURED,
    REGULAR;

    public static ItemType fromString(String name) {
        if (name.equals("Aged Brie")) return AGED_BRIE;
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) return BACKSTAGE_PASS;
        if (name.equals("Sulfuras, Hand of Ragnaros")) return SULFURAS;
        if (name.startsWith("Conjured")) return CONJURED;
        return REGULAR;
    }
}