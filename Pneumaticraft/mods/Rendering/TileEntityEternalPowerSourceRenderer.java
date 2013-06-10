package Pneumaticraft.mods.Rendering;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import Pneumaticraft.mods.TileEntityEternalPowerSource;



public class TileEntityEternalPowerSourceRenderer extends TileEntitySpecialRenderer
{
	private ModelEternalPowerSource ModelEternalPowerSource = new ModelEternalPowerSource();
	
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick)
	{
		ModelEternalPowerSource.render((TileEntityEternalPowerSource)tileEntity, x, y, z);
	}
}