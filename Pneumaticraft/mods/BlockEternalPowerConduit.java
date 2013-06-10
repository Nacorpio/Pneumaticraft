package Pneumaticraft.mods;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class BlockEternalPowerConduit extends Block {

   
	public BlockEternalPowerConduit(int par1, Material par2Material)
	{
		super(par1, par2Material);
		
	}
	
	
	public void registerIcons(IconRegister par1IconRegister)
    {
		 this.blockIcon = par1IconRegister.registerIcon("Pneumaticraft:eternalPowerConduit");
       
       
    }
}