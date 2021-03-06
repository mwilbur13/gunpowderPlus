package net.gunpowderplus.mod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.gunpowderplus.mod.gunpowderPlus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OreBlock extends Block {
	
	public OreBlock(Material material){
		super(material);
		
		this.setHardness(4.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(gunpowderPlus.gunpowderPlusTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(gunpowderPlus.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
