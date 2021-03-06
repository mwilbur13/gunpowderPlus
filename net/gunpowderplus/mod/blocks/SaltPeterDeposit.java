package net.gunpowderplus.mod.blocks;

import java.util.Random;

import net.gunpowderplus.mod.gunpowderPlus;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class SaltPeterDeposit extends OreBlock {
	
	public SaltPeterDeposit(Material material){
		super(material);
	}
	
	public Item getItemDropped(int i, Random random, int j){
		return gunpowderPlus.itemSaltPeter;
	}
	
	public int quantityDropped(Random random) {
		return 1 + random.nextInt(2);
	}

}
