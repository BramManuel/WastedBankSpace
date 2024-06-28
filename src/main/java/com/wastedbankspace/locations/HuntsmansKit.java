package com.wastedbankspace.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum HuntsmansKit implements StorableItem {
    BIRD_SNARE(ItemID.BIRD_SNARE),
    NOOSE_WAND(ItemID.NOOSE_WAND),
    BUTTERFLY_NET_(ItemID.BUTTERFLY_NET),
    MAGIC_BUTTERFLY_NET_(ItemID.MAGIC_BUTTERFLY_NET),
    BUTTERFLY_JAR_(ItemID.BUTTERFLY_JAR),
    BOX_TRAP(ItemID.BOX_TRAP),
    RABBIT_SNARE(ItemID.RABBIT_SNARE),
    UNLIT_TORCH(ItemID.UNLIT_TORCH),
    SMALL_FISHING_NET_(ItemID.SMALL_FISHING_NET),
    ROPE(ItemID.ROPE),
    MAGIC_BOX(ItemID.MAGIC_BOX),
    IMPINABOX1(ItemID.IMPINABOX1),
    IMPINABOX2(ItemID.IMPINABOX2),
    TEASING_STICK(ItemID.TEASING_STICK),
    HUNTERS_SPEAR(ItemID.HUNTERS_SPEAR),
    WOOD_CAMO_TOP_(ItemID.WOOD_CAMO_TOP),
    WOOD_CAMO_LEGS_(ItemID.WOOD_CAMO_LEGS),
    POLAR_CAMO_TOP_(ItemID.POLAR_CAMO_TOP),
    POLAR_CAMO_LEGS_(ItemID.POLAR_CAMO_LEGS),
    JUNGLE_CAMO_TOP_(ItemID.JUNGLE_CAMO_TOP),
    JUNGLE_CAMO_LEGS_(ItemID.JUNGLE_CAMO_LEGS),
    DESERT_CAMO_TOP_(ItemID.DESERT_CAMO_TOP),
    DESERT_CAMO_LEGS_(ItemID.DESERT_CAMO_LEGS),
    LARUPIA_HAT_(ItemID.LARUPIA_HAT),
    LARUPIA_TOP_(ItemID.LARUPIA_TOP),
    LARUPIA_LEGS_(ItemID.LARUPIA_LEGS),
    GRAAKH_HEADDRESS(ItemID.GRAAHK_HEADDRESS),
    GRAAKH_TOP(ItemID.GRAAHK_TOP),
    GRAAKH_LEGS(ItemID.GRAAHK_LEGS),
    KYATT_HAT_(ItemID.KYATT_HAT),
    KYATT_TOP_(ItemID.KYATT_TOP),
    KYATT_LEGS_(ItemID.KYATT_LEGS),
    HUNTER_HOOD(ItemID.HUNTER_HOOD),
    HUNTER_CAPE(ItemID.HUNTER_CAPE),
    HUNTER_CAPET(ItemID.HUNTER_CAPET),
    GUILD_HUNTER_HEADWEAR(ItemID.GUILD_HUNTER_HEADWEAR),
    GUILD_HUNTER_TOP(ItemID.GUILD_HUNTER_TOP),
    GUILD_HUNTER_LEGS(ItemID.GUILD_HUNTER_LEGS),
    GUILD_HUNTER_BOOTS(ItemID.GUILD_HUNTER_BOOTS),
    RING_OF_PURSUIT(ItemID.RING_OF_PURSUIT),
    IMPLING_JAR_(ItemID.IMPLING_JAR);

    private final int itemID;
    @Getter
    private final String location = "Huntsman's Kit";

    HuntsmansKit(int itemID) {
        this.itemID = itemID;
    }
}
