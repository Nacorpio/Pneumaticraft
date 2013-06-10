package Pneumaticraft.mods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;



public class BlockEternalPowerSource extends Block  {

	public BlockEternalPowerSource(int id, Material mat) 
	{
		super(id, mat);
	}
	 public int quantityDropped(Random par1Random)
	    {
	        return 0;
	    }
		@Override
		public boolean hasTileEntity(int metadata)
		{
			return true;
		}
		@Override
		public boolean isOpaqueCube()
		{
			return false;
		}
		@Override
		public TileEntity createTileEntity(World world, int metadata)
		{
			return new TileEntityEternalPowerSource();
		}
		
		@Override
		public int getRenderType()
		{
			return -1;
		}
	public boolean renderAsNormalBlock(){
		return false;
	}
	public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
    {
        byte b0 = 0;
        byte b1 = 0;

        if (par1World.getBlockId(par2 - 1, par3, par4) == Pneumaticraft.eternalPowerConduit.blockID || par1World.getBlockId(par2 + 1, par3, par4) == Pneumaticraft.eternalPowerConduit.blockID)
        {
            b0 = 1;
        }

        if (par1World.getBlockId(par2, par3, par4 - 1) == Pneumaticraft.eternalPowerConduit.blockID || par1World.getBlockId(par2, par3, par4 + 1) == Pneumaticraft.eternalPowerConduit.blockID)
        {
            b1 = 1;
        }

        if (b0 == b1)
        {
            return false;
        }
        else
        {
            if (par1World.getBlockId(par2 - b0, par3, par4 - b1) == 0)
            {
                par2 -= b0;
                par4 -= b1;
            }

            int l;
            int i1;

            for (l = -1; l <= 2; ++l)
            {
                for (i1 = -1; i1 <= 3; ++i1)
                {
                    boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;

                    if (l != -1 && l != 2 || i1 != -1 && i1 != 3)
                    {
                        int j1 = par1World.getBlockId(par2 + b0 * l, par3 + i1, par4 + b1 * l);

                        if (flag)
                        {
                            if (j1 != Pneumaticraft.eternalPowerConduit.blockID)
                            {
                                return false;
                            }
                        }
                        else if (j1 != 0 && j1 != Pneumaticraft.eternalPowerSource.blockID)
                        {
                            return false;
                        }
                    }
                }
            }

            for (l = 0; l < 2; ++l)
            {
                for (i1 = 0; i1 < 3; ++i1)
                {
                    par1World.setBlock(par2 + b0 * l, par3 + i1, par4 + b1 * l, Pneumaticraft.pneumansionPortal.blockID, 0, 2);
                }
            }

            return true;
        }
    }
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        if ( par1World.getBlockId(par2, par3 - 1, par4) != Pneumaticraft.eternalPowerConduit.blockID || !tryToCreatePortal(par1World, par2, par3, par4))
        {
        	
        }
       
}
}
