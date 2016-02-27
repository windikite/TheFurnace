package com.windikite.thefurnace;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SlagItem extends Item{
    public SlagItem() {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("slagItem");
    }

}
