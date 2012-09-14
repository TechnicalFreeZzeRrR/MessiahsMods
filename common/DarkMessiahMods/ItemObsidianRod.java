package DarkMessiahMods;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ItemObsidianRod extends Item{
	public ItemObsidianRod(int par1){
		super(par1);
		maxStackSize=64;
		this.setTabToDisplayOn(CreativeTabs.tabMaterials);
	}
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
		
}
