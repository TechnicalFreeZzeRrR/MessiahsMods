package DarkMessiahMods;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSpade;

public class ItemObsidianShovel extends ItemSpade{

	public ItemObsidianShovel(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
}
