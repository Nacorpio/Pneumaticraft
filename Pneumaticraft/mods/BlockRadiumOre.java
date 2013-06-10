package Pneumaticraft.mods;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.block.Block;


public class BlockRadiumOre extends Block {


public BlockRadiumOre(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
public void registerIcons(IconRegister par1IconRegister)
{
	 this.blockIcon = par1IconRegister.registerIcon("Pneumaticraft:RadiumOre");
   
   
}
public int idDropped(int par1, Random par2Random, int par3)
{
    return Pneumaticraft.RadiumCrystal.itemID;
}
public int quantityDropped(Random par1Random)
{
    return 2 + par1Random.nextInt(2);
}
}
