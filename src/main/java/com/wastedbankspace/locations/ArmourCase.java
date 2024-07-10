package com.wastedbankspace.locations;

import com.wastedbankspace.model.StorableItem;
import lombok.Getter;
import net.runelite.api.ItemID;

@Getter
public enum ArmourCase implements StorableItem {
    ADVENTURERS_HOOD_T1(ItemID.ADVENTURERS_HOOD_T1),
    ADVENTURERS_TOP_T1(ItemID.ADVENTURERS_TOP_T1),
    ADVENTURERS_TROUSERS_T1(ItemID.ADVENTURERS_TROUSERS_T1),
    ADVENTURERS_BOOTS_T1(ItemID.ADVENTURERS_BOOTS_T1),
    ADVENTURERS_HOOD_T2(ItemID.ADVENTURERS_HOOD_T2),
    ADVENTURERS_TOP_T2(ItemID.ADVENTURERS_TOP_T2),
    ADVENTURERS_TROUSERS_T2(ItemID.ADVENTURERS_TROUSERS_T2),
    ADVENTURERS_BOOTS_T2(ItemID.ADVENTURERS_BOOTS_T2),
    ADVENTURERS_HOOD_T3(ItemID.ADVENTURERS_HOOD_T3),
    ADVENTURERS_TOP_T3(ItemID.ADVENTURERS_TOP_T3),
    ADVENTURERS_TROUSERS_T3(ItemID.ADVENTURERS_TROUSERS_T3),
    ADVENTURERS_BOOTS_T3(ItemID.ADVENTURERS_BOOTS_T3),
    // Angler outfit is storable in the tackle box
    // Spirit angler outfit is storable in the tackle box
    ARDOUGNE_KNIGHT_HELM(ItemID.ARDOUGNE_KNIGHT_HELM),
    ARDOUGNE_KNIGHT_PLATEBODY(ItemID.ARDOUGNE_KNIGHT_PLATEBODY),
    ARDOUGNE_KNIGHT_PLATELEGS(ItemID.ARDOUGNE_KNIGHT_PLATELEGS),
    BOMBER_CAP(ItemID.BOMBER_CAP),
    CAP_AND_GOGGLES(ItemID.CAP_AND_GOGGLES),
    BOMBER_JACKET(ItemID.BOMBER_JACKET),
    HARD_HAT(ItemID.HARD_HAT),
    BUILDERS_SHIRT(ItemID.BUILDERS_SHIRT),
    BUILDERS_TROUSERS(ItemID.BUILDERS_TROUSERS),
    BUILDERS_BOOTS(ItemID.BUILDERS_BOOTS),
    DESERT_CAMO_TOP(ItemID.DESERT_CAMO_TOP),
    DESERT_CAMO_LEGS(ItemID.DESERT_CAMO_LEGS),
    JUNGLE_CAMO_TOP(ItemID.JUNGLE_CAMO_TOP),
    JUNGLE_CAMO_LEGS(ItemID.JUNGLE_CAMO_LEGS),
    POLAR_CAMO_TOP(ItemID.POLAR_CAMO_TOP),
    POLAR_CAMO_LEGS(ItemID.POLAR_CAMO_LEGS),
    WOOD_CAMO_TOP(ItemID.WOOD_CAMO_TOP),
    WOOD_CAMO_LEGS(ItemID.WOOD_CAMO_LEGS),
    SHATTERED_CANE(ItemID.SHATTERED_CANE),
    TRAILBLAZER_CANE(ItemID.TRAILBLAZER_CANE),
    TWISTED_CANE(ItemID.TWISTED_CANE),
    // Castle Wars armour (1)
    DECORATIVE_HELM(ItemID.DECORATIVE_HELM),
    DECORATIVE_FULL_HELM(ItemID.DECORATIVE_FULL_HELM),
    DECORATIVE_ARMOUR(ItemID.DECORATIVE_ARMOUR),
    DECORATIVE_ARMOUR_4070(ItemID.DECORATIVE_ARMOUR_4070),
    DECORATIVE_ARMOUR_11893(ItemID.DECORATIVE_ARMOUR_11893),
    DECORATIVE_SHIELD(ItemID.DECORATIVE_SHIELD),
    DECORATIVE_BOOTS(ItemID.DECORATIVE_BOOTS),
    // Castle Wars armour (2)
    DECORATIVE_HELM_4506(ItemID.DECORATIVE_HELM_4506),
    DECORATIVE_FULL_HELM_25169(ItemID.DECORATIVE_FULL_HELM_25169),
    DECORATIVE_ARMOUR_4504(ItemID.DECORATIVE_ARMOUR_4504),
    DECORATIVE_ARMOUR_4505(ItemID.DECORATIVE_ARMOUR_4505),
    DECORATIVE_ARMOUR_11894(ItemID.DECORATIVE_ARMOUR_11894),
    DECORATIVE_SHIELD_4507(ItemID.DECORATIVE_SHIELD_4507),
    DECORATIVE_BOOTS_25167(ItemID.DECORATIVE_BOOTS_25167),
    // Castle Wars armour (3)
    DECORATIVE_HELM_4511(ItemID.DECORATIVE_HELM_4511),
    DECORATIVE_FULL_HELM_25174(ItemID.DECORATIVE_FULL_HELM_25174),
    DECORATIVE_ARMOUR_4509(ItemID.DECORATIVE_ARMOUR_4509),
    DECORATIVE_ARMOUR_4510(ItemID.DECORATIVE_ARMOUR_4510),
    DECORATIVE_ARMOUR_11895(ItemID.DECORATIVE_ARMOUR_11895),
    DECORATIVE_SHIELD_4512(ItemID.DECORATIVE_SHIELD_4512),
    DECORATIVE_BOOTS_25171(ItemID.DECORATIVE_BOOTS_25171),
    // Castle Wars sword (1)
    DECORATIVE_SWORD(ItemID.DECORATIVE_SWORD),
    // Castle Wars sword (2)
    DECORATIVE_SWORD_4503(ItemID.DECORATIVE_SWORD_4503),
    // Castle Wars sword (3)
    DECORATIVE_SWORD_4508(ItemID.DECORATIVE_SWORD_4508),
    // Castle Wars mage armour
    DECORATIVE_ARMOUR_11896(ItemID.DECORATIVE_ARMOUR_11896),
    DECORATIVE_ARMOUR_MAGIC_LEGS(ItemID.DECORATIVE_ARMOUR_11897),
    DECORATIVE_ARMOUR_11898(ItemID.DECORATIVE_ARMOUR_11898),
    // Castle Wars ranger armour
    DECORATIVE_ARMOUR_11899(ItemID.DECORATIVE_ARMOUR_11899),
    DECORATIVE_ARMOUR_11900(ItemID.DECORATIVE_ARMOUR_11900),
    DECORATIVE_ARMOUR_11901(ItemID.DECORATIVE_ARMOUR_11901),
    CLUE_HUNTER_GARB(ItemID.CLUE_HUNTER_GARB),
    CLUE_HUNTER_TROUSERS(ItemID.CLUE_HUNTER_TROUSERS),
    CLUE_HUNTER_GLOVES(ItemID.CLUE_HUNTER_GLOVES),
    CLUE_HUNTER_BOOTS(ItemID.CLUE_HUNTER_BOOTS),
    CLUE_HUNTER_CLOAK(ItemID.CLUE_HUNTER_CLOAK),
    CORRUPTED_HELM(ItemID.CORRUPTED_HELM),
    CORRUPTED_PLATEBODY(ItemID.CORRUPTED_PLATEBODY),
    CORRUPTED_PLATELEGS(ItemID.CORRUPTED_PLATELEGS),
    CORRUPTED_PLATESKIRT(ItemID.CORRUPTED_PLATESKIRT),
    CORRUPTED_KITESHIELD(ItemID.CORRUPTED_KITESHIELD),
    DEADMANS_CHEST(ItemID.DEADMANS_CHEST),
    DEADMANS_LEGS(ItemID.DEADMANS_LEGS),
    DEADMANS_CAPE(ItemID.DEADMANS_CAPE),
    DRAGONSTONE_FULL_HELM(ItemID.DRAGONSTONE_FULL_HELM),
    DRAGONSTONE_PLATEBODY(ItemID.DRAGONSTONE_PLATEBODY),
    DRAGONSTONE_PLATELEGS(ItemID.DRAGONSTONE_PLATELEGS),
    DRAGONSTONE_BOOTS(ItemID.DRAGONSTONE_BOOTS),
    DRAGONSTONE_GAUNTLETS(ItemID.DRAGONSTONE_GAUNTLETS),
    FARMERS_STRAWHAT(ItemID.FARMERS_STRAWHAT),
    FARMERS_JACKET(ItemID.FARMERS_JACKET),
    FARMERS_SHIRT(ItemID.FARMERS_SHIRT),
    FARMERS_BORO_TROUSERS(ItemID.FARMERS_BORO_TROUSERS),
    FARMERS_BOOTS(ItemID.FARMERS_BOOTS),
    FEDORA(ItemID.FEDORA),
    GIANT_STOPWATCH(ItemID.GIANT_STOPWATCH),
    HAM_HOOD(ItemID.HAM_HOOD),
    HAM_SHIRT(ItemID.HAM_SHIRT),
    HAM_ROBE(ItemID.HAM_ROBE),
    HAM_GLOVES(ItemID.HAM_GLOVES),
    HAM_BOOTS(ItemID.HAM_BOOTS),
    HAM_CLOAK(ItemID.HAM_CLOAK),
    HAM_LOGO(ItemID.HAM_LOGO),
    ANCIENT_HALO(ItemID.ANCIENT_HALO),
    ARMADYL_HALO(ItemID.ARMADYL_HALO),
    BANDOS_HALO(ItemID.BANDOS_HALO),
    BRASSICA_HALO(ItemID.BRASSICA_HALO),
    GUTHIX_HALO(ItemID.GUTHIX_HALO),
    SARADOMIN_HALO(ItemID.SARADOMIN_HALO),
    SEREN_HALO(ItemID.SEREN_HALO),
    ZAMORAK_HALO(ItemID.ZAMORAK_HALO),
    HELM_OF_RAEDWALD(ItemID.HELM_OF_RAEDWALD),
    GRAAHK_HEADDRESS(ItemID.GRAAHK_HEADDRESS),
    GRAAHK_TOP(ItemID.GRAAHK_TOP),
    GRAAHK_LEGS(ItemID.GRAAHK_LEGS),
    KYATT_HAT(ItemID.KYATT_HAT),
    KYATT_TOP(ItemID.KYATT_TOP),
    KYATT_LEGS(ItemID.KYATT_LEGS),
    LARUPIA_HAT(ItemID.LARUPIA_HAT),
    LARUPIA_TOP(ItemID.LARUPIA_TOP),
    LARUPIA_LEGS(ItemID.LARUPIA_LEGS),
    INQUISITORS_GREAT_HELM(ItemID.INQUISITORS_GREAT_HELM),
    INQUISITORS_HAUBERK(ItemID.INQUISITORS_HAUBERK),
    INQUISITORS_PLATESKIRT(ItemID.INQUISITORS_PLATESKIRT),
    JUSTICIAR_FACEGUARD(ItemID.JUSTICIAR_FACEGUARD),
    JUSTICIAR_CHESTGUARD(ItemID.JUSTICIAR_CHESTGUARD),
    JUSTICIAR_LEGGUARDS(ItemID.JUSTICIAR_LEGGUARDS),
    LUMBERJACK_HAT_AC(ItemID.LUMBERJACK_HAT),
    LUMBERJACK_TOP_AC(ItemID.LUMBERJACK_TOP),
    LUMBERJACK_LEGS_AC(ItemID.LUMBERJACK_LEGS),
    LUMBERJACK_BOOTS_AC(ItemID.LUMBERJACK_BOOTS),
    MASORI_MASK(ItemID.MASORI_MASK),
    MASORI_BODY(ItemID.MASORI_BODY),
    MASORI_CHAPS(ItemID.MASORI_CHAPS),
    MASORI_MASK_F(ItemID.MASORI_MASK_F),
    MASORI_BODY_F(ItemID.MASORI_BODY_F),
    MASORI_CHAPS_F(ItemID.MASORI_CHAPS_F),
    MINING_GLOVES(ItemID.MINING_GLOVES),
    SUPERIOR_MINING_GLOVES(ItemID.SUPERIOR_MINING_GLOVES),
    EXPERT_MINING_GLOVES(ItemID.EXPERT_MINING_GLOVES),
    MIXED_HIDE_TOP(ItemID.MIXED_HIDE_TOP),
    MIXED_HIDE_LEGS(ItemID.MIXED_HIDE_LEGS),
    MIXED_HIDE_BOOTS(ItemID.MIXED_HIDE_BOOTS),
    MIXED_HIDE_CAPE(ItemID.MIXED_HIDE_CAPE),
    GAS_MASK(ItemID.GAS_MASK),
    MOURNER_TOP(ItemID.MOURNER_TOP),
    MOURNER_TROUSERS(ItemID.MOURNER_TROUSERS),
    MOURNER_BOOTS(ItemID.MOURNER_BOOTS),
    MOURNER_GLOVES(ItemID.MOURNER_GLOVES),
    MOURNER_CLOAK(ItemID.MOURNER_CLOAK),
    OBSIDIAN_HELMET(ItemID.OBSIDIAN_HELMET),
    OBSIDIAN_PLATEBODY(ItemID.OBSIDIAN_PLATEBODY),
    OBSIDIAN_PLATELEGS(ItemID.OBSIDIAN_PLATELEGS),
    ORNATE_HELM(ItemID.ORNATE_HELM),
    ORNATE_TOP(ItemID.ORNATE_TOP),
    ORNATE_LEGS(ItemID.ORNATE_LEGS),
    ORNATE_GLOVES(ItemID.ORNATE_GLOVES),
    ORNATE_BOOTS(ItemID.ORNATE_BOOTS),
    ORNATE_CAPE(ItemID.ORNATE_CAPE),
    FIGHTER_HAT(ItemID.FIGHTER_HAT),
    FIGHTER_TORSO(ItemID.FIGHTER_TORSO),
    PENANCE_GLOVES(ItemID.PENANCE_GLOVES),
    HEALER_HAT(ItemID.HEALER_HAT),
    RANGER_HAT(ItemID.RANGER_HAT),
    RUNNER_BOOTS(ItemID.RUNNER_BOOTS),
    RUNNER_HAT(ItemID.RUNNER_HAT),
    PENANCE_SKIRT(ItemID.PENANCE_SKIRT),
    PROSPECTOR_HELMET(ItemID.PROSPECTOR_HELMET),
    PROSPECTOR_JACKET(ItemID.PROSPECTOR_JACKET),
    PROSPECTOR_LEGS(ItemID.PROSPECTOR_LEGS),
    PROSPECTOR_BOOTS(ItemID.PROSPECTOR_BOOTS),
    GOLDEN_PROSPECTOR_HELMET(ItemID.GOLDEN_PROSPECTOR_HELMET),
    GOLDEN_PROSPECTOR_JACKET(ItemID.GOLDEN_PROSPECTOR_JACKET),
    GOLDEN_PROSPECTOR_LEGS(ItemID.GOLDEN_PROSPECTOR_LEGS),
    GOLDEN_PROSPECTOR_BOOTS(ItemID.GOLDEN_PROSPECTOR_BOOTS),
    ROCKSHELL_HELM(ItemID.ROCKSHELL_HELM),
    ROCKSHELL_PLATE(ItemID.ROCKSHELL_PLATE),
    ROCKSHELL_LEGS(ItemID.ROCKSHELL_LEGS),
    ROCKSHELL_GLOVES(ItemID.ROCKSHELL_GLOVES),
    ROCKSHELL_BOOTS(ItemID.ROCKSHELL_BOOTS),
    ROGUE_MASK(ItemID.ROGUE_MASK),
    ROGUE_TOP(ItemID.ROGUE_TOP),
    ROGUE_GLOVES(ItemID.ROGUE_GLOVES),
    ROGUE_TROUSERS(ItemID.ROGUE_TROUSERS),
    ROGUE_BOOTS(ItemID.ROGUE_BOOTS),
    SHATTERED_HOOD_T1(ItemID.SHATTERED_HOOD_T1),
    SHATTERED_TOP_T1(ItemID.SHATTERED_TOP_T1),
    SHATTERED_TROUSERS_T1(ItemID.SHATTERED_TROUSERS_T1),
    SHATTERED_BOOTS_T1(ItemID.SHATTERED_BOOTS_T1),
    SHATTERED_HOOD_T2(ItemID.SHATTERED_HOOD_T2),
    SHATTERED_TOP_T2(ItemID.SHATTERED_TOP_T2),
    SHATTERED_TROUSERS_T2(ItemID.SHATTERED_TROUSERS_T2),
    SHATTERED_BOOTS_T2(ItemID.SHATTERED_BOOTS_T2),
    SHATTERED_HOOD_T3(ItemID.SHATTERED_HOOD_T3),
    SHATTERED_TOP_T3(ItemID.SHATTERED_TOP_T3),
    SHATTERED_TROUSERS_T3(ItemID.SHATTERED_TROUSERS_T3),
    SHATTERED_BOOTS_T3(ItemID.SHATTERED_BOOTS_T3),
    SHAYZIEN_HELM_1(ItemID.SHAYZIEN_HELM_1),
    SHAYZIEN_PLATEBODY_1(ItemID.SHAYZIEN_PLATEBODY_1),
    SHAYZIEN_GREAVES_1(ItemID.SHAYZIEN_GREAVES_1),
    SHAYZIEN_GLOVES_1(ItemID.SHAYZIEN_GLOVES_1),
    SHAYZIEN_BOOTS_1(ItemID.SHAYZIEN_BOOTS_1),
    SHAYZIEN_HELM_2(ItemID.SHAYZIEN_HELM_2),
    SHAYZIEN_PLATEBODY_2(ItemID.SHAYZIEN_PLATEBODY_2),
    SHAYZIEN_GREAVES_2(ItemID.SHAYZIEN_GREAVES_2),
    SHAYZIEN_GLOVES_2(ItemID.SHAYZIEN_GLOVES_2),
    SHAYZIEN_BOOTS_2(ItemID.SHAYZIEN_BOOTS_2),
    SHAYZIEN_HELM_3(ItemID.SHAYZIEN_HELM_3),
    SHAYZIEN_PLATEBODY_3(ItemID.SHAYZIEN_PLATEBODY_3),
    SHAYZIEN_GREAVES_3(ItemID.SHAYZIEN_GREAVES_3),
    SHAYZIEN_GLOVES_3(ItemID.SHAYZIEN_GLOVES_3),
    SHAYZIEN_BOOTS_3(ItemID.SHAYZIEN_BOOTS_3),
    SHAYZIEN_HELM_4(ItemID.SHAYZIEN_HELM_4),
    SHAYZIEN_PLATEBODY_4(ItemID.SHAYZIEN_PLATEBODY_4),
    SHAYZIEN_GREAVES_4(ItemID.SHAYZIEN_GREAVES_4),
    SHAYZIEN_GLOVES_4(ItemID.SHAYZIEN_GLOVES_4),
    SHAYZIEN_BOOTS_4(ItemID.SHAYZIEN_BOOTS_4),
    SHAYZIEN_HELM_5(ItemID.SHAYZIEN_HELM_5),
    SHAYZIEN_PLATEBODY_5(ItemID.SHAYZIEN_BODY_5),
    SHAYZIEN_GREAVES_5(ItemID.SHAYZIEN_GREAVES_5),
    SHAYZIEN_GLOVES_5(ItemID.SHAYZIEN_GLOVES_5),
    SHAYZIEN_BOOTS_5(ItemID.SHAYZIEN_BOOTS_5),
    SNAKESKIN_BANDANA(ItemID.SNAKESKIN_BANDANA),
    SNAKESKIN_BODY(ItemID.SNAKESKIN_BODY),
    SNAKESKIN_BOOTS(ItemID.SNAKESKIN_BOOTS),
    SNAKESKIN_CHAPS(ItemID.SNAKESKIN_CHAPS),
    SNAKESKIN_VAMBRACES(ItemID.SNAKESKIN_VAMBRACES),
    SPINED_HELM(ItemID.SPINED_HELM),
    SPINED_BODY(ItemID.SPINED_BODY),
    SPINED_CHAPS(ItemID.SPINED_CHAPS),
    SPINED_GLOVES(ItemID.SPINED_GLOVES),
    SPINED_BOOTS(ItemID.SPINED_BOOTS),
    FANCY_BOOTS(ItemID.FANCY_BOOTS),
    FIGHTING_BOOTS(ItemID.FIGHTING_BOOTS),
    FANCIER_BOOTS(ItemID.FANCIER_BOOTS),
    SUNFIRE_FANATIC_HELM(ItemID.SUNFIRE_FANATIC_HELM),
    SUNFIRE_FANATIC_CUIRASS(ItemID.SUNFIRE_FANATIC_CUIRASS),
    SUNFIRE_FANATIC_CHAUSSES(ItemID.SUNFIRE_FANATIC_CHAUSSES),
    SWIFT_BLADE(ItemID.SWIFT_BLADE),
    INITIATE_SALLET(ItemID.INITIATE_SALLET),
    INITIATE_HAUBERK(ItemID.INITIATE_HAUBERK),
    INITIATE_CUISSE(ItemID.INITIATE_CUISSE),
    PROSELYTE_SALLET(ItemID.PROSELYTE_SALLET),
    PROSELYTE_HAUBERK(ItemID.PROSELYTE_HAUBERK),
    PROSELYTE_CUISSE(ItemID.PROSELYTE_CUISSE),
    TRAILBLAZER_HOOD_T1(ItemID.TRAILBLAZER_HOOD_T1),
    TRAILBLAZER_TOP_T1(ItemID.TRAILBLAZER_TOP_T1),
    TRAILBLAZER_TROUSERS_T1(ItemID.TRAILBLAZER_TROUSERS_T1),
    TRAILBLAZER_BOOTS_T1(ItemID.TRAILBLAZER_BOOTS_T1),
    TRAILBLAZER_HOOD_T2(ItemID.TRAILBLAZER_HOOD_T2),
    TRAILBLAZER_TOP_T2(ItemID.TRAILBLAZER_TOP_T2),
    TRAILBLAZER_TROUSERS_T2(ItemID.TRAILBLAZER_TROUSERS_T2),
    TRAILBLAZER_BOOTS_T2(ItemID.TRAILBLAZER_BOOTS_T2),
    TRAILBLAZER_HOOD_T3(ItemID.TRAILBLAZER_HOOD_T3),
    TRAILBLAZER_TOP_T3(ItemID.TRAILBLAZER_TOP_T3),
    TRAILBLAZER_TROUSERS_T3(ItemID.TRAILBLAZER_TROUSERS_T3),
    TRAILBLAZER_BOOTS_T3(ItemID.TRAILBLAZER_BOOTS_T3),
    TRIBAL_MASK(ItemID.TRIBAL_MASK),
    TRIBAL_MASK_6337(ItemID.TRIBAL_MASK_6337),
    TRIBAL_MASK_6339(ItemID.TRIBAL_MASK_6339),
    TWISTED_HAT_T1(ItemID.TWISTED_HAT_T1),
    TWISTED_COAT_T1(ItemID.TWISTED_COAT_T1),
    TWISTED_TROUSERS_T1(ItemID.TWISTED_TROUSERS_T1),
    TWISTED_BOOTS_T1(ItemID.TWISTED_BOOTS_T1),
    TWISTED_HAT_T2(ItemID.TWISTED_HAT_T2),
    TWISTED_COAT_T2(ItemID.TWISTED_COAT_T2),
    TWISTED_TROUSERS_T2(ItemID.TWISTED_TROUSERS_T2),
    TWISTED_BOOTS_T2(ItemID.TWISTED_BOOTS_T2),
    TWISTED_HAT_T3(ItemID.TWISTED_HAT_T3),
    TWISTED_COAT_T3(ItemID.TWISTED_COAT_T3),
    TWISTED_TROUSERS_T3(ItemID.TWISTED_TROUSERS_T3),
    TWISTED_BOOTS_T3(ItemID.TWISTED_BOOTS_T3),
    VOID_KNIGHT_TOP(ItemID.VOID_KNIGHT_TOP),
    VOID_KNIGHT_ROBE(ItemID.VOID_KNIGHT_ROBE),
    VOID_KNIGHT_GLOVES(ItemID.VOID_KNIGHT_GLOVES),
    VOID_KNIGHT_TOP_OR(ItemID.VOID_KNIGHT_TOP_OR),
    VOID_KNIGHT_ROBE_OR(ItemID.VOID_KNIGHT_ROBE_OR),
    VOID_KNIGHT_GLOVES_OR(ItemID.VOID_KNIGHT_GLOVES_OR),
    ELITE_VOID_TOP(ItemID.ELITE_VOID_TOP),
    ELITE_VOID_ROBE(ItemID.ELITE_VOID_ROBE),
    ELITE_VOID_TOP_OR(ItemID.ELITE_VOID_TOP_OR),
    ELITE_VOID_ROBE_OR(ItemID.ELITE_VOID_ROBE_OR),
    VOID_MAGE_HELM(ItemID.VOID_MAGE_HELM),
    VOID_MAGE_HELM_OR(ItemID.VOID_MAGE_HELM_OR),
    VOID_MELEE_HELM(ItemID.VOID_MELEE_HELM),
    VOID_MELEE_HELM_OR(ItemID.VOID_MELEE_HELM_OR),
    VOID_RANGER_HELM(ItemID.VOID_RANGER_HELM),
    VOID_RANGER_HELM_OR(ItemID.VOID_RANGER_HELM_OR),
    VYRE_NOBLE_TOP(ItemID.VYRE_NOBLE_TOP),
    VYRE_NOBLE_LEGS(ItemID.VYRE_NOBLE_LEGS),
    VYRE_NOBLE_SHOES(ItemID.VYRE_NOBLE_SHOES),
    WHITE_FULL_HELM(ItemID.WHITE_FULL_HELM),
    WHITE_PLATEBODY(ItemID.WHITE_PLATEBODY),
    WHITE_PLATESKIRT(ItemID.WHITE_PLATESKIRT),
    WHITE_PLATELEGS(ItemID.WHITE_PLATELEGS),
    WHITE_GLOVES(ItemID.WHITE_GLOVES),
    WHITE_BOOTS(ItemID.WHITE_BOOTS),
    WHITE_KITESHIELD(ItemID.WHITE_KITESHIELD),
    XERICIAN_HAT(ItemID.XERICIAN_HAT),
    XERICIAN_TOP(ItemID.XERICIAN_TOP),
    XERICIAN_ROBE(ItemID.XERICIAN_ROBE);

    private final int itemID;
    @Getter
    private final String location = "Amour Case";

    ArmourCase(int itemID) {
        this.itemID = itemID;
    }
}
