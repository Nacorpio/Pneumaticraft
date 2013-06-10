package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemRadiumSpade extends ItemSpade{

	public ItemRadiumSpade(int par1,
			EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(CreativeTabs.tabTools);
	}

	public void registerIcons(IconRegister reg){
		itemIcon = reg.registerIcon("Pneumaticraft:RadiumShovel");
	}
	
}