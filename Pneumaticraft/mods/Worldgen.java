package Pneumaticraft.mods;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;



public class Worldgen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case -1 : genNether();
			break;
		case 0  : genWorld(world, random, chunkX*16, chunkZ*16 );
			break;
		case 1  : genEnd();
			break;
		
		
		
		}
		
	}

	private void genEnd() {
		//do nothing
		
		
	}
	
	private void genNether() {
		//do nothing
		
		
	}

	private void genWorld(World world, Random rand, int chunkX, int chunkZ) {
		
		for(int i = 0;i < 10; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);
			
			new WorldGenMinable(Pneumaticraft.BonyteOre.blockID, 3).generate(world, rand, randPosX, randPosY, randPosZ);
			new WorldGenMinable(Pneumaticraft.LithiumOre.blockID, 3).generate(world, rand, randPosX, randPosY, randPosZ);
			new WorldGenMinable(Pneumaticraft.RadiumOre.blockID, 3).generate(world, rand, randPosX, randPosY, randPosZ);
			new WorldGenMinable(Pneumaticraft.RadonOre.blockID, 3).generate(world, rand, randPosX, randPosY, randPosZ);
			new WorldGenMinable(Pneumaticraft.SiliconOre.blockID, 3).generate(world, rand, randPosX, randPosY, randPosZ);
			new WorldGenMinable(Pneumaticraft.XenonOre.blockID, 3).generate(world, rand, randPosX, randPosY, randPosZ);
			
			
		}
	}



}
