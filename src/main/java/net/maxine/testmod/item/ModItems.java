package net.maxine.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.maxine.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item TEST = registerItems("Test",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for" + TestMod.MOD_ID);
    }

}
