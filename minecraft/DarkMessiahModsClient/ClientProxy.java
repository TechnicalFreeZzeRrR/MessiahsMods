package DarkMessiahModsClient;

import net.minecraftforge.client.MinecraftForgeClient;
import DarkMessiahMods.CommonProxy;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/MessiahsTexture.png");
		MinecraftForgeClient.preloadTexture("/terrain.png");
	}

}
