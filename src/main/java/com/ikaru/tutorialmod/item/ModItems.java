package com.ikaru.tutorialmod.item;

import com.ikaru.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));





    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod Items for" + TutorialMod.MOD_ID);
    }
}
