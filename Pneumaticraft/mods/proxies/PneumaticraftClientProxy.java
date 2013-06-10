package Pneumaticraft.mods.proxies;

import net.minecraftforge.client.MinecraftForgeClient;
import Pneumaticraft.mods.Pneumaticraft;
import Pneumaticraft.mods.TileEntityEternalPowerSource;
import Pneumaticraft.mods.Rendering.ItemEternalPowerSourceRenderer;
import Pneumaticraft.mods.Rendering.TileEntityEternalPowerSourceRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;



public class PneumaticraftClientProxy extends PneumaticraftCommonProxy{
	@Override
	public void InitRendering()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEternalPowerSource.class, new TileEntityEternalPowerSourceRenderer());
		
		MinecraftForgeClient.registerItemRenderer(Pneumaticraft.eternalPowerSource.blockID, new ItemEternalPowerSourceRenderer());
	}
}
