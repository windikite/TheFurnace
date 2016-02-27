package com.windikite.thefurnace;

import com.windikite.thefurnace.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class TheFurnace {
    @Mod.Instance(Reference.MOD_ID)
    public static TheFurnace instance;
    public static Item slagItem;
    public Block BlockLavaSlag;
    public Fluid lavaSlag = new Fluid("lavaSlag");


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        slagItem = new SlagItem();
        FluidRegistry.registerFluid(lavaSlag);
        BlockLavaSlag = new BlockLavaSlag(lavaSlag, Material.lava).setBlockName("Lava Slag");
        GameRegistry.registerBlock(BlockLavaSlag, Reference.MOD_ID + "_" + BlockLavaSlag.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(slagItem, "Slag");
        lavaSlag.setUnlocalizedName(BlockLavaSlag.getUnlocalizedName());
        lavaSlag.setLuminosity(15);
        lavaSlag.setViscosity(6000);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
