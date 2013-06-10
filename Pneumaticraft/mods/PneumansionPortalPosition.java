package Pneumaticraft.mods;

import net.minecraft.util.ChunkCoordinates;

public class PneumansionPortalPosition extends ChunkCoordinates
{
    /** The worldtime at which this PortalPosition was last verified */
    public long lastUpdateTime;

    /** The teleporter to which this PortalPosition applies */
    final TeleporterPneumansion teleporterInstance;

    public PneumansionPortalPosition(TeleporterPneumansion par1Teleporter, int par2, int par3, int par4, long par5)
    {
        par2= 50;
        par3= 65;
        par4 = 0;
        this.teleporterInstance = par1Teleporter;
        this.lastUpdateTime = par5;
    }

	
}
