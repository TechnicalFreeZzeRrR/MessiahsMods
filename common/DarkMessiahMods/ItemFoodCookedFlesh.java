package DarkMessiahMods;

import net.minecraft.src.ItemFood;

public class ItemFoodCookedFlesh extends ItemFood{
	public ItemFoodCookedFlesh(int i, int j,boolean k){
	super(i,  j, k);
		
	}
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}

}
