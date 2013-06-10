package Pneumaticraft.mods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class BlockSiliconOre extends Block{

	public BlockSiliconOre(int par1, Material par2Material) {
		super(par1, par2Material);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
		 this.blockIcon = par1IconRegister.registerIcon("Pneumaticraft:SiliconOre");
	   
	   
	}
	  public int idDropped(int par1, Random par2Random, int par3)
	    {
	        return Pneumaticraft.Siliconpowder.itemID;
	    }
	  public int quantityDropped(Random par1Random)
	    {
	        return 1 + par1Random.nextInt(2);
	    }
}
