package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemFoodPneumaticraft extends ItemFood{

	public ItemFoodPneumaticraft(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
	}
		private String filename;
		
		
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		
		this.itemIcon = reg.registerIcon(filename);
	}
	
	public void setIconFile(String name){
		filename = name;
	}

}
