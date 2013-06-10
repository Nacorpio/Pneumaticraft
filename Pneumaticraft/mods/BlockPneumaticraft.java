package Pneumaticraft.mods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;



public class BlockPneumaticraft extends Block{

	public BlockPneumaticraft(int id, Material mat) {
		super(id, mat);
	}
	
	private String filename;
	
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon(filename);
	}
	
	public void setIconFile(String name){
		filename = name;
	}
		
	
	
    
}