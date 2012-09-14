package DarkMessiahMods;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;

public class ItemObsidianHoe extends ItemHoe{

	public ItemObsidianHoe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
}
