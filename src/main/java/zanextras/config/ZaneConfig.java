package zanextras.config;

import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ZaneConfig {
	
	public static String CATEGORY_ORES = "Ores";
	public static String CATEGORY_CROPS = "Crops";
	public static String CATEGORY_LIQUIDS = "Liquids";
	public static String CATEGORY_STRUCTURES = "Structures";
	public static String CATEGORY_BIOMES = "Biomes";
	public static String CATEGORY_DIMENSIONS = "Dimensions";
	public static String CATEGORY_POTIONS = "Potion IDs";
	public static String CATEGORY_OPTIONS = "Toggle Options";
	
	public static int oreZaniumSpawnRate;
	public static int oreStariaSpawnRate;
	public static int oreSodiumSpawnRate;
	public static int oreButterSpawnRate;
	public static int cropSpawnRate;
	public static int cropSpawnRateNether;
	public static int liquidAcidSpawnRate;
	public static int liquidChlorineSpawnRate;
	public static int oreSkyiumSpawnRate;
	public static int skyCastleSpawnRate1;
	public static int skyCastleSpawnRate2;
	public static int skyCastleSpawnRate3;
	public static int lightBiomeID;
	public static int dimensionLightID;
	public static int meteroiteChance;
	public static int oreZogiteSpawnRate;
	public static int oreRaditeSpawnRate;
	public static int oreLightDiamond;
	public static int oreLightRedstone;
	public static int oreLightEmerald;
	public static int oreLightLapis;
	public static int oreLightIron;
	public static int oreLightGold;
	public static int oreStariaLightD;
	public static int potionBarrierID;
	public static boolean butterIsYellorite;
	public static int oreFoolStaria;
	public static int oreLightStaria;
	public static int angelFortress1;
	public static int angelFortress2;
	public static int oreLightCopper;
	public static int oreLightNickel;
	public static int oreLightTin;
	public static int oreLightPlatnium;
	public static int oreLightSilver;
	public static int oreLightLead;
	public static int redGlow;
	
	public static Configuration config;
	
	public static void init(FMLPreInitializationEvent event) {
		config = new Configuration(
				new File(event.getModConfigurationDirectory().getAbsolutePath()
						+ "/ZaneExtras/ZaneExtras.cfg"));
		config.load();
		
		// shit goes here
		config.addCustomCategoryComment(CATEGORY_ORES,
				"Change the spawn Rate of Ores here. Chance is determined out of 100"
						+ System.lineSeparator() + "Ore Default Values:"
						+ System.lineSeparator() + "Zanium: 3"
						+ System.lineSeparator() + "Staria: 5"
						+ System.lineSeparator() + "Sodium: 16"
						+ System.lineSeparator() + "Butter: 8"
						+ System.lineSeparator() + "Skyium: 1"
						+ System.lineSeparator() + "Zogite: 7"
						+ System.lineSeparator() + "Radite: 7"
						+ System.lineSeparator() + "Light Diamond: 6"
						+ System.lineSeparator() + "Light Redstone: 7"
						+ System.lineSeparator() + "Light Iron: 10"
						+ System.lineSeparator() + "Light Gold: 7"
						+ System.lineSeparator() + "Light Lapis: 7"
						+ System.lineSeparator() + "Light Emerald: 4"
						+ System.lineSeparator() + "Light Staria: 2"
						+ System.lineSeparator() + "Light Ferrous: 4"
						+ System.lineSeparator() + "Light Copper: 10"
						+ System.lineSeparator() + "Light Tin: 10"
						+ System.lineSeparator() + "Light Silver: 5"
						+ System.lineSeparator() + "Light Lead: 7"
						+ System.lineSeparator() + "Light Platnium: 3"
						+ System.lineSeparator() + System.lineSeparator()
						+ "Red Glow: 33" + System.lineSeparator()
						+ "Staria in Light Dimension: 5");
		config.addCustomCategoryComment(CATEGORY_CROPS,
				"Change the spawn Rate of Crops here. Chance is determined out of 200"
						+ System.lineSeparator()
						+ "Regular Crops Default Value: 5"
						+ System.lineSeparator()
						+ "Nether Crop Defualt Value: 5");
		config.addCustomCategoryComment(CATEGORY_LIQUIDS,
				"Change the spawn Rate of Liquids here. Must be less than 125 or it WILL break!"
						+ System.lineSeparator() + "Chlorine Defualt Value: 10"
						+ System.lineSeparator() + "Acid Default Value: 10");
		config.addCustomCategoryComment(CATEGORY_STRUCTURES,
				"Change the spawn Rate of Structures here. Spawn rate 2 MUST BE less than Spawn rate 3 or it will BREAK!"
						+ System.lineSeparator()
						+ "Spawn Rate 1 Defualt Value: 100"
						+ System.lineSeparator()
						+ "Spawn Rate 2 Default Value: 7"
						+ System.lineSeparator()
						+ "Spawn Rate 3 Default Value: 100"
						+ System.lineSeparator()
						+ "Meteroite Spawn Rate Default Value: 5"
						+ System.lineSeparator()
						+ "Angel Fortress Spawn Rate 1 Default Value: 2"
						+ System.lineSeparator()
						+ "Angel Fortress Spawn Rate 2 Default Value: 3000");
		config.addCustomCategoryComment(CATEGORY_BIOMES,
				"Change the IDs of Biomes and thier Spawn Rates Here"
						+ System.lineSeparator());
		config.addCustomCategoryComment(CATEGORY_DIMENSIONS,
				"Change the dimension ID here in case of conflicts"
						+ System.lineSeparator()
						+ "Promise Land Defualt Value: 201"
						+ System.lineSeparator()
						+ "Light Biome Defualt Value: 201");
		config.addCustomCategoryComment(CATEGORY_POTIONS,
				"Change the Potion IDS here" + System.lineSeparator()
						+ "Barrier Potion ID(26 By Default):");
		config.addCustomCategoryComment(CATEGORY_OPTIONS,
				"Toggle different options here for different things"
						+ System.lineSeparator()
						+ "Turn Damn Hard Butter into fuel");
		
		// Biome IDs
		lightBiomeID = config.get(CATEGORY_BIOMES, "lightBiomeID", 200)
				.getInt();
		
		// Dimension IDs
		dimensionLightID = config
				.get(CATEGORY_DIMENSIONS, "dimensionLightID", 201).getInt();
		
		// Ore Spawn Rates
		oreZaniumSpawnRate = config.get(CATEGORY_ORES, "oreZaniumSpawnRate", 3)
				.getInt();
		oreButterSpawnRate = config.get(CATEGORY_ORES, "oreButterSpawnRate", 8)
				.getInt();
		oreSodiumSpawnRate = config.get(CATEGORY_ORES, "oreSodiumSpawnRate", 16)
				.getInt();
		oreStariaSpawnRate = config.get(CATEGORY_ORES, "oreStariaSpawnRate", 2)
				.getInt();
		oreSkyiumSpawnRate = config.get(CATEGORY_ORES, "oreSkyiumSpawnRate", 1)
				.getInt();
		oreZogiteSpawnRate = config.get(CATEGORY_ORES, "oreZogiteSpawnRate", 10)
				.getInt();
		oreRaditeSpawnRate = config.get(CATEGORY_ORES, "oreRaditeSpawnRate", 10)
				.getInt();
		oreLightDiamond = config.get(CATEGORY_ORES, "lightDiamond", 6).getInt();
		oreLightRedstone = config.get(CATEGORY_ORES, "lightRedstone", 7)
				.getInt();
		oreLightIron = config.get(CATEGORY_ORES, "lightIron", 10).getInt();
		oreLightGold = config.get(CATEGORY_ORES, "lightGold", 7).getInt();
		oreLightLapis = config.get(CATEGORY_ORES, "lightLapis", 7).getInt();
		oreLightEmerald = config.get(CATEGORY_ORES, "lightEmerald", 4).getInt();
		oreLightStaria = config.get(CATEGORY_ORES, "lightStaria", 5).getInt();
		oreFoolStaria = config.get(CATEGORY_ORES, "oreFoolStaria", 8).getInt();
		redGlow = config.get(CATEGORY_ORES, "redGlow", 33).getInt();
		
		/*
		 * if (ModHelper.useThermalFoundation) { oreLightNickel
		 * config.get(CATEGORY_ORES, "oreLightNickel", 4) .getInt();
		 * oreLightCopper = config.get(CATEGORY_ORES, "oreLightCopper", 10)
		 * .getInt(); oreLightTin = config.get(CATEGORY_ORES, "oreLightTin",
		 * 10).getInt(); oreLightSilver = config.get(CATEGORY_ORES,
		 * "oreLightSilver", 5) .getInt(); oreLightLead =
		 * config.get(CATEGORY_ORES, "oreLightLead", 7) .getInt();
		 * oreLightPlatnium = config.get(CATEGORY_ORES, "oreLightPlatnium", 3)
		 * .getInt(); }
		 */
		
		// Crop Spawn Rates
		cropSpawnRate = config.get(CATEGORY_CROPS, "cropSpawnRate", 5).getInt();
		cropSpawnRateNether = config
				.get(CATEGORY_CROPS, "cropSpawnRateNether", 5).getInt();
		
		// Liquid Spawn Rate
		liquidAcidSpawnRate = config
				.get(CATEGORY_LIQUIDS, "liquidAcidSpawnRate", 10).getInt();
		liquidChlorineSpawnRate = config
				.get(CATEGORY_LIQUIDS, "liquidChlorineSpawnRate", 10).getInt();
		
		// Structures Spawn Rates
		skyCastleSpawnRate1 = config
				.get(CATEGORY_STRUCTURES, "skyCasteSpawnRate1", 100).getInt();
		skyCastleSpawnRate2 = config
				.get(CATEGORY_STRUCTURES, "skyCasteSpawnRate2", 1).getInt();
		skyCastleSpawnRate3 = config
				.get(CATEGORY_STRUCTURES, "skyCasteSpawnRate3", 100).getInt();
		meteroiteChance = config.get(CATEGORY_STRUCTURES, "meteroiteChance", 5)
				.getInt();
		angelFortress1 = config.get(CATEGORY_STRUCTURES, "angelFortress1", 2)
				.getInt();
		angelFortress2 = config.get(CATEGORY_STRUCTURES, "angelFortress2", 3000)
				.getInt();
		
		// Potions IDs
		potionBarrierID = config.get(CATEGORY_POTIONS, "potionBarrierID", 26)
				.getInt();
		
		// Toggle butter to fuel
		butterIsYellorite = config
				.get(CATEGORY_OPTIONS, "butterIsYellorite", false).getBoolean();
		
		config.save();
	}
	
}