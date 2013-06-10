package Pneumaticraft.mods;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomePneumansionDecorator extends BiomeDecorator {

	public BiomePneumansionDecorator(BiomeGenBase par1BiomeGenBase) {
		super(par1BiomeGenBase);
		
	}
	 protected void decorate()
	    {
	        this.generateOres();

	        if (this.randomGenerator.nextInt(5) == 0)
	        {
	            int i = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
	            int j = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
	            int k = this.currentWorld.getTopSolidOrLiquidBlock(i, j);

	            if (k > 0)
	            {
	                ;
	            }

	         
	        }

	      
	    }
}
