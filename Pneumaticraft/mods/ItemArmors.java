package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmors extends ItemArmor
{
	private String iconIndex;
	private String Armor;
	private int type;
	public ItemArmors(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String icon, String armor) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		iconIndex = icon;
		Armor = armor;
		setCreativeTab(CreativeTabs.tabCombat);
		type = par4;
	}
	public String getIconIndex()
	{
		return getUnlocalizedName();
	}
	public String getArmorTexture()
	{
		return Armor;
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {
        if (type == 2)
        {
        return "/mods/Pneumaticraft/textures/" + Armor + "_2.png/";
        }
        else
        {
        return "/mods/Pneumaticraft/textures/" + Armor + "_1.png/";
        }
    }
	public void registerIcons(IconRegister reg)
	{
		itemIcon = reg.registerIcon("Pneumaticraft:" + iconIndex);
	}

}
