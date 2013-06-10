package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;


public class ItemRadiumHoe extends ItemHoe{

	public ItemRadiumHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}
	public void registerIcons(IconRegister reg){
		itemIcon = reg.registerIcon("Pneumaticraft:RadiumHoe");
	}
}
