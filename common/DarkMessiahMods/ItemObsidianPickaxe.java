package DarkMessiahMods;

import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemPickaxe;

public class ItemObsidianPickaxe extends ItemPickaxe{

	public ItemObsidianPickaxe(int ItemID, EnumToolMaterial material){
		super(ItemID, material);
	}
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
}
