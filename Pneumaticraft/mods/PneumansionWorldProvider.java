package Pneumaticraft.mods;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;

public class PneumansionWorldProvider extends WorldProvider
{
 public void registerWorldChunkManager()
 {
  this.worldChunkMgr = new WorldChunkManagerHell(Pneumaticraft.pneumansionBiome, 0.8F, 0.1F);
  this.dimensionId = Pneumaticraft.dimension;
 }
 
 public String getDimensionName() 
 {
  return "Pneumansion";
 }
 
 public boolean canRespawnHere()
 {
  return true;
 }
 
 @Override
 public IChunkProvider createChunkGenerator()
 {
  return new ChunkProviderPneumansion(worldObj, worldObj.getSeed());
 }
 @Override
 public ChunkCoordinates getEntrancePortalLocation()
 {
     return new ChunkCoordinates(50, 65, 0);
     
 }
 public int getAverageGroundLevel()
 {
     return 50;
 }
 public boolean canCoordinateBeSpawn(int par1, int par2)
 {
     int k = this.worldObj.getFirstUncoveredBlock(par1, par2);
     return k == Block.grass.blockID;
 }

}