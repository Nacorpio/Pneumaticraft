package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;




public class ItemPowerVoid extends Item {

	public ItemPowerVoid(int par1) {
		super(par1);
		 this.maxStackSize = 1;
	        this.setMaxDamage(512);
	     
	}
	public void registerIcons(IconRegister reg){
		itemIcon = reg.registerIcon("Pneumaticraft:PowerVoid");
	}
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            int i1 = par3World.getBlockId(par4, par5, par6);

            if (i1 == 0)
            {
                par3World.setBlock(par4, par5, par6, Pneumaticraft.eternalPowerSource.blockID);
            }

            par1ItemStack.damageItem(1, par2EntityPlayer);
            return true;
        }}}

