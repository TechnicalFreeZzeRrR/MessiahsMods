package DarkMessiahMods;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityItem;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class BlockNewCrop extends BlockFlower
{

        protected BlockNewCrop(int i, int j)
        {
                super(i, j);
                this.setTickRandomly(true);
                float f = 0.5F;
                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
                this.setCreativeTab((CreativeTabs)null);
        }

        protected boolean canThisPlantGrowOnThisBlockID(int i)
        {
                return i == Block.tilledField.blockID;
        }
        public String getTextureFile(){
        	return "/MessiahsTexture.png";
        }

        public void updateTick(World world, int i, int j, int k, Random random)
        {
                super.updateTick(world, i, j, k, random);
                if(world.getBlockLightValue(i, j + 1, k) >= 9)
                {
                        int l = world.getBlockMetadata(i, j, k);
                        if(l < 7)
                        {
                                float f = getGrowthRate(world, i, j, k);
                                if(random.nextInt((int)(25F / f) + 1) == 0)
                                {
                                        l++;
                                        world.setBlockMetadataWithNotify(i, j, k, l);
                                }
                        }
                }
        }

        public void fertilize(World world, int i, int j, int k)
        {
                world.setBlockMetadataWithNotify(i, j, k, 7);
        }

        private float getGrowthRate(World world, int i, int j, int k)
        {
                float f = 1.0F;
                int l = world.getBlockId(i, j, k - 1);
                int i1 = world.getBlockId(i, j, k + 1);
                int j1 = world.getBlockId(i - 1, j, k);
                int k1 = world.getBlockId(i + 1, j, k);
                int l1 = world.getBlockId(i - 1, j, k - 1);
                int i2 = world.getBlockId(i + 1, j, k - 1);
                int j2 = world.getBlockId(i + 1, j, k + 1);
                int k2 = world.getBlockId(i - 1, j, k + 1);
                boolean flag = j1 == blockID || k1 == blockID;
                boolean flag1 = l == blockID || i1 == blockID;
                boolean flag2 = l1 == blockID || i2 == blockID || j2 == blockID || k2 == blockID;
                for(int l2 = i - 1; l2 <= i + 1; l2++)
                {
                        for(int i3 = k - 1; i3 <= k + 1; i3++)
                        {
                                int j3 = world.getBlockId(l2, j - 1, i3);
                                float f1 = 0.0F;
                                if(j3 == Block.tilledField.blockID)
                                {
                                        f1 = 1.0F;
                                        if(world.getBlockMetadata(l2, j - 1, i3) > 0)
                                        {
                                                f1 = 3F;
                                        }
                                }
                                if(l2 != i || i3 != k)
                                {
                                        f1 /= 4F;
                                }
                                f += f1;
                        }

                }

                if(flag2 || flag && flag1)
                {
                        f /= 2.0F;
                }
                return f;
        }


        public int getBlockTextureFromSideAndMetadata(int i, int j)
        {
                if(j == 0)
                {
                return blockIndexInTexture;
                }
                if(j == 1)
                {
                        return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+1;
                }
                if(j == 2)
                {
                	return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+2;
                }                                                          
                if(j == 3)                                   
                {
                	return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+3;
                }
                if(j == 4)
                {
                	return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+4;
                }
                if(j == 5)
                {
                	return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+5;
                }
                if(j == 6)
                {
                	return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+6;
                }
                if(j == 7)
                {
                	return mod_DarkMessiahsMods.StrawCrop.blockIndexInTexture+7;
                }
                        return -1;
        }

        public int getRenderType()
        {
                return 1; 
        }

        public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1)
        {
                super.dropBlockAsItemWithChance(world, i, j, k, l, f, 0);
                int j1 = 3 + i1;
                for(int k1 = 0; k1 < j1; k1++)
                {
                        if(world.rand.nextInt(15) <= l)
                        {
                                float f1 = 0.7F;
                                float f2 = world.rand.nextFloat() * f1 + (1.0F - f1) * 0.5F;
                                float f3 = world.rand.nextFloat() * f1 + (1.0F - f1) * 0.5F;
                                float f4 = world.rand.nextFloat() * f1 + (1.0F - f1) * 0.5F;
                                EntityItem entityitem = new EntityItem(world, (float)i + f2, (float)j + f3, (float)k + f4, new ItemStack(mod_DarkMessiahsMods.Strawseeds)); // BLAH BLAH BLAH Change this and seeds will drop before grown and when fully grown
                                entityitem.delayBeforeCanPickup = 10;
                                world.spawnEntityInWorld(entityitem); 
                        }
                }

        }

        public int idDropped(int i, Random random, int j)
        {
                if(i == 7)
                {
                        return mod_DarkMessiahsMods.StrawFruit.shiftedIndex;
                } else
                {
                        return -1;
                }
        }

        public int quantityDropped(Random random)
        {
                return 1; 
        }
}