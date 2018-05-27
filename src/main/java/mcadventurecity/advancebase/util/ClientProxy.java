package mcadventurecity.advancebase.util;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Jarod Reichel on 7/16/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Constants.MODID + ":" + id, "inventory"));

    }
    @Override
	public String localize(String unlocalized, Object... args) {
		return I18n.format(unlocalized, args);
	}
}
