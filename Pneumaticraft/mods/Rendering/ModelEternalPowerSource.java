package Pneumaticraft.mods.Rendering;

import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import Pneumaticraft.mods.TileEntityEternalPowerSource;
import cpw.mods.fml.client.FMLClientHandler;




public class ModelEternalPowerSource extends ModelBase{
		private IModelCustom ModelEternalPowerSource;
	
		public ModelEternalPowerSource(){
			ModelEternalPowerSource = AdvancedModelLoader.loadModel("/mods/Pneumaticraft/models/Power.obj");
		}
		
		public void render()
		{
			ModelEternalPowerSource.renderAll();
		}
		public void render(TileEntityEternalPowerSource box, double x, double y, double z)
		{
			// Push a blank matrix onto the stack
			GL11.glPushMatrix();

			// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
			GL11.glTranslatef((float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f);
			
			// Scale our object to about half-size in all directions (the OBJ file is a little large)
			GL11.glScalef(0.5f, 0.5f, 0.5f);

			// Bind the texture, so that OpenGL properly textures our block.
			FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/Pneumaticraft/textures/models/Power.png");

			// Render the object, using modelTutBox.renderAll();
			this.render();

			// Pop this matrix from the stack.
			GL11.glPopMatrix();
		}
}

