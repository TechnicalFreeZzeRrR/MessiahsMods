package DarkMessiahMods;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class ItemNetherRiumItemArmor extends ItemArmor implements IArmorTextureProvider{

	public ItemNetherRiumItemArmor(int par1,	EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);

	}
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
		


	public String getArmorTextureFile(ItemStack par1){
		if ( par1.itemID==mod_DarkMessiahsMods.ObsidianHelmet.shiftedIndex|| par1.itemID==mod_DarkMessiahsMods.ObsidianPlate.shiftedIndex||
				 par1.itemID==mod_DarkMessiahsMods.ObsidianShoes.shiftedIndex){
			return "/Recourses/Armor/NetherriumArmor_1.png";
		}if(par1.itemID==mod_DarkMessiahsMods.ObsidianLegs.shiftedIndex){
			return "/Recourses/Armor/NetherriumArmor_2.png";
		}return "/Recourses/Armor/NetherriumArmor_2.png";
	}
	
	
	
	
}
