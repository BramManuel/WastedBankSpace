package com.wastedbankspace.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum FancyDressBox implements StorableItem {
    BEEKEEPERS_BOOTS(ItemID.BEEKEEPERS_BOOTS),
    BEEKEEPERS_GLOVES(ItemID.BEEKEEPERS_GLOVES),
    BEEKEEPERS_HAT(ItemID.BEEKEEPERS_HAT),
    BEEKEEPERS_LEGS(ItemID.BEEKEEPERS_LEGS),
    BEEKEEPERS_TOP(ItemID.BEEKEEPERS_TOP),
    FROG_MASK(ItemID.FROG_MASK),

    ROYAL_FROG_LEGGINGS(ItemID.ROYAL_FROG_LEGGINGS),
    ROYAL_FROG_TUNIC(ItemID.ROYAL_FROG_TUNIC),
    ROYAL_FROG_BLOUSE(ItemID.ROYAL_FROG_BLOUSE),
    ROYAL_FROG_SKIRT(ItemID.ROYAL_FROG_SKIRT),
    CAMO_BOTTOMS(ItemID.CAMO_BOTTOMS),
    CAMO_HELMET(ItemID.CAMO_HELMET),
    CAMO_TOP(ItemID.CAMO_TOP),
    LEDERHOSEN_HAT(ItemID.LEDERHOSEN_HAT),
    LEDERHOSEN_SHORTS(ItemID.LEDERHOSEN_SHORTS),
    LEDERHOSEN_TOP(ItemID.LEDERHOSEN_TOP),
    MIME_BOOTS(ItemID.MIME_BOOTS),
    MIME_GLOVES(ItemID.MIME_GLOVES),
    MIME_MASK(ItemID.MIME_MASK),
    MIME_LEGS(ItemID.MIME_LEGS),
    MIME_TOP(ItemID.MIME_TOP),
    SHADE_ROBE(ItemID.SHADE_ROBE),
    SHADE_ROBE_TOP(ItemID.SHADE_ROBE_TOP),
    STALE_BAGUETTE(ItemID.STALE_BAGUETTE),
    ZOMBIE_BOOTS(ItemID.ZOMBIE_BOOTS),
    ZOMBIE_GLOVES(ItemID.ZOMBIE_GLOVES),
    ZOMBIE_MASK(ItemID.ZOMBIE_MASK),
    ZOMBIE_TROUSERS(ItemID.ZOMBIE_TROUSERS),
    ZOMBIE_SHIRT(ItemID.ZOMBIE_SHIRT);

    private final int itemID;
    @Getter
    private final String location = "Fancy Dress Box";

    FancyDressBox(int itemID) {
        this.itemID = itemID;
    }
}
