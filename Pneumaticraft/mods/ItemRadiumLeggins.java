package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;



public class ItemRadiumLeggins extends ItemArmor{

	public ItemRadiumLeggins(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
	
	public void registerIcons(IconRegister reg){
		itemIcon = reg.registerIcon("Pneumaticraft:RadiumLeggins");
	}
}
