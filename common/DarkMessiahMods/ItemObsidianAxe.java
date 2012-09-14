package DarkMessiahMods;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemAxe;

public class ItemObsidianAxe extends ItemAxe{

	public ItemObsidianAxe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
}
