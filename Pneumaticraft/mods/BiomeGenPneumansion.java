package Pneumaticraft.mods;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeEndDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenEnd;

public class BiomeGenPneumansion extends BiomeGenBase {

	public BiomeGenPneumansion(int par1) {
		super(par1);
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.topBlock = (byte)Block.grass.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
        this.theBiomeDecorator = new BiomePneumansionDecorator(this);
	}

}
