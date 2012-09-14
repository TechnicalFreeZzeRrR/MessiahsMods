package DarkMessiahMods;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class ItemObsidianSword extends ItemSword{

	public ItemObsidianSword(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
}
