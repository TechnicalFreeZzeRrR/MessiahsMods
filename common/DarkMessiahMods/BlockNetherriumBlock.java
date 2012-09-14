package DarkMessiahMods;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;

public class BlockNetherriumBlock extends Block{
	public BlockNetherriumBlock(int par1, int par2){
		super(par1, par2, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	
	
	}
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return mod_DarkMessiahsMods.NetherriumGem.shiftedIndex;
    }
	

}