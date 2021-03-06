package net.gunpowderplus.mod;

import net.gunpowderplus.mod.blocks.*;
import net.gunpowderplus.mod.items.GPItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = gunpowderPlus.modid, version = gunpowderPlus.version)
public class gunpowderPlus {

	public static final String modid = "gunpowderPlus";
	public static final String version = "Alpha v0.1";
	
	public static CreativeTabs gunpowderPlusTab;
	
	public static Item itemSulfur;
	public static Item itemSaltPeter;
	
	public static Block blockSulfurDeposit;
	public static Block blockSaltPeterDeposit;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		gunpowderPlusTab = new CreativeTabs("gunpowderPlus") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getItemFromBlock(gunpowderPlus.blockSaltPeterDeposit);
			}
		};
		
		//items registry
		itemSulfur = new GPItems().setUnlocalizedName("Sulfur");
		GameRegistry.registerItem(itemSulfur, "Sulfur");
		itemSaltPeter = new GPItems().setUnlocalizedName("SaltPeter");
		GameRegistry.registerItem(itemSaltPeter, "SaltPeter");
		
		//blocks registry
		blockSulfurDeposit = new SulfurDeposit(Material.rock).setBlockName("SulfurDeposit");
		GameRegistry.registerBlock(blockSulfurDeposit, "SulfurDeposit");
		blockSaltPeterDeposit = new SaltPeterDeposit(Material.rock).setBlockName("SaltPeterDeposit");
		GameRegistry.registerBlock(blockSaltPeterDeposit, "SaltPeterDeposit");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		//Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder), new Object[]{itemSulfur, itemSaltPeter, new ItemStack(Items.coal, 1, 1)});
		
		//smelting
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}
