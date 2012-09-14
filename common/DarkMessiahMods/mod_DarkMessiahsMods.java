/*
 * Package
 */
package DarkMessiahMods;
 
/*
 * Importing Stuff
 */
 
import net.minecraft.src.Achievement;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.IInventory;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
/*
 * Forge Basic Stuff
 */
 
@Mod(modid="Dark Messiahs Mod",name="Dark Messiahs Mod",version="1.3.2")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
 
public class mod_DarkMessiahsMods {
       
        /*
         * Creating Items, Blocks, and Achievements
         */
       
        public static Item ObsidianPickaxe;
        public static Item ObsidianAxe;
        public static Item ObsidianShovel;
        public static Item ObsidianHoe;
        public static Item ObsidianSword;
        public static Item ObsidianMulti;
        public static Item ObsidianIngot;
        public static Item ObsidianFragment;
        public static Item ObsidianHelmet;
        public static Item ObsidianPlate;
        public static Item ObsidianShoes;
        public static Item ObsidianLegs;  
        public static Item helmetNetherRium;
        public static Item plateNetherRium;
        public static Item legsNetherRium;
        public static Item bootsNetherRium;
        public static Block NetherriumOre;
        public static Item ObsidianRod;
        public static Item NetherriumGem;
        public static Item CookedFlesh;
        public static Achievement getObsidian;
        public static Achievement getObsidianIngot;
        public static Achievement ObsidianAxeAchv;
	    public static Achievement ObsidianShovelAchv;
	    public static Achievement ObsidianPickaxeAchv;
	    public static Achievement ObsidianSwordAchv;
	    public static Achievement ObsidianHoeAchv;
	    public static Item Strawseeds;
	    public static Item StrawFruit;
	    public static Block StrawCrop;
	    public static Item NetherrPick;
	    public static Item NetherrSword;
	    public static Item NetherrAxe;
	    public static Item NetherrHoe;
	    public static Item NetherrShovel;

	    /*
	     * Creating vars for id's for config
	     */
	     public int  StrawCropID;
	     public int NetherriumOreID;
	     public int ObsidianPickaxeID;
         public int  ObsidianAxeID;
         public int  ObsidianShovelID;
         public int  ObsidianHoeID;
         public int  ObsidianSwordID;
         public int  ObsidianMultiID;
         public int  ObsidianIngotID;
         public int  ObsidianFragmentID;
         public int  ObsidianHelmetID;
         public int  ObsidianPlateID;
         public int  ObsidianShoesID;
         public int  ObsidianLegsID;  
         public int  helmetNetherRiumID;
         public int  plateNetherRiumID;
         public int  legsNetherRiumID;
         public int  bootsNetherRiumID;
         public int  ObsidianRodID;
         public int  NetherriumGemID;
         public int  CookedFleshID;
	     public int  StrawseedsID;
	     public int  StrawFruitID;
	     public int  NetherrPickID;
	     public int  NetherrSwordID;
	     public int  NetherrAxeID;
	     public int  NetherrHoeID;
	     public int  NetherrShovelID;

   
       
        /*
         * Basic forge stuff
         */
        @SidedProxy(clientSide="DarkMessiahModsClient.ClientProxy", serverSide= "DarkMessiahMods.CommonProxy")
        public static CommonProxy proxy;
       
        /*
         * New Materials
         */
        static EnumToolMaterial EnumToolMaterialObsidian=EnumHelper.addToolMaterial("Obsidian", 5, 2000, 20.0F, 15, 20);
        static EnumArmorMaterial EnumArmorMaterialObsidian = EnumHelper.addArmorMaterial("Obsidian", 29, new int[]{2,7,7,2}, 20);
        static EnumArmorMaterial EnumArmorMaterialNetherRium = EnumHelper.addArmorMaterial("NetherRium", 29, new int[]{2,7,7,2}, 20);
        static EnumToolMaterial EnumToolMaterialNetherrium=EnumHelper.addToolMaterial("Netherrium", 5, 2000, 20.0F, 15, 20);
		       
       
        /*
         * Making forge load the config
         */
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                Configuration config = new Configuration(event.getSuggestedConfigurationFile());

                /*
                 * Load previous config
                 */
                config.load();

                /*
                 * Write/read default id's
                 */
                
                NetherriumOreID = config.getOrCreateIntProperty("NetherriumOreID",Configuration.CATEGORY_BLOCK, 3717).getInt();
                StrawCropID = config.getOrCreateIntProperty("StrawCropID",Configuration.CATEGORY_BLOCK, 3718).getInt();
                ObsidianPickaxeID= config.getOrCreateIntProperty("ObsidianPickaxeID",Configuration.CATEGORY_ITEM, 2560).getInt();
                ObsidianAxeID= config.getOrCreateIntProperty("ObsidianAxeID",Configuration.CATEGORY_ITEM, 2561).getInt();
                ObsidianShovelID= config.getOrCreateIntProperty("ObsidianShovelID",Configuration.CATEGORY_ITEM, 2562).getInt();
                ObsidianHoeID= config.getOrCreateIntProperty("ObsidianHoeID",Configuration.CATEGORY_ITEM, 2563).getInt();
                ObsidianSwordID= config.getOrCreateIntProperty("ObsidianSwordID",Configuration.CATEGORY_ITEM, 2564).getInt();
                ObsidianMultiID= config.getOrCreateIntProperty("ObsidianMultiID",Configuration.CATEGORY_ITEM, 2565).getInt();
                ObsidianIngotID= config.getOrCreateIntProperty("ObsidianIngotID",Configuration.CATEGORY_ITEM, 2566).getInt();
                ObsidianFragmentID= config.getOrCreateIntProperty("ObsidianFragmentID",Configuration.CATEGORY_ITEM, 2567).getInt();
                ObsidianHelmetID= config.getOrCreateIntProperty("ObsidianHelmetID",Configuration.CATEGORY_ITEM, 2568).getInt();
                ObsidianPlateID= config.getOrCreateIntProperty("ObsidianPlateID",Configuration.CATEGORY_ITEM, 2569).getInt();
                ObsidianShoesID= config.getOrCreateIntProperty("ObsidianShoesID",Configuration.CATEGORY_ITEM, 2570).getInt();
                ObsidianLegsID  = config.getOrCreateIntProperty("ObsidianLegsID",Configuration.CATEGORY_ITEM, 2571).getInt();
                helmetNetherRiumID= config.getOrCreateIntProperty("helmetNetherRiumID",Configuration.CATEGORY_ITEM, 2572).getInt();
                plateNetherRiumID= config.getOrCreateIntProperty("plateNetherRiumID",Configuration.CATEGORY_ITEM, 2573).getInt();
                legsNetherRiumID= config.getOrCreateIntProperty("legsNetherRiumID",Configuration.CATEGORY_ITEM, 2574).getInt();
                bootsNetherRiumID= config.getOrCreateIntProperty("bootsNetherRiumID",Configuration.CATEGORY_ITEM, 2575).getInt();
                ObsidianRodID= config.getOrCreateIntProperty("ObsidianRodID",Configuration.CATEGORY_ITEM, 2576).getInt();
                NetherriumGemID= config.getOrCreateIntProperty("NetherriumGemID",Configuration.CATEGORY_ITEM, 2577).getInt();
                CookedFleshID= config.getOrCreateIntProperty("CookedFleshID",Configuration.CATEGORY_ITEM, 2578).getInt();
       	        StrawseedsID= config.getOrCreateIntProperty("StrawseedsID",Configuration.CATEGORY_ITEM, 2579).getInt();
       	        StrawFruitID= config.getOrCreateIntProperty("StrawFruitID",Configuration.CATEGORY_ITEM, 2580).getInt();
       	        NetherrPickID= config.getOrCreateIntProperty("NetherrPickID",Configuration.CATEGORY_ITEM, 2581).getInt();
       	        NetherrSwordID= config.getOrCreateIntProperty("NetherrSwordID",Configuration.CATEGORY_ITEM, 2582).getInt();
       	        NetherrAxeID= config.getOrCreateIntProperty("NetherrAxeID",Configuration.CATEGORY_ITEM, 2583).getInt();
       	        NetherrHoeID= config.getOrCreateIntProperty("NetherrHoeID",Configuration.CATEGORY_ITEM, 2584).getInt();
       	        NetherrShovelID= config.getOrCreateIntProperty("NetherrShovelID",Configuration.CATEGORY_ITEM, 2585).getInt();
                
                
                /*
                 * Save config
                 */
                config.save();
        }
       
        @Init
        public void load(FMLInitializationEvent event){
               
        /*
         * Info about these
         */
 
        ObsidianPickaxe = new ItemObsidianPickaxe(ObsidianPickaxeID,EnumToolMaterialObsidian).setItemName("ObsidianPick").setIconIndex(1);
        ObsidianAxe = new ItemObsidianAxe(ObsidianAxeID,EnumToolMaterialObsidian).setItemName("ObsidianAxe").setIconIndex(2);
        ObsidianShovel = new ItemObsidianShovel(ObsidianShovelID,EnumToolMaterialObsidian).setItemName("ObsidianShovel").setIconIndex(3);
        ObsidianSword = new ItemObsidianSword(ObsidianSwordID,EnumToolMaterialObsidian).setItemName("ObsidianSword").setIconIndex(0);
        ObsidianHoe = new ItemObsidianHoe(ObsidianHoeID,EnumToolMaterialObsidian).setItemName("ObsidianHoe").setIconIndex(4);
        ObsidianMulti = new ItemObsidianMulti(ObsidianMultiID,EnumToolMaterialObsidian).setItemName("ObsidianMutli").setIconIndex(5);
        ObsidianIngot = new ItemObsidianIngot(ObsidianIngotID).setItemName("ObsidainIngot").setIconIndex(6);
        ObsidianFragment = new ItemObsidianIngot(ObsidianFragmentID).setItemName("ObsidianFragment").setIconIndex(27);
        ObsidianHelmet = new ItemObsidianArmor(ObsidianHelmetID,EnumArmorMaterialObsidian, ModLoader.addArmor("Obsidian"),0).setItemName("ObsHelm").setIconIndex(16);
        ObsidianPlate = new ItemObsidianArmor(ObsidianPlateID,EnumArmorMaterialObsidian,5,1).setItemName("ObsPlate").setIconIndex(32);
        ObsidianShoes = new ItemObsidianArmor(ObsidianShoesID,EnumArmorMaterialObsidian, 5,2).setItemName("ObsShoes").setIconIndex(48);
        ObsidianLegs = new ItemObsidianArmor(ObsidianLegsID,EnumArmorMaterialObsidian, 5,3).setItemName("ObsLegs").setIconIndex(64);
        helmetNetherRium = new ItemNetherRiumItemArmor(helmetNetherRiumID, EnumArmorMaterialNetherRium, 5, 0).setIconIndex(17).setItemName("helmetNetherRium");
        plateNetherRium = new ItemNetherRiumItemArmor(plateNetherRiumID, EnumArmorMaterialNetherRium, 5, 1).setIconIndex(33).setItemName("chestplateNetherRium");
        legsNetherRium = new ItemNetherRiumItemArmor(legsNetherRiumID, EnumArmorMaterialNetherRium, 5, 2).setIconIndex(49).setItemName("leggingsNetherRium");
        bootsNetherRium = new ItemNetherRiumItemArmor(bootsNetherRiumID, EnumArmorMaterialNetherRium, 5, 3).setIconIndex(65).setItemName("bootsNetherRium");
        NetherriumOre = new BlockNetherriumBlock(NetherriumOreID,14).setBlockName("NetherriumOre").setHardness(6.0F).setStepSound(Block.soundSandFootstep).setResistance(5.0F).setLightValue(0.5F);
        ObsidianRod = new ItemObsidianRod(ObsidianRodID).setItemName("ObsRod").setIconIndex(7);
        NetherriumGem = new ItemObsidianRod(NetherriumGemID).setItemName("NethGem").setIconIndex(15);
        CookedFlesh = new ItemFoodCookedFlesh(CookedFleshID,4,false).setItemName("CookedFlesh").setIconIndex(18);
        getObsidian = new Achievement(2001, "ObsidianAchief", 6, 6,Block.obsidian,null).registerAchievement();
        getObsidianIngot = new Achievement(2002, "ObsidianIngot", 7, 6, ObsidianIngot,getObsidian).registerAchievement();
        ObsidianAxeAchv = new Achievement(2003, "ObsidianAxeAchv", 8, 6, ObsidianAxe, getObsidianIngot).setSpecial().registerAchievement();
        ObsidianShovelAchv = new Achievement(2004, "ObsidianShovelAchv", 8, 7, ObsidianShovel, getObsidianIngot).setSpecial().registerAchievement();
        ObsidianPickaxeAchv = new Achievement(2005, "ObsidianShovelAchv", 8 ,8, ObsidianPickaxe, getObsidianIngot).setSpecial().registerAchievement();
        ObsidianSwordAchv = new Achievement(2006, "ObsidianShovelAchv", 8, 5,   ObsidianSword, getObsidianIngot).setSpecial().registerAchievement();
        ObsidianHoeAchv = new Achievement(2007, "ObsidianShovelAchv", 8, 4, ObsidianHoe, getObsidianIngot).setSpecial().registerAchievement();
        StrawCrop = new BlockNewCrop(StrawCropID,19).setHardness(0F).setBlockName("DMMCrop");
        Strawseeds = new ItemStrawSeeds(StrawseedsID,StrawCrop.blockID,Block.tilledField.blockID).setIconIndex(24).setItemName("StrawSeed");
        StrawFruit = new ItemFoodCookedFlesh(StrawFruitID, 4, false).setItemName("Strawfruit").setIconIndex(25);
        NetherrPick = new ItemObsidianPickaxe(NetherrPickID,EnumToolMaterialNetherrium).setItemName("NetherrPick").setIconIndex(9);
        NetherrAxe = new ItemObsidianAxe(NetherrAxeID,EnumToolMaterialNetherrium).setItemName("NetherrAxe").setIconIndex(10);
        NetherrShovel = new ItemObsidianShovel(NetherrShovelID,EnumToolMaterialNetherrium).setItemName("NetherrShovel").setIconIndex(11);
        NetherrSword = new ItemObsidianSword(NetherrSwordID,EnumToolMaterialNetherrium).setItemName("NetherrSword").setIconIndex(8);
        NetherrHoe = new ItemObsidianHoe(NetherrHoeID,EnumToolMaterialNetherrium).setItemName("NetherrHoe").setIconIndex(12);


        /*
         * GameRegistry
         */
       
        GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(ObsidianFragment,2),1F);
        GameRegistry.addSmelting(Item.rottenFlesh.shiftedIndex, new ItemStack(CookedFlesh,1), 1F);
        GameRegistry.registerBlock(NetherriumOre);
        GameRegistry.registerBlock(StrawCrop);
        GameRegistry.registerWorldGenerator(new WorldgeneratorNethermod());
        


       
       
       
       
        /*
         * Recipes
         */
               
       
        GameRegistry.addShapelessRecipe(new ItemStack(ObsidianIngot,2), new Object[]{
                ObsidianFragment,ObsidianFragment,ObsidianFragment,ObsidianFragment,
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianPickaxe,1), new Object[]{
                "OOO"," S "," S ",'O',ObsidianIngot,'S',Item.stick
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianAxe,1), new Object[]{
                "OO ","OS "," S ",'O',ObsidianIngot,'S',Item.stick
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianShovel,1), new Object[]{
                " O "," S "," S ",'O',ObsidianIngot,'S',Item.stick
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianSword,1), new Object[]{
                " O "," O "," S ",'O',ObsidianIngot,'S',Item.stick
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianHoe,1), new Object[]{
                "OO "," S "," S ",'O',ObsidianIngot,'S',Item.stick
        });
        GameRegistry.addShapelessRecipe(new ItemStack(ObsidianMulti), new Object[]{
                ObsidianPickaxe,ObsidianShovel,ObsidianAxe
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianPlate,1), new Object[]{
                "O O","OOO","OOO",'O',ObsidianIngot
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianLegs,1), new Object[]{
                "OOO","O O","O O",'O',ObsidianIngot
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianShoes,1), new Object[]{
                "   ","O O","O O",'O',ObsidianIngot
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianShoes,1), new Object[]{
                "O O","O O","   ",'O',ObsidianIngot
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianHelmet,1), new Object[]{
                "OOO","O O","   ",'O',ObsidianIngot
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianHelmet,1), new Object[]{
                "   ","OOO","O O",'O',ObsidianIngot
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianRod,2), new Object[]{
                "X  ","X  ","   ",'X',ObsidianIngot  
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianRod,2), new Object[]{
                "   ","X  ","X  ",'X',ObsidianIngot  
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianRod,2), new Object[]{
                " X "," X ","   ",'X',ObsidianIngot  
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianRod,2), new Object[]{
                "   "," X "," X ",'X',ObsidianIngot  
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianRod,2), new Object[]{
                "  X","  X","   ",'X',ObsidianIngot  
        });
        GameRegistry.addRecipe(new ItemStack(ObsidianRod,2), new Object[]{
                "X  ","X  ","   ",'X',ObsidianIngot  
        });
    GameRegistry.addRecipe(new ItemStack(plateNetherRium), new Object[] {
        "X X", "XXX", "XXX",'X', NetherriumGem
        });
    GameRegistry.addRecipe(new ItemStack(legsNetherRium), new Object[] {
        "XXX", "X X", "X X",'X', NetherriumGem
        });
    GameRegistry.addRecipe(new ItemStack(bootsNetherRium), new Object[] {
        "X X", "X X",'X', NetherriumGem
        });
    GameRegistry.addRecipe(new ItemStack(helmetNetherRium), new Object[] {
        "XXX", "X X", 'X', NetherriumGem
        });
    GameRegistry.addRecipe(new ItemStack(NetherrPick,1), new Object[]{
        "OOO"," S "," S ",'O',NetherriumGem,'S',ObsidianRod
    	});
	GameRegistry.addRecipe(new ItemStack(NetherrAxe,1), new Object[]{
	        "OO ","OS "," S ",'O',NetherriumGem,'S',ObsidianRod
		});
	GameRegistry.addRecipe(new ItemStack(NetherrShovel,1), new Object[]{
	        " O "," S "," S ",'O',NetherriumGem,'S',ObsidianRod
		});
	GameRegistry.addRecipe(new ItemStack(NetherrSword,1), new Object[]{
	        " O "," O "," S ",'O',NetherriumGem,'S',ObsidianRod
		});
	GameRegistry.addRecipe(new ItemStack(NetherrHoe,1), new Object[]{
	        "OO "," S "," S ",'O',NetherriumGem,'S',ObsidianRod
		});


    this.addAchievementDescs();
 
       
        /*
         * LanguageRegistry (adding names)
         */
        LanguageRegistry.addName(ObsidianPickaxe, "Obsidian Pickaxe");
        LanguageRegistry.addName(ObsidianAxe, "Obsidian Axe");
        LanguageRegistry.addName(ObsidianHoe, "Obsidian Hoe");
        LanguageRegistry.addName(ObsidianMulti, "Obsidian Multitool");
        LanguageRegistry.addName(ObsidianShovel, "Obsidian Shovel");
        LanguageRegistry.addName(ObsidianSword, "Obsidian Sword");
        LanguageRegistry.addName(ObsidianFragment, "Obsidian Fragment");
        LanguageRegistry.addName(ObsidianIngot, "Obsidian Ingot");
        LanguageRegistry.addName(ObsidianHelmet, "Obsidian Helmet");
        LanguageRegistry.addName(ObsidianLegs, "Obsidian Legs");
        LanguageRegistry.addName(ObsidianShoes, "Obsidian Boots");
	    LanguageRegistry.addName(ObsidianPlate, "Obsidian Chestplate");
	    LanguageRegistry.addName(helmetNetherRium, "Netherrium Helmet");
	    LanguageRegistry.addName(plateNetherRium, "Netherrium Chestplate");
	    LanguageRegistry.addName(legsNetherRium, "Netherrium Leggings");
	    LanguageRegistry.addName(bootsNetherRium, "Netherrium Boots");
	    LanguageRegistry.addName(ObsidianRod, "Obsidian Rod");
	    LanguageRegistry.addName(NetherriumGem, "Netherrium Gem");
	    LanguageRegistry.addName(NetherriumOre, "Netherrium Ore");
	    LanguageRegistry.addName(CookedFlesh, "Cooked Flesh");
	    LanguageRegistry.addName(StrawCrop, "Strawberry Crop");
	    LanguageRegistry.addName(StrawFruit, "Strawberry");	    
	    LanguageRegistry.addName(Strawseeds, "Strawberry seeds");	   
        LanguageRegistry.addName(NetherrPick, "Netherrium Pickaxe");
        LanguageRegistry.addName(NetherrAxe, "Netherrium Axe");
        LanguageRegistry.addName(NetherrHoe, "Netherrium Hoe");
        LanguageRegistry.addName(NetherrShovel, "Netherrium Shovel");
        LanguageRegistry.addName(NetherrSword, "Netherrium Sword");
 
        /*
         * texture renderer    
         */
        proxy.registerRenderThings();
        }
       
        
        /*
         * Achievement pickup/crafting triggers
         */
        
        private void onItemPickup(EntityPlayer entityplayer, ItemStack itemstack){
        boolean flag = false;
        if (itemstack.itemID == Block.obsidian.blockID){
                entityplayer.addStat(getObsidian, 1);
                flag = true;
        }
        }
        public void takenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory){
        boolean flag = false;
        if (itemstack.itemID == ObsidianIngot.shiftedIndex){
                entityplayer.addStat(getObsidianIngot, 1);
                flag = true;      
        }
        if (itemstack.itemID == ObsidianAxe.shiftedIndex){
            entityplayer.addStat(ObsidianAxeAchv, 1);
            flag = true;
        }
        if (itemstack.itemID == ObsidianPickaxe.shiftedIndex){
            entityplayer.addStat(ObsidianPickaxeAchv, 1);
            flag = true;
        }
        if (itemstack.itemID == ObsidianSword.shiftedIndex){
            entityplayer.addStat(ObsidianSwordAchv, 1);
            flag = true;
        }
        if (itemstack.itemID == ObsidianHoe.shiftedIndex){
            entityplayer.addStat(ObsidianHoeAchv, 1);
            flag = true;
        }
        if (itemstack.itemID == ObsidianAxe.shiftedIndex){
            entityplayer.addStat(ObsidianShovelAchv, 1);
            flag = true;
        }
        
}
        /*
         * Achievement Discriptions
         */
        
        static void addAchievementDescs(){
        ModLoader.addAchievementDesc(getObsidian, "Mine Obsidian", "Mine Obsidian");        
        ModLoader.addAchievementDesc(getObsidianIngot, "Get Obsidian Ingot", "Craft an obsidian ingot by combining 4 obisidian sharts");
        ModLoader.addAchievementDesc(ObsidianAxeAchv, "Get an obisidian axe", "Craft an obsidian axe with obisidian ingots and sticks");
        ModLoader.addAchievementDesc(ObsidianPickaxeAchv, "Get an obisidian pickaxe", "Craft an obsidian pickaxe with obisidian ingots and sticks");
        ModLoader.addAchievementDesc(ObsidianShovelAchv, "Get an obisidian sword", "Craft an obsidian sword with obisidian ingots and sticks");
        ModLoader.addAchievementDesc(ObsidianSwordAchv, "Get an obisidian hoe", "Craft an obsidian hoe with obisidian ingots and sticks");
        ModLoader.addAchievementDesc(ObsidianHoeAchv, "Get an obisidian shovel", "Craft an obsidian shovel with obisidian ingots and sticks");
       
       
        }

/*
 * Still need:
 * 
 * Armour world renderer texture.
 * Array for multitool
 * Fix Nether generation
 * 
 * 
 * 
 * 
 * 
 */
}