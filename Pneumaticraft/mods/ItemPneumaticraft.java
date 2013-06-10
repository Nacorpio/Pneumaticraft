package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemPneumaticraft extends Item {
	
	

	public ItemPneumaticraft(int id) {
		super(id);
		
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
