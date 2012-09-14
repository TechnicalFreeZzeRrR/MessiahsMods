package DarkMessiahMods;

import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemTool;

public class ItemObsidianMulti extends ItemTool{

	private static Block[] BlockGoodAgainst = new Block[] { Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockSteel, Block.dirt,Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail, Block.railDetector, Block.railPowered};


	public ItemObsidianMulti(int ItemID, EnumToolMaterial material){
		super(ItemID, 3,material,BlockGoodAgainst);
		
		
	}
	
	
	@Override
	public String getTextureFile(){
		return "/MessiahsTexture.png";
	}
}
