package net.gunpowderplus.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.gunpowderplus.mod.gunpowderPlus;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class GPItems extends Item {
	
	public GPItems() {
		this.setCreativeTab(gunpowderPlus.gunpowderPlusTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(gunpowderPlus.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
