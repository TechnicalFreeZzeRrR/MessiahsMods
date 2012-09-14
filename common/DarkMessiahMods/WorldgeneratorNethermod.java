package DarkMessiahMods;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgeneratorNethermod implements IWorldGenerator 
{
	@Override
 public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
 {
  switch (world.provider.worldType)
  {
   case -1: generateNether(world, random, chunkX*16, chunkZ*16);
   case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
  }
 }

  

  private void generateSurface(World world, Random random, int blockX, int blockZ) 
 {
  int XCoordinates = blockX + random.nextInt(16);
  int YCoordinates = random.nextInt(60);
  int ZCoordinates = blockZ + random.nextInt(16);
  
  
  
  
 }
 
 private void generateNether(World world, Random random, int blockX, int blockZ) 
 {
 int Xcoord = blockX + random.nextInt(16);
 int Ycoord = random.nextInt(128);
 int Zcoord = blockZ + random.nextInt(16);
 
 /*
  * How to add another generation:
  * add the same line as down here.
  * Change the Orename, done!
  */
 (new WorldGenMinableNetherForDarkMessiahsMods(mod_DarkMessiahsMods.NetherriumOre.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
 
  
 }
}
