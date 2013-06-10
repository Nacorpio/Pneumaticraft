package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;


public class ItemSpades extends ItemSpade
{
	private String iconIndex;	
	public ItemSpades(int par1, EnumToolMaterial par2EnumToolMaterial, String icon) 
	{
		super(par1, par2EnumToolMaterial);
		iconIndex = icon;
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
	public String getIconIndex()
	{
		return iconIndex;
	}
	public void registerIcons(IconRegister reg)
	{
		itemIcon = reg.registerIcon("Pneumaticraft:" + iconIndex);
	}
}
