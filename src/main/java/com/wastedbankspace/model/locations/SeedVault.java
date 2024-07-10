package com.wastedbankspace.model.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum SeedVault implements StorableItem {
    // Allotment Seeds
    POTATO_SEED(ItemID.POTATO_SEED),
    ONION_SEED(ItemID.ONION_SEED),
    CABBAGE_SEED(ItemID.CABBAGE_SEED),
    TOMATO_SEED(ItemID.TOMATO_SEED),
    SWEETCORN_SEED(ItemID.SWEETCORN_SEED),
    STRAWBERRY_SEED(ItemID.STRAWBERRY_SEED),
    WATERMELON_SEED(ItemID.WATERMELON_SEED),
    SNAPE_GRASS_SEED(ItemID.SNAPE_GRASS_SEED),

    // Flower Seeds
    MARIGOLD_SEED(ItemID.MARIGOLD_SEED),
    ROSEMARY_SEED(ItemID.ROSEMARY_SEED),
    NASTURTIUM_SEED(ItemID.NASTURTIUM_SEED),
    WOAD_SEED(ItemID.WOAD_SEED),
    LIMPWURT_SEED(ItemID.LIMPWURT_SEED),
    WHITE_LILY_SEED(ItemID.WHITE_LILY_SEED),

    // Herb Seeds
    GUAM_SEED(ItemID.GUAM_SEED),
    MARRENTILL_SEED(ItemID.MARRENTILL_SEED),
    TARROMIN_SEED(ItemID.TARROMIN_SEED),
    HARRALANDER_SEED(ItemID.HARRALANDER_SEED),
    RANARR_SEED(ItemID.RANARR_SEED),
    TOADFLAX_SEED(ItemID.TOADFLAX_SEED),
    IRIT_SEED(ItemID.IRIT_SEED),
    AVANTOE_SEED(ItemID.AVANTOE_SEED),
    KWUARM_SEED(ItemID.KWUARM_SEED),
    SNAPDRAGON_SEED(ItemID.SNAPDRAGON_SEED),
    CADANTINE_SEED(ItemID.CADANTINE_SEED),
    LANTADYME_SEED(ItemID.LANTADYME_SEED),
    DWARF_WEED_SEED(ItemID.DWARF_WEED_SEED),
    TORSTOL_SEED(ItemID.TORSTOL_SEED),

    // Hop Seeds
    BARLEY_SEED(ItemID.BARLEY_SEED),
    HAMMERSTONE_SEED(ItemID.HAMMERSTONE_SEED),
    ASGARNIAN_SEED(ItemID.ASGARNIAN_SEED),
    JUTE_SEED(ItemID.JUTE_SEED),
    YANILLIAN_SEED(ItemID.YANILLIAN_SEED),
    KRANDORIAN_SEED(ItemID.KRANDORIAN_SEED),
    WILDBLOOD_SEED(ItemID.WILDBLOOD_SEED),

    // Bush Seeds
    REDBERRY_SEED(ItemID.REDBERRY_SEED),
    CADAVABERRY_SEED(ItemID.CADAVABERRY_SEED),
    DWELLBERRY_SEED(ItemID.DWELLBERRY_SEED),
    JANGERBERRY_SEED(ItemID.JANGERBERRY_SEED),
    WHITEBERRY_SEED(ItemID.WHITEBERRY_SEED),
    POISON_IVY_SEED(ItemID.POISON_IVY_SEED),

    // Tree Seeds
    ACORN(ItemID.ACORN),
    WILLOW_SEED(ItemID.WILLOW_SEED),
    MAPLE_SEED(ItemID.MAPLE_SEED),
    YEW_SEED(ItemID.YEW_SEED),
    MAGIC_SEED(ItemID.MAGIC_SEED),

    // Fruit Tree Seeds
    APPLE_TREE_SEED(ItemID.APPLE_TREE_SEED),
    BANANA_TREE_SEED(ItemID.BANANA_TREE_SEED),
    ORANGE_TREE_SEED(ItemID.ORANGE_TREE_SEED),
    PINEAPPLE_SEED(ItemID.PINEAPPLE_SEED),
    PAPAYA_TREE_SEED(ItemID.PAPAYA_TREE_SEED),
    PALM_TREE_SEED(ItemID.PALM_TREE_SEED),
    DRAGONFRUIT_TREE_SEED(ItemID.DRAGONFRUIT_TREE_SEED),

    // Special Seeds
    SEAWEED_SPORE(ItemID.SEAWEED_SPORE),
    GRAPE_SEED(ItemID.GRAPE_SEED),
    MUSHROOM_SPORE(ItemID.MUSHROOM_SPORE),
    BELLADONNA_SEED(ItemID.BELLADONNA_SEED),
    HESPORI_SEED(ItemID.HESPORI_SEED),

    // Anima Seeds
    KRONOS_SEED(ItemID.KRONOS_SEED),
    IASOR_SEED(ItemID.IASOR_SEED),
    ATTAS_SEED(ItemID.ATTAS_SEED),

    // Special Trees
    TEAK_SEED(ItemID.TEAK_SEED),
    MAHOGANY_SEED(ItemID.MAHOGANY_SEED),
    CALQUAT_TREE_SEED(ItemID.CALQUAT_TREE_SEED),
    CRYSTAL_ACORN(ItemID.CRYSTAL_ACORN),
    SPIRIT_SEED(ItemID.SPIRIT_SEED),
    CELASTRUS_SEED(ItemID.CELASTRUS_SEED),
    REDWOOD_TREE_SEED(ItemID.REDWOOD_TREE_SEED),

    // Cacti Seeds
    CACTUS_SEED(ItemID.CACTUS_SEED),
    POTATO_CACTUS_SEED(ItemID.POTATO_CACTUS_SEED),

    // Tree Saplings
    OAK_SAPLING(ItemID.OAK_SAPLING),
    WILLOW_SAPLING(ItemID.WILLOW_SAPLING),
    MAPLE_SAPLING(ItemID.MAPLE_SAPLING),
    YEW_SAPLING(ItemID.YEW_SAPLING),
    MAGIC_SAPLING(ItemID.MAGIC_SAPLING),

    // Fruit Tree Saplings
    APPLE_SAPLING(ItemID.APPLE_SAPLING),
    BANANA_SAPLING(ItemID.BANANA_SAPLING),
    ORANGE_SAPLING(ItemID.ORANGE_SAPLING),
    CURRY_SAPLING(ItemID.CURRY_SAPLING),
    PINEAPPLE_SAPLING(ItemID.PINEAPPLE_SAPLING),
    PALM_SAPLING(ItemID.PALM_SAPLING),
    DRAGONFRUIT_SAPLING(ItemID.DRAGONFRUIT_SAPLING),
    TEAK_SAPLING(ItemID.TEAK_SAPLING),
    MAHOGANY_SAPLING(ItemID.MAHOGANY_SAPLING),
    CALQUAT_SAPLING(ItemID.CALQUAT_SAPLING),
    SPIRIT_SAPLING(ItemID.SPIRIT_SAPLING),
    CELASTRUS_SAPLING(ItemID.CELASTRUS_SAPLING),
    REDWOOD_SAPLING(ItemID.REDWOOD_SAPLING);

    private final int itemID;
    @Getter
    private final String location = "Seed vault";

    SeedVault(int itemID) {
        this.itemID = itemID;
    }
}
