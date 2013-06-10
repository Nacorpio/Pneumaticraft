package Pneumaticraft.mods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import Pneumaticraft.mods.proxies.PneumaticraftCommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;





@Mod(modid="Pneumaticraft", name="Pneumaticraft",version="0.0.9" )
@NetworkMod(clientSideRequired=true,  serverSideRequired = false)
public class Pneumaticraft {
	public static final String modid = "Pneumaticraft";
	@Instance("Pneumaticraft")
	public static Pneumaticraft instance;
	
	@SidedProxy(clientSide="Pneumaticraft.mods.proxies.PneumaticraftClientProxy", serverSide="Pneumaticraft.mods.proxies.PneumaticraftCommonProxy")
	public static PneumaticraftCommonProxy proxy;
	
	public static BiomeGenBase pneumansionBiome;
	
	//Items
	
	
	public static Item LithiumIngot;
	public int LitiumIngotID = 1500;
	
	public static ItemPneumaticraft berliniumIngot;
	public int berliniumIngotID = 1501;
	
	public static ItemPneumaticraft GalliumIngot;
	public int GalliumIngotID = 1502;
	
	public static ItemPneumaticraft RadiumIngot;
	public int RadiumIngotID = 1503;
	
	public static ItemPneumaticraft BromineIngot;
	public int BromineIngotID = 1504;
	
	public static ItemPneumaticraft RadonIngot;
	public int RadonIngotID = 1505;
	//123456
	public static ItemPneumaticraft XenonIngot;
	public int XenonIngotID = 1506;
	//LithiumIngot,BerliniumIngot
	
	
	public static ItemPneumaticraft Radiumchunk;
	public int RadiumchunkID = 1507;
	
	public static ItemPneumaticraft RadiumCrystal;
	public int RadiumCrystalID = 1508;
	
	public static ItemPneumaticraft SiliconBall;
	public int SiliconBallID = 1509;
	
	public static ItemPneumaticraft Siliconpowder;
	public int SiliconpowderID = 1510;
	
	public static ItemPneumaticraft SiliconRawBall;
	public int SiliconRawBallID = 15011;
	

	
	//Blocks
	
	public static BlockPneumaticraft BonyteOre;
	public int BonyteOreID = 1512;
	
	public static BlockPneumaticraft LithiumOre;
	public int LithiumOreID = 1513;
	
	public static Block RadiumOre;
	public int RadiumOreID = 1514;
	
	public static BlockPneumaticraft RadonOre;
	public int RadonOreID = 1515;
	
	public static Block SiliconOre;
	public int SiliconOreID = 1543;
	
	public static BlockPneumaticraft XenonOre;
	public int XenonOreID = 1516;
	
	public static BlockPneumaticraft berliniumBrick;
	public int berliniumBrickID = 1517;
	
	public static BlockPneumaticraft bromineBrick;
	public int bromineBrickID = 1544;
	
	public static BlockPneumaticraft galliumBrick;
	public int galliumBrickID = 1518;
	
	public static BlockPneumaticraft litiumBrick;
	public int litiumBrickID = 1519;
	
	public static BlockPneumaticraft radiumBrick;
	public int radiumBrickID = 1520;
	
	public static BlockPneumaticraft radonBrick;
	public int radonBrickID = 1521;
	
	public static BlockPneumaticraft xenonBrick;
	public int xenonBrickID = 1522;
	
	public static BlockPneumaticraft berliniumBlock;
	public int berliniumBlockID = 1523;
	
	public static BlockPneumaticraft bromineBlock;
	public int bromineBlockID = 1524; 
	
	public static BlockPneumaticraft galliumBlock;
	public int galliumBlockID = 1525;
	
	public static BlockPneumaticraft litiumBlock;
	public int litiumBlockID = 1526;
	
	public static BlockPneumaticraft radiumBlock;
	public int radiumBlockID = 1527;
	
	public static BlockPneumaticraft radonBlock;
	public int radonBlockID = 1528;
	
	public static BlockPneumaticraft xenonBlock;
	public int xenonBlockID = 1529;
	
	public static BlockPneumaticraft berliniumBrickCarved;
	public int berliniumBrickCarvedID = 1530;
	
	public static BlockPneumaticraft bromineBrickCarved;
	public int bromineBrickCarvedID = 1531;
	
	public static BlockPneumaticraft galliumBrickCarved;
	public int galliumBrickCarvedID = 1532;
	
	public static BlockPneumaticraft litiumBrickCarved;
	public int litiumBrickCarvedID = 1533;
	
	public static BlockPneumaticraft radiumBrickCarved;
	public int radiumBrickCarvedID = 1534;
	
	public static BlockPneumaticraft radonBrickCarved;
	public int radonBrickCarvedID = 1535;
	
	public static BlockPneumaticraft xenonBrickCarved;
	public int xenonBrickCarvedID = 1536;
	
	public static  Block pneumansionPortal;
	public int portalID=1537;
	
	public static Block eternalPowerSource;
	public int eternalPowerSourceID= 1538;

	public static BlockPneumaticraft BerliniumOre;
	public int BerliniumOreID = 1539;

	public static BlockPneumaticraft BromineOre;
	public int BromineOreID = 1540;
	
	public static BlockPneumaticraft GalliumOre;
	public int GalliumOreID = 1541;
	
	public static Block eternalPowerConduit;
	public int eternalPowerConduitID = 1542;
	
	//last ID: 1545
	//Tools,Weapons & Armor
	//Spade
	//Radium,Gallium,Berlinium,Bromine,Lithium,Radon,Xenon
	public static Item RadiumSpade,GalliumSpade,BerliniumSpade,BromineSpade,LithiumSpade,RadonSpade,XenonSpade;
	public int RadiumSpadeID = 1550;
	public int GalliumSpadeID = 1551;
	public int BerliniumSpadeID = 1552;
	public int BromineSpadeID = 1553;
	public int LithiumSpadeID = 1554;
	public int RadonSpadeID = 1555;
	public int XenonSpadeID = 1556;
	
	//Pickaxe
	public static Item RadiumPickaxe,GalliumPickaxe,BerliniumPickaxe,BrominePickaxe,LithiumPickaxe,RadonPickaxe,XenonPickaxe;
	public int RadiumPickaxeID = 1557;
	public int GalliumPickaxeID = 1558;
	public int BerliniumPickaxeID = 1559;
	public int BrominePickaxeID = 1560;
	public int LithiumPickaxeID = 1561;
	public int RadonPickaxeID = 1562;
	public int XenonPickaxeID = 1563;
	
	//Axe
	public static Item RadiumAxe,GalliumAxe,BerliniumAxe,BromineAxe,LithiumAxe,RadonAxe,XenonAxe;
	public int RadiumAxeID = 1564;
	public int GalliumAxeID = 1565;
	public int BerliniumAxeID = 1566;
	public int BromineAxeID = 1567;
	public int LithiumAxeID = 1568;
	public int RadonAxeID = 1569;
	public int XenonAxeID = 1570;
	
	//Hoes
	public static Item RadiumHoe,GalliumHoe,BerliniumHoe,BromineHoe,LithiumHoe,RadonHoe,XenonHoe;
	public int RadiumHoeID = 1571;
	public int GalliumHoeID = 1572;
	public int BerliniumHoeID = 1573;
	public int BromineHoeID = 1574;
	public int LithiumHoeID = 1575;
	public int RadonHoeID = 1576;
	public int XenonHoeID = 1577;
	
	//Swords
	public static Item RadiumSword,GalliumSword,BerliniumSword,BromineSword,LithiumSword,RadonSword,XenonSword;
	public int RadiumSwordID = 1578;
	public int GalliumSwordID = 1579;
	public int BerliniumSwordID = 1580;
	public int BromineSwordID = 1581;
	public int LithiumSwordID = 1582;
	public int RadonSwordID = 1583;
	public int XenonSwordID = 1584;
	
	//Armors
	//Radium armor
	public static Item RadiumHelmet,RadiumChestplate,RadiumLeggins,RadiumBoots;
	public int RadiumHelmetID = 1585;
	public int RadiumChestplateID = 1586;
	public int RadiumLegginsID = 1587;
	public int RadiumBootsID = 1588;
	//Gallium armor
	public static Item GalliumHelmet,GalliumChestplate,GalliumLeggins,GalliumBoots;
	public int GalliumHelmetID = 1589;
	public int GalliumChestplateID = 1590;
	public int GalliumLegginsID = 1591;
	public int GalliumBootsID = 1592;
	//Berlinium armor
	public static Item BerliniumHelmet,BerliniumChestplate,BerliniumLeggins,BerliniumBoots;
	public int BerliniumHelmetID = 1593;
	public int BerliniumChestplateID = 1594;
	public int BerliniumLegginsID = 1595;
	public int BerliniumBootsID = 1596;
	//Bromine armor
	public static Item BromineHelmet,BromineChestplate,BromineLeggins,BromineBoots;
	public int BromineHelmetID = 1597;
	public int BromineChestplateID = 1598;
	public int BromineLegginsID = 1599;
	public int BromineBootsID = 1600;
	//Lithium armor
	public static Item LithiumHelmet,LithiumChestplate,LithiumLeggins,LithiumBoots;
	public int LithiumHelmetID = 1601;
	public int LithiumChestplateID = 1602;
	public int LithiumLegginsID = 1603;
	public int LithiumBootsID = 1604;
	//Radon armor
	public static Item RadonHelmet,RadonChestplate,RadonLeggins,RadonBoots;
	public int RadonHelmetID = 1615;
	public int RadonChestplateID = 1606;
	public int RadonLegginsID = 1607;
	public int RadonBootsID = 1608;
	//Xenon armor
	public static Item XenonHelmet,XenonChestplate,XenonLeggins,XenonBoots;
	public int XenonHelmetID = 1609;
	public int XenonChestplateID = 1610;
	public int XenonLegginsID = 1611;
	public int XenonBootsID = 1612;
	
	public static Item PowerVoid;
	public int PowerVoidID = 1613;
	//last ID: 1613; next ID tu use : 1614 and plus
	
	//Dimension stuff
	public static int dimension = 2;
	
	

	
	
	//-------------------------------------------	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		
		
	}
	@Init
	public void load(FMLInitializationEvent event){
		for(int i = 0; i<1 ; i++){
		System.out.println("Pneumaticraft is Loaded ! :D ") ;
		
		
		GameRegistry.registerWorldGenerator(new Worldgen());
		
		
	}
		
		
		
		//Items
		LithiumIngot = (ItemPneumaticraft) new  ItemPneumaticraft(LitiumIngotID).setUnlocalizedName("LitiumIngot").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64);
		((ItemPneumaticraft) LithiumIngot).setIconFile("Pneumaticraft:LitiumIngot");
		
		GalliumIngot = (ItemPneumaticraft) new ItemPneumaticraft(GalliumIngotID).setUnlocalizedName("GalliumIngot").setCreativeTab(CreativeTabs.tabMaterials);
		GalliumIngot.setIconFile("Pneumaticraft:GalliumIngot");
		
		berliniumIngot = (ItemPneumaticraft) new ItemPneumaticraft(berliniumIngotID).setUnlocalizedName("berliniumIngot").setCreativeTab(CreativeTabs.tabMaterials);
		berliniumIngot.setIconFile("Pneumaticraft:berliniumIngot");
		
		RadiumIngot = (ItemPneumaticraft) new ItemPneumaticraft(RadiumIngotID).setUnlocalizedName("RadiumIngot").setCreativeTab(CreativeTabs.tabMaterials);
		RadiumIngot.setIconFile("Pneumaticraft:RadiumIngot");
		
		BromineIngot = (ItemPneumaticraft) new ItemPneumaticraft(BromineIngotID).setUnlocalizedName("BromineIngot").setCreativeTab(CreativeTabs.tabMaterials);
		BromineIngot.setIconFile("Pneumaticraft:BromineIngot");
		
		RadonIngot = (ItemPneumaticraft) new ItemPneumaticraft(RadonIngotID).setUnlocalizedName("RadonIngot").setCreativeTab(CreativeTabs.tabMaterials);
		RadonIngot.setIconFile("Pneumaticraft:RadonIngot");
		
		XenonIngot = (ItemPneumaticraft) new ItemPneumaticraft(XenonIngotID).setUnlocalizedName("XenonIngot").setCreativeTab(CreativeTabs.tabMaterials);
		XenonIngot.setIconFile("Pneumaticraft:XenonIngot");
		
		Radiumchunk = (ItemPneumaticraft) new ItemPneumaticraft(RadiumchunkID).setUnlocalizedName("Radiumchunk").setCreativeTab(CreativeTabs.tabMaterials);
		Radiumchunk.setIconFile("Pneumaticraft:Radiumchunk");
		
		RadiumCrystal = (ItemPneumaticraft) new ItemPneumaticraft(RadiumCrystalID).setUnlocalizedName("RadiumCrystal").setCreativeTab(CreativeTabs.tabMaterials);
		RadiumCrystal.setIconFile("Pneumaticraft:RadiumCrystal");
		
		SiliconBall = (ItemPneumaticraft) new ItemPneumaticraft(SiliconBallID).setUnlocalizedName("SiliconBall").setCreativeTab(CreativeTabs.tabMaterials);
		SiliconBall.setIconFile("Pneumaticraft:SiliconBall");
		
		Siliconpowder = (ItemPneumaticraft) new ItemPneumaticraft(SiliconpowderID).setUnlocalizedName("Siliconpowder").setCreativeTab(CreativeTabs.tabMaterials);
		Siliconpowder.setIconFile("Pneumaticraft:Siliconpowder");
		
		SiliconRawBall = (ItemPneumaticraft) new ItemPneumaticraft(SiliconRawBallID).setUnlocalizedName("SiliconRawBall").setCreativeTab(CreativeTabs.tabMaterials);
		SiliconRawBall.setIconFile("Pneumaticraft:RawSiliconBall");
		
		
		
		
		//Blocks
		
		LithiumOre = (BlockPneumaticraft) new BlockPneumaticraft(LithiumOreID, Material.iron).setUnlocalizedName("LithiumOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		LithiumOre.setIconFile("Pneumaticraft:LithiumOre");
		
		BonyteOre = (BlockPneumaticraft) new BlockPneumaticraft(BonyteOreID, Material.iron).setUnlocalizedName("BonyteOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		BonyteOre.setIconFile("Pneumaticraft:BonyteOre");
	
		RadiumOre =  new BlockRadiumOre(RadiumOreID, Material.iron).setUnlocalizedName("RadiumOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		
		
		RadonOre = (BlockPneumaticraft) new BlockPneumaticraft(RadonOreID, Material.iron).setUnlocalizedName("RadonOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		RadonOre.setIconFile("Pneumaticraft:RadonOre");
		
		SiliconOre = new BlockSiliconOre(SiliconOreID, Material.iron).setUnlocalizedName("SiliconOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		
		
		BerliniumOre= (BlockPneumaticraft) new BlockPneumaticraft(BerliniumOreID, Material.iron).setUnlocalizedName("BerliniumOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		BerliniumOre.setIconFile("Pneumaticraft:BerliniumOre");
		
		BromineOre = (BlockPneumaticraft) new BlockPneumaticraft(BromineOreID,Material.iron);
		BromineOre.setIconFile("Pneumaticraft:BromineOre");
		
		GalliumOre = (BlockPneumaticraft) new BlockPneumaticraft(GalliumOreID,Material.iron);
		GalliumOre.setIconFile("Pneumaticraft:GalliumOre");
		
		XenonOre = (BlockPneumaticraft) new BlockPneumaticraft(XenonOreID, Material.iron).setUnlocalizedName("XenonOre").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		XenonOre.setIconFile("Pneumaticraft:XenonOre");
		
		berliniumBrick = (BlockPneumaticraft) new BlockPneumaticraft(berliniumBrickID, Material.iron).setUnlocalizedName("berliniumBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		berliniumBrick.setIconFile("Pneumaticraft:berliniumBrick");
		
		bromineBrick = (BlockPneumaticraft) new BlockPneumaticraft(bromineBrickID, Material.iron).setUnlocalizedName("bromineBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		bromineBrick.setIconFile("Pneumaticraft:bromineBrick");
		
		galliumBrick = (BlockPneumaticraft) new BlockPneumaticraft(galliumBrickID, Material.iron).setUnlocalizedName("galliumBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		galliumBrick.setIconFile("Pneumaticraft:galliumBrick");
		
		litiumBrick = (BlockPneumaticraft) new BlockPneumaticraft(litiumBrickID, Material.iron).setUnlocalizedName("litiumBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		litiumBrick.setIconFile("Pneumaticraft:litiumBrick");
		
		radiumBrick = (BlockPneumaticraft) new BlockPneumaticraft(radiumBrickID, Material.iron).setUnlocalizedName("radiumBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		radiumBrick.setIconFile("Pneumaticraft:radiumBrick");
		
		radonBrick = (BlockPneumaticraft) new BlockPneumaticraft(radonBrickID, Material.iron).setUnlocalizedName("radonBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		radonBrick.setIconFile("Pneumaticraft:radonBrick");
		
		xenonBrick = (BlockPneumaticraft) new BlockPneumaticraft(xenonBrickID, Material.iron).setUnlocalizedName("xenonBrick").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		xenonBrick.setIconFile("Pneumaticraft:xenonBrick");
		
		berliniumBlock = (BlockPneumaticraft) new BlockPneumaticraft(berliniumBlockID, Material.iron).setUnlocalizedName("berliniumBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		berliniumBlock.setIconFile("Pneumaticraft:berliniumBlock");
		
		bromineBlock = (BlockPneumaticraft) new BlockPneumaticraft(bromineBlockID, Material.iron).setUnlocalizedName("bromineBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		bromineBlock.setIconFile("Pneumaticraft:bromineBlock");
		
		galliumBlock = (BlockPneumaticraft) new BlockPneumaticraft(galliumBlockID, Material.iron).setUnlocalizedName("galliumBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		galliumBlock.setIconFile("Pneumaticraft:galliumBlock");
		
		litiumBlock = (BlockPneumaticraft) new BlockPneumaticraft(litiumBlockID, Material.iron).setUnlocalizedName("litiumBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		litiumBlock.setIconFile("Pneumaticraft:litiumBlock");
		
		radiumBlock = (BlockPneumaticraft) new BlockPneumaticraft(radiumBlockID, Material.iron).setUnlocalizedName("radiumBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		radiumBlock.setIconFile("Pneumaticraft:radiumBlock");
		
		radonBlock = (BlockPneumaticraft) new BlockPneumaticraft(radonBlockID, Material.iron).setUnlocalizedName("radonBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		radonBlock.setIconFile("Pneumaticraft:radonBlock");
		
		xenonBlock = (BlockPneumaticraft) new BlockPneumaticraft(xenonBlockID, Material.iron).setUnlocalizedName("xenonBlock").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		xenonBlock.setIconFile("Pneumaticraft:xenonBlock");
		
		berliniumBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(berliniumBrickCarvedID, Material.iron).setUnlocalizedName("berliniumBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		berliniumBrickCarved.setIconFile("Pneumaticraft:berliniumBrickCarved");
		
		bromineBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(bromineBrickCarvedID, Material.iron).setUnlocalizedName("bromineBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		bromineBrickCarved.setIconFile("Pneumaticraft:bromineBrickCarved");
		
		galliumBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(galliumBrickCarvedID, Material.iron).setUnlocalizedName("galliumBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		galliumBrickCarved.setIconFile("Pneumaticraft:galliumBrickCarved");
		
		litiumBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(litiumBrickCarvedID, Material.iron).setUnlocalizedName("litiumBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		litiumBrickCarved.setIconFile("Pneumaticraft:litiumBrickCarved");
		
		radiumBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(radiumBrickCarvedID, Material.iron).setUnlocalizedName("radiumBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		radiumBrickCarved.setIconFile("Pneumaticraft:radiumBrickCarved");
		
		radonBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(radonBrickCarvedID, Material.iron).setUnlocalizedName("radonBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		radonBrickCarved.setIconFile("Pneumaticraft:radonBrickCarved");
		
		xenonBrickCarved = (BlockPneumaticraft) new BlockPneumaticraft(xenonBrickCarvedID, Material.iron).setUnlocalizedName("xenonBrickCarved").setCreativeTab(CreativeTabs.tabBlock).setLightValue(0.2F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(5.0F);
		xenonBrickCarved.setIconFile("Pneumaticraft:xenonBrickCarved");
		
		pneumansionPortal = new BlockPneumansionPortal(portalID).setUnlocalizedName("portal").setCreativeTab(CreativeTabs.tabBlock);
		
		eternalPowerSource = new BlockEternalPowerSource(eternalPowerSourceID, Material.fire).setUnlocalizedName("eternalPowerSource").setLightValue(1.0F);
		
		eternalPowerConduit = new BlockEternalPowerConduit(eternalPowerConduitID, Material.iron).setUnlocalizedName("eternalPowerConduit").setCreativeTab(CreativeTabs.tabBlock);
		//Tools,Weapons & Armor
		//Radium,Gallium,Berlinium,Bromine,Lithium,Radon,Xenon
		//Pickaxe
		RadiumPickaxe = new ItemPickaxes(RadiumPickaxeID, toolRadium, "RadiumPickaxe").setUnlocalizedName("RadiumPickaxe");
		GalliumPickaxe = new ItemPickaxes(GalliumPickaxeID, toolGallium, "GalliumPickaxe").setUnlocalizedName("GalliumPickaxe");
		BerliniumPickaxe = new ItemPickaxes(BerliniumPickaxeID, toolBerlinium, "BerliniumPickaxe").setUnlocalizedName("BerliniumPickaxe");
		BrominePickaxe = new ItemPickaxes(BrominePickaxeID, toolBromine, "BrominePickaxe").setUnlocalizedName("BrominePickaxe");
		LithiumPickaxe = new ItemPickaxes(LithiumPickaxeID, toolLithium, "LithiumPickaxe").setUnlocalizedName("LithiumPickaxe");
		RadonPickaxe = new ItemPickaxes(RadonPickaxeID, toolRadon, "RadonPickaxe").setUnlocalizedName("RadonPickaxe");
		XenonPickaxe = new ItemPickaxes(XenonPickaxeID, toolXenon, "XenonPickaxe").setUnlocalizedName("XenonPickaxe");
		
		//Spades
		RadiumSpade = new ItemSpades(RadiumSpadeID, toolRadium, "RadiumShovel").setUnlocalizedName("RadiumShovel");
		GalliumSpade = new ItemSpades(GalliumSpadeID, toolGallium, "GalliumShovel").setUnlocalizedName("GalliumShovel");
		BerliniumSpade = new ItemSpades(BerliniumSpadeID, toolBerlinium, "BerliniumShovel").setUnlocalizedName("BerliniumShovel");
		BromineSpade = new ItemSpades(BromineSpadeID, toolBromine, "BromineShovel").setUnlocalizedName("BromineShovel");
		LithiumSpade = new ItemSpades(LithiumSpadeID, toolLithium, "LithiumShovel").setUnlocalizedName("LithiumShovel");
		RadonSpade = new ItemSpades(RadonSpadeID, toolRadon, "RadonShovel").setUnlocalizedName("RadonShovel");
		XenonSpade = new ItemSpades(XenonSpadeID, toolXenon, "XenonShovel").setUnlocalizedName("XenonShovel");
		
		//Axes
		RadiumAxe = new ItemAxes(RadiumAxeID, toolRadium, "RadiumAxe").setUnlocalizedName("RadiumAxe");
		GalliumAxe = new ItemAxes(GalliumAxeID, toolGallium, "GalliumAxe").setUnlocalizedName("GalliumAxe");
		BerliniumAxe = new ItemAxes(BerliniumAxeID, toolBerlinium, "BerliniumAxe").setUnlocalizedName("BerliniumAxe");
		BromineAxe = new ItemAxes(BromineAxeID, toolBromine, "BromineAxe").setUnlocalizedName("BromineAxe");
		LithiumAxe = new ItemAxes(LithiumAxeID, toolLithium, "LithiumAxe").setUnlocalizedName("LithiumAxe");
		RadonAxe = new ItemAxes(RadonAxeID, toolRadon, "RadonAxe").setUnlocalizedName("RadonAxe");
		XenonAxe = new ItemAxes(XenonAxeID, toolXenon, "XenonAxe").setUnlocalizedName("XenonAxe");
		
		//Hoes
		RadiumHoe = new ItemHoes(RadiumHoeID, toolRadium, "RadiumHoe").setUnlocalizedName("RadiumHoe");
		GalliumHoe = new ItemHoes(GalliumHoeID, toolGallium, "GalliumHoe").setUnlocalizedName("GalliumHoe");
		BerliniumHoe = new ItemHoes(BerliniumHoeID, toolBerlinium, "BerliniumHoe").setUnlocalizedName("BerliniumHoe");
		LithiumHoe = new ItemHoes(LithiumHoeID, toolLithium, "LithiumHoe").setUnlocalizedName("LithiumHoe");
		BromineHoe = new ItemHoes(BromineHoeID, toolBromine, "BromineHoe").setUnlocalizedName("BromineHoe");
		RadonHoe = new ItemHoes(RadonHoeID, toolRadon, "RadonHoe").setUnlocalizedName("RadonHoe");
		XenonHoe = new ItemHoes(XenonHoeID, toolXenon, "XenonHoe").setUnlocalizedName("XenonHoe");
		
		//Swords
		RadiumSword = new ItemSwords(RadiumSwordID, toolRadium, "RadiumSword").setUnlocalizedName("RadiumSword");
		GalliumSword = new ItemSwords(GalliumSwordID, toolGallium, "GalliumSword").setUnlocalizedName("GalliumSword");
		BerliniumSword = new ItemSwords(BerliniumSwordID, toolBerlinium, "BerliniumSword").setUnlocalizedName("BerliniumSword");
		BromineSword = new ItemSwords(BromineSwordID, toolBromine, "BromineSword").setUnlocalizedName("BromineSword");
		LithiumSword = new ItemSwords(LithiumSwordID, toolLithium, "LithiumSword").setUnlocalizedName("LithiumSword");
		RadonSword = new ItemSwords(RadonSwordID, toolRadon, "RadonSword").setUnlocalizedName("RadonSword");
		XenonSword = new ItemSwords(XenonSwordID, toolXenon, "XenonSword").setUnlocalizedName("XenonSword");
		
		PowerVoid = new ItemPowerVoid(PowerVoidID).setUnlocalizedName("Power Void").setCreativeTab(CreativeTabs.tabTools);
		//RadiumHelmet = new ItemRadiumHelmet(RadiumHelmetID, armorRadium, ModLoader.addArmor("radium"), 0).setUnlocalizedName("RadiumHelmet");
		//RadiumBoots = new ItemRadiumBoots(RadiumBootsID, armorRadium, ModLoader.addArmor("radium"), 3).setUnlocalizedName("RadiumBoots");
		//RadiumChestplate = new ItemRadiumChestplate(RadiumChestplateID,  armorRadium, ModLoader.addArmor("radium"), 1).setUnlocalizedName("RadiumChestplate");
		//RadiumLeggins = new ItemRadiumLeggins(RadiumLegginsID, armorRadium, ModLoader.addArmor("radium"), 2).setUnlocalizedName("RadiumLeggins");
		//Armors
		//Radium
		String armor = "radium";
		RadiumHelmet = new ItemArmors(RadiumHelmetID, armorRadium, ModLoader.addArmor(armor), 0, "RadiumHelmet", armor).setUnlocalizedName("RadiumHelmet");
		RadiumChestplate = new ItemArmors(RadiumChestplateID,  armorRadium, ModLoader.addArmor(armor), 1, "RadiumChestplate", armor).setUnlocalizedName("RadiumChestplate");
		RadiumLeggins = new ItemArmors(RadiumLegginsID, armorRadium, ModLoader.addArmor(armor), 2, "RadiumLeggins", armor).setUnlocalizedName("RadiumLeggins");
		RadiumBoots = new ItemArmors(RadiumBootsID, armorRadium, ModLoader.addArmor(armor), 3, "RadiumBoots", armor).setUnlocalizedName("RadiumBoots");

		//Gallium
		String armor2 = "gallium";
		GalliumHelmet = new ItemArmors(GalliumHelmetID, armorGallium, ModLoader.addArmor(armor2), 0, "GalliumHelmet", armor2).setUnlocalizedName("GalliumHelmet");
		GalliumChestplate = new ItemArmors(GalliumChestplateID,  armorGallium, ModLoader.addArmor(armor2), 1, "GalliumChestplate", armor2).setUnlocalizedName("GalliumChestplate");
		GalliumLeggins = new ItemArmors(GalliumLegginsID, armorGallium, ModLoader.addArmor(armor2), 2, "GalliumLeggins", armor2).setUnlocalizedName("GalliumLeggins");
		GalliumBoots = new ItemArmors(GalliumBootsID, armorGallium, ModLoader.addArmor(armor2), 3, "GalliumBoots", armor2).setUnlocalizedName("GalliumBoots");

		//Berlinium
		String armor3 = "berlinium";
		BerliniumHelmet = new ItemArmors(BerliniumHelmetID, armorBerlinium, ModLoader.addArmor(armor3), 0, "BerliniumHelmet", armor3).setUnlocalizedName("BerliniumHelmet");
		BerliniumChestplate = new ItemArmors(BerliniumChestplateID,  armorBerlinium, ModLoader.addArmor(armor3), 1, "BerliniumChestplate", armor3).setUnlocalizedName("BerliniumChestplate");
		BerliniumLeggins = new ItemArmors(BerliniumLegginsID, armorBerlinium, ModLoader.addArmor(armor3), 2, "BerliniumLeggins", armor3).setUnlocalizedName("BerliniumLeggins");
		BerliniumBoots = new ItemArmors(BerliniumBootsID, armorBerlinium, ModLoader.addArmor(armor3), 3, "BerliniumBoots", armor3).setUnlocalizedName("BerliniumBoots");

		//Lithium
		String armor4 = "lithium";
		LithiumHelmet = new ItemArmors(LithiumHelmetID, armorLithium, ModLoader.addArmor(armor4), 0, "LithiumHelmet", armor4).setUnlocalizedName("LithiumHelmet");
		LithiumChestplate = new ItemArmors(LithiumChestplateID,  armorLithium, ModLoader.addArmor(armor4), 1, "LithiumChestplate", armor4).setUnlocalizedName("LithiumChestplate");
		LithiumLeggins = new ItemArmors(LithiumLegginsID, armorLithium, ModLoader.addArmor(armor4), 2, "LithiumLeggins", armor4).setUnlocalizedName("LithiumLeggins");
		LithiumBoots = new ItemArmors(LithiumBootsID, armorLithium, ModLoader.addArmor(armor4), 3, "LithiumBoots", armor4).setUnlocalizedName("LithiumBoots");

		//Bromine
		String armor5 = "bromine";
		BromineHelmet = new ItemArmors(BromineHelmetID, armorBromine, ModLoader.addArmor(armor5), 0, "BromineHelmet", armor5).setUnlocalizedName("BromineHelmet");
		BromineChestplate = new ItemArmors(BromineChestplateID,  armorBromine, ModLoader.addArmor(armor5), 1, "BromineChestplate", armor5).setUnlocalizedName("BromineChestplate");
		BromineLeggins = new ItemArmors(BromineLegginsID, armorBromine, ModLoader.addArmor(armor5), 2, "BromineLeggins", armor5).setUnlocalizedName("BromineLeggins");
		BromineBoots = new ItemArmors(BromineBootsID, armorBromine, ModLoader.addArmor(armor5), 3, "BromineBoots", armor5).setUnlocalizedName("BromineBoots");

		//Radon
		String armor6 = "radon";
		RadonHelmet = new ItemArmors(RadonHelmetID, armorRadon, ModLoader.addArmor(armor6), 0, "RadonHelmet", armor6).setUnlocalizedName("RadonHelmet");
		RadonChestplate = new ItemArmors(RadonChestplateID,  armorRadon, ModLoader.addArmor(armor6), 1, "RadonChestplate", armor6).setUnlocalizedName("RadonChestplate");
		RadonLeggins = new ItemArmors(RadonLegginsID, armorRadon, ModLoader.addArmor(armor6), 2, "RadonLeggins", armor6).setUnlocalizedName("RadonLeggins");
		RadonBoots = new ItemArmors(RadonBootsID, armorRadon, ModLoader.addArmor(armor6), 3, "RadonBoots", armor6).setUnlocalizedName("RadonBoots");

		//Xenon
		String armor7 = "xenon";
		XenonHelmet = new ItemArmors(XenonHelmetID, armorXenon, ModLoader.addArmor(armor7), 0, "XenonHelmet", armor7).setUnlocalizedName("XenonHelmet");
		XenonChestplate = new ItemArmors(XenonChestplateID,  armorXenon, ModLoader.addArmor(armor7), 1, "XenonChestplate", armor7).setUnlocalizedName("XenonChestplate");
		XenonLeggins = new ItemArmors(XenonLegginsID, armorXenon, ModLoader.addArmor(armor7), 2, "XenonLeggins", armor7).setUnlocalizedName("XenonLeggins");
		XenonBoots = new ItemArmors(XenonBootsID, armorXenon, ModLoader.addArmor(armor7), 3, "XenonBoots", armor7).setUnlocalizedName("XenonBoots");
		
		//More Dimension stuff
		DimensionManager.registerProviderType(dimension, PneumansionWorldProvider.class, false);
		DimensionManager.registerDimension(dimension, dimension);
		
		//Biome
		pneumansionBiome = new BiomeGenPneumansion(53).setBiomeName("Pneumansion Biome");
        updateLanguage();
		registerBlocks();
		initCraftingRecipes();
		initSmeltingRecipes();
		registerTileEntitys();
		proxy.InitRendering();
	}
	
	
		
		
	 
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public void initSmeltingRecipes(){
		
		GameRegistry.addSmelting(LithiumOre.blockID, new ItemStack(LithiumIngot), 0.5F);
		GameRegistry.addSmelting(XenonOre.blockID, new ItemStack(XenonIngot), 0.5F);
		
		GameRegistry.addSmelting(RadonOre.blockID, new ItemStack(RadonIngot), 0.5F);
		
		GameRegistry.addSmelting(SiliconRawBall.itemID, new ItemStack(SiliconBall), 0.5F);

		GameRegistry.addSmelting(BromineOre.blockID, new ItemStack(BromineIngot), 0.5F);
		GameRegistry.addSmelting(GalliumOre.blockID, new ItemStack(GalliumIngot), 0.5F);
		GameRegistry.addSmelting(BerliniumOre.blockID, new ItemStack(berliniumIngot), 0.5F);
	}
	
	private void initCraftingRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(SiliconRawBall), new ItemStack(Siliconpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(berliniumBrickCarved), new ItemStack(berliniumBrick)); 
		GameRegistry.addShapelessRecipe(new ItemStack(bromineBrickCarved), new ItemStack(bromineBrick));
		GameRegistry.addShapelessRecipe(new ItemStack(galliumBrickCarved), new ItemStack(galliumBrick));
		GameRegistry.addShapelessRecipe(new ItemStack(litiumBrickCarved), new ItemStack(litiumBrick));
		GameRegistry.addShapelessRecipe(new ItemStack(radiumBrickCarved), new ItemStack(radiumBrick));
		GameRegistry.addShapelessRecipe(new ItemStack(radonBrickCarved), new ItemStack(radonBrick));
		GameRegistry.addShapelessRecipe(new ItemStack(xenonBrickCarved), new ItemStack(xenonBrick));
		
		GameRegistry.addRecipe(new ItemStack(berliniumBlock, 4),"BB","BB", 'B', berliniumIngot);
		GameRegistry.addRecipe(new ItemStack(bromineBlock, 4),"BB","BB", 'B', BromineIngot);
		GameRegistry.addRecipe(new ItemStack(galliumBlock, 4),"GG","GG", 'G', GalliumIngot);
		GameRegistry.addRecipe(new ItemStack(litiumBlock, 4),"LL","LL", 'L', LithiumIngot);
		GameRegistry.addRecipe(new ItemStack(radiumBlock, 4),"RR","RR", 'R', RadiumIngot);
		GameRegistry.addRecipe(new ItemStack(radonBlock, 4),"RR","RR", 'R', RadonIngot);
		GameRegistry.addRecipe(new ItemStack(xenonBlock, 4),"XX","XX", 'X', XenonIngot);
		GameRegistry.addRecipe(new ItemStack(berliniumBrick, 4),"BB","BB", 'B', berliniumBlock);
		GameRegistry.addRecipe(new ItemStack(bromineBrick, 4),"BB","BB", 'B', bromineBlock);
		GameRegistry.addRecipe(new ItemStack(galliumBrick, 4),"GG","GG", 'G', galliumBlock);
		GameRegistry.addRecipe(new ItemStack(litiumBrick, 4),"LL", "LL", 'L', litiumBlock);
		GameRegistry.addRecipe(new ItemStack(radiumBrick, 4),"RR","RR", 'R', radiumBlock);
		GameRegistry.addRecipe(new ItemStack(radonBrick, 4),"RR","RR", 'R', radonBlock);
		GameRegistry.addRecipe(new ItemStack(xenonBrick, 4),"XX","XX", 'X', xenonBlock);

		this.addRecipeSword(RadiumSword, RadiumIngot);
		this.addRecipeSword(GalliumSword, GalliumIngot);
		this.addRecipeSword(BerliniumSword, berliniumIngot);
		this.addRecipeSword(BromineSword, BromineIngot);
		this.addRecipeSword(LithiumSword, LithiumIngot);
		this.addRecipeSword(RadonSword, RadonIngot);
		this.addRecipeSword(XenonSword, XenonIngot);
		
		this.addRecipeSpade(RadiumSpade, RadiumIngot);
		this.addRecipeSpade(GalliumSpade, GalliumIngot);
		this.addRecipeSpade(BerliniumSpade, berliniumIngot);
		this.addRecipeSpade(BromineSpade, BromineIngot);
		this.addRecipeSpade(LithiumSpade, LithiumIngot);
		this.addRecipeSpade(RadonSpade, RadonIngot);
		this.addRecipeSpade(XenonSpade, XenonIngot);

		this.addRecipeAxe(RadiumAxe, RadiumIngot);
		this.addRecipeAxe(GalliumAxe, GalliumIngot);
		this.addRecipeAxe(BerliniumAxe, berliniumIngot);
		this.addRecipeAxe(BromineAxe, BromineIngot);
		this.addRecipeAxe(LithiumAxe, LithiumIngot);
		this.addRecipeAxe(RadonAxe, RadonIngot);
		this.addRecipeAxe(XenonAxe, XenonIngot);

		this.addRecipeHoe(RadiumHoe, RadiumIngot);
		this.addRecipeHoe(GalliumHoe, GalliumIngot);
		this.addRecipeHoe(BerliniumHoe, berliniumIngot);
		this.addRecipeHoe(BromineHoe, BromineIngot);
		this.addRecipeHoe(LithiumHoe, LithiumIngot);
		this.addRecipeHoe(RadonHoe, RadonIngot);
		this.addRecipeHoe(XenonHoe, XenonIngot);
		
		this.addRecipePickaxe(RadiumPickaxe, RadiumIngot);
		this.addRecipePickaxe(GalliumPickaxe, GalliumIngot);
		this.addRecipePickaxe(BerliniumPickaxe, berliniumIngot);
		this.addRecipePickaxe(BrominePickaxe, BromineIngot);
		this.addRecipePickaxe(LithiumPickaxe, LithiumIngot);
		this.addRecipePickaxe(RadonPickaxe, RadonIngot);
		this.addRecipePickaxe(XenonPickaxe, XenonIngot);

		this.addRecipeArmor(RadiumIngot, RadiumHelmet, RadiumChestplate, RadiumLeggins, RadiumBoots);
		this.addRecipeArmor(GalliumIngot, GalliumHelmet, GalliumChestplate, GalliumLeggins, GalliumBoots);
		this.addRecipeArmor(berliniumIngot, BerliniumHelmet, BerliniumChestplate, BerliniumLeggins, BerliniumBoots);
		this.addRecipeArmor(BromineIngot, BromineHelmet, BromineChestplate, BromineLeggins, BromineBoots);
		this.addRecipeArmor(LithiumIngot, LithiumHelmet, LithiumChestplate, LithiumLeggins, LithiumBoots);
		this.addRecipeArmor(RadonIngot, RadonHelmet, RadonChestplate, RadonLeggins, RadonBoots);
		this.addRecipeArmor(XenonIngot, XenonHelmet, XenonChestplate, XenonLeggins, XenonBoots);
	}
	
    private void registerItems(){
		GameRegistry.registerItem(LithiumIngot, "Litium Ingot");
		GameRegistry.registerItem(berliniumIngot, "Berlinium Ingot");
		GameRegistry.registerItem(GalliumIngot, "Gallium Ingot");
		GameRegistry.registerItem(RadiumIngot, "Radium Ingot");
		GameRegistry.registerItem(BromineIngot, "Bromine Ingot");
		GameRegistry.registerItem(RadonIngot, "Radon Ingot");
		GameRegistry.registerItem(XenonIngot, "Xenon Ingot");
		GameRegistry.registerItem(LithiumIngot, "Radon Ingot");
		GameRegistry.registerItem(Radiumchunk, "Radium Chunk");
		GameRegistry.registerItem(RadiumCrystal, "Radium Crystal");
		GameRegistry.registerItem(SiliconBall, "Silicon Ball");
		GameRegistry.registerItem(Siliconpowder, "Siliconpowder");
		GameRegistry.registerItem(SiliconRawBall, "Raw Siliconball");
		GameRegistry.registerItem(BerliniumSword, "Berlinium Sword");
		GameRegistry.registerItem(BromineSword, "Bromine Sword");
		GameRegistry.registerItem(GalliumSword, "Gallium Sword");
		//Radium,Gallium,Berlinium,Bromine,Lithium,Radon,Xenon
		//Radium
		GameRegistry.registerItem(RadiumPickaxe, "Radium Pickaxe");
		GameRegistry.registerItem(RadiumSword, "Radium Sword");
		GameRegistry.registerItem(RadiumSpade, "Radium Shovel");
		GameRegistry.registerItem(RadiumAxe, "Radium Axe");
		GameRegistry.registerItem(RadiumHoe, "Radium Hoe");
		GameRegistry.registerItem(RadiumHelmet, "Radium Helmet");
		GameRegistry.registerItem(RadiumChestplate, "Radium Chestplate");
		GameRegistry.registerItem(RadiumLeggins, "Radium Leggins");
		GameRegistry.registerItem(RadiumBoots, "Radium Boots");
		//Gallium
		GameRegistry.registerItem(GalliumPickaxe, "Gallium Pickaxe");
		GameRegistry.registerItem(GalliumSword, "Gallium Sword");
		GameRegistry.registerItem(GalliumSpade, "Gallium Shovel");
		GameRegistry.registerItem(GalliumAxe, "Gallium Axe");
		GameRegistry.registerItem(GalliumHoe, "Gallium Hoe");
		GameRegistry.registerItem(GalliumHelmet, "Gallium Helmet");
		GameRegistry.registerItem(GalliumChestplate, "Gallium Chestplate");
		GameRegistry.registerItem(GalliumLeggins, "Gallium Leggins");
		GameRegistry.registerItem(GalliumBoots, "Gallium Boots");
		//Berlinium
		GameRegistry.registerItem(BerliniumPickaxe, "Berlinium Pickaxe");
		GameRegistry.registerItem(BerliniumSword, "Berlinium Sword");
		GameRegistry.registerItem(BerliniumSpade, "Berlinium Shovel");
		GameRegistry.registerItem(BerliniumAxe, "Berlinium Axe");
		GameRegistry.registerItem(BerliniumHoe, "Berlinium Hoe");
		GameRegistry.registerItem(BerliniumHelmet, "Berlinium Helmet");
		GameRegistry.registerItem(BerliniumChestplate, "Berlinium Chestplate");
		GameRegistry.registerItem(BerliniumLeggins, "Berlinium Leggins");
		GameRegistry.registerItem(BerliniumBoots, "Berlinium Boots");
		//Lithium
		GameRegistry.registerItem(LithiumPickaxe, "Lithium Pickaxe");
		GameRegistry.registerItem(LithiumSword, "Lithium Sword");
		GameRegistry.registerItem(LithiumSpade, "Lithium Shovel");
		GameRegistry.registerItem(LithiumAxe, "Lithium Axe");
		GameRegistry.registerItem(LithiumHoe, "Lithium Hoe");
		GameRegistry.registerItem(LithiumHelmet, "Lithium Helmet");
		GameRegistry.registerItem(LithiumChestplate, "Lithium Chestplate");
		GameRegistry.registerItem(LithiumLeggins, "Lithium Leggins");
		GameRegistry.registerItem(LithiumBoots, "Lithium Boots");
		//Bromine
		GameRegistry.registerItem(BrominePickaxe, "Bromine Pickaxe");
		GameRegistry.registerItem(BromineSword, "Bromine Sword");
		GameRegistry.registerItem(BromineSpade, "Bromine Shovel");
		GameRegistry.registerItem(BromineAxe, "Bromine Axe");
		GameRegistry.registerItem(BromineHoe, "Bromine Hoe");
		GameRegistry.registerItem(BromineHelmet, "Bromine Helmet");
		GameRegistry.registerItem(BromineChestplate, "Bromine Chestplate");
		GameRegistry.registerItem(BromineLeggins, "Bromine Leggins");
		GameRegistry.registerItem(BromineBoots, "Bromine Boots");
		//Radon
		GameRegistry.registerItem(RadonPickaxe, "Radon Pickaxe");
		GameRegistry.registerItem(RadonSword, "Radon Sword");
		GameRegistry.registerItem(RadonSpade, "Radon Shovel");
		GameRegistry.registerItem(RadonAxe, "Radon Axe");
		GameRegistry.registerItem(RadonHoe, "Radon Hoe");
		GameRegistry.registerItem(RadonHelmet, "Radon Helmet");
		GameRegistry.registerItem(RadonChestplate, "Radon Chestplate");
		GameRegistry.registerItem(RadonLeggins, "Radon Leggins");
		GameRegistry.registerItem(RadonBoots, "Radon Boots");
		//Xenon
		GameRegistry.registerItem(XenonPickaxe, "Xenon Pickaxe");
		GameRegistry.registerItem(XenonSword, "Xenon Sword");
		GameRegistry.registerItem(XenonSpade, "Xenon Shovel");
		GameRegistry.registerItem(XenonAxe, "Xenon Axe");
		GameRegistry.registerItem(XenonHoe, "Xenon Hoe");
		GameRegistry.registerItem(XenonHelmet, "Xenon Helmet");
		GameRegistry.registerItem(XenonChestplate, "Xenon Chestplate");
		GameRegistry.registerItem(XenonLeggins, "Xenon Leggins");
		GameRegistry.registerItem(XenonBoots, "Xenon Boots");
		//
		
		GameRegistry.registerItem(PowerVoid,"Power Void");
	}
	
	private void registerBlocks(){
		GameRegistry.registerBlock(LithiumOre, "Lithium Ore");
		GameRegistry.registerBlock(BonyteOre, "Bonyte Ore");
		GameRegistry.registerBlock(RadiumOre, "Radium Ore");
		GameRegistry.registerBlock(RadonOre, "Radon Ore");
		GameRegistry.registerBlock(SiliconOre, "Silicon Ore");
		GameRegistry.registerBlock(XenonOre, "Xenon Ore");
		GameRegistry.registerBlock(GalliumOre, "Gallium Ore");
		GameRegistry.registerBlock(BromineOre, "Bromine Ore");
		GameRegistry.registerBlock(berliniumBrick, "Berlinium Brick");
		GameRegistry.registerBlock(bromineBrick, "Bromine Brick");
		GameRegistry.registerBlock(galliumBrick, "Gallium Brick");
		GameRegistry.registerBlock(litiumBrick, "Litium Brick");
		GameRegistry.registerBlock(radiumBrick, "Radium Brick");
		GameRegistry.registerBlock(radonBrick, "Radon Brick");
		GameRegistry.registerBlock(xenonBrick, "Xenon Brick");
		GameRegistry.registerBlock(berliniumBlock, "Berlinium Block");
		GameRegistry.registerBlock(bromineBlock, "Bromine Block");
		GameRegistry.registerBlock(galliumBlock, "Gallium Block");
		GameRegistry.registerBlock(litiumBlock, "Litium Block");
		GameRegistry.registerBlock(radiumBlock, "Radium Block");
		GameRegistry.registerBlock(radonBlock, "Radon Block");
		GameRegistry.registerBlock(xenonBlock, "Xenon Block");
		GameRegistry.registerBlock(berliniumBrickCarved, "Berlinium Brick Carved");
		GameRegistry.registerBlock(bromineBrickCarved, "Bromine Brick Carved");
		GameRegistry.registerBlock(galliumBrickCarved, "Gallium Brick Carved");
		GameRegistry.registerBlock(litiumBrickCarved, "Litium Brick Carved");
		GameRegistry.registerBlock(radiumBrickCarved, "Radium Brick Carved");
		GameRegistry.registerBlock(radonBrickCarved, "Radon Brick Carved");
		GameRegistry.registerBlock(xenonBrickCarved, "Xenon Brick Carved");
		GameRegistry.registerBlock(pneumansionPortal, "Pneumansion Portal");
		GameRegistry.registerBlock(eternalPowerSource, "Eternal Power Source");
		GameRegistry.registerBlock(BerliniumOre,"Berlinium Ore");
		GameRegistry.registerBlock(eternalPowerConduit,"Eternal Power Conduit");
	}
	
	private void registerTileEntitys(){
		GameRegistry.registerTileEntity(TileEntityEternalPowerSource.class,"tileentityEternalPowerSource");
	}
	private void updateLanguage(){
		//Items
		LanguageRegistry.addName(LithiumIngot, "Litium Ingot");
		LanguageRegistry.addName(berliniumIngot, "Berlinium Ingot") ;
		LanguageRegistry.addName(GalliumIngot, "Gallium Ingot");
		LanguageRegistry.addName(RadiumIngot, "Radium Ingot");
		LanguageRegistry.addName(BromineIngot, "Bromine Ingot");
		LanguageRegistry.addName(RadonIngot, "Radon Ingot");
		LanguageRegistry.addName(XenonIngot, "Xenon Ingot");
		LanguageRegistry.addName(Radiumchunk, "Radium Chunk");
		LanguageRegistry.addName(RadiumCrystal, "Radium Crystal");
		LanguageRegistry.addName(SiliconBall, "Silicon Ball");
		LanguageRegistry.addName(Siliconpowder, "Siliconpowder");
		LanguageRegistry.addName(SiliconRawBall, "Raw Siliconball");
		LanguageRegistry.addName(PowerVoid,"Power Void");
		//Radium
		
		LanguageRegistry.addName(RadiumPickaxe, "Radium Pickaxe");
		LanguageRegistry.addName(RadiumSword, "Radium Sword");
		LanguageRegistry.addName(RadiumSpade, "Radium Shovel");
		LanguageRegistry.addName(RadiumAxe, "Radium Axe");
		LanguageRegistry.addName(RadiumHoe, "Radium Hoe");
		LanguageRegistry.addName(RadiumHelmet, "Radium Helmet");
		LanguageRegistry.addName(RadiumChestplate,  "Radium Chestplate");
		LanguageRegistry.addName(RadiumLeggins, "Radium Leggins");
		LanguageRegistry.addName(RadiumBoots, "Radium Boots");
		//Gallium
		LanguageRegistry.addName(GalliumPickaxe, "Gallium Pickaxe");
		LanguageRegistry.addName(GalliumSword, "Gallium Sword");
		LanguageRegistry.addName(GalliumSpade, "Gallium Shovel");
		LanguageRegistry.addName(GalliumAxe, "Gallium Axe");
		LanguageRegistry.addName(GalliumHoe, "Gallium Hoe");
		LanguageRegistry.addName(GalliumHelmet, "Gallium Helmet");
		LanguageRegistry.addName(GalliumChestplate,  "Gallium Chestplate");
		LanguageRegistry.addName(GalliumLeggins, "Gallium Leggins");
		LanguageRegistry.addName(GalliumBoots, "Gallium Boots");
		//Berlinium
		LanguageRegistry.addName(BerliniumPickaxe, "Berlinium Pickaxe");
		LanguageRegistry.addName(BerliniumSword, "Berlinium Sword");
		LanguageRegistry.addName(BerliniumSpade, "Berlinium Shovel");
		LanguageRegistry.addName(BerliniumAxe, "Berlinium Axe");
		LanguageRegistry.addName(BerliniumHoe, "Berlinium Hoe");
		LanguageRegistry.addName(BerliniumHelmet, "Berlinium Helmet");
		LanguageRegistry.addName(BerliniumChestplate,  "Berlinium Chestplate");
		LanguageRegistry.addName(BerliniumLeggins, "Berlinium Leggins");
		LanguageRegistry.addName(BerliniumBoots, "Berlinium Boots");
		//Lithium
		LanguageRegistry.addName(LithiumPickaxe, "Lithium Pickaxe");
		LanguageRegistry.addName(LithiumSword, "Lithium Sword");
		LanguageRegistry.addName(LithiumSpade, "Lithium Shovel");
		LanguageRegistry.addName(LithiumAxe, "Lithium Axe");
		LanguageRegistry.addName(LithiumHoe, "Lithium Hoe");
		LanguageRegistry.addName(LithiumHelmet, "Lithium Helmet");
		LanguageRegistry.addName(LithiumChestplate,  "Lithium Chestplate");
		LanguageRegistry.addName(LithiumLeggins, "Lithium Leggins");
		LanguageRegistry.addName(LithiumBoots, "Lithium Boots");
		//Bromine
		LanguageRegistry.addName(BrominePickaxe, "Bromine Pickaxe");
		LanguageRegistry.addName(BromineSword, "Bromine Sword");
		LanguageRegistry.addName(BromineSpade, "Bromine Shovel");
		LanguageRegistry.addName(BromineAxe, "Bromine Axe");
		LanguageRegistry.addName(BromineHoe, "Bromine Hoe");
		LanguageRegistry.addName(BromineHelmet, "Bromine Helmet");
		LanguageRegistry.addName(BromineChestplate,  "Bromine Chestplate");
		LanguageRegistry.addName(BromineLeggins, "Bromine Leggins");
		LanguageRegistry.addName(BromineBoots, "Bromine Boots");
		//Radon
		LanguageRegistry.addName(RadonPickaxe, "Radon Pickaxe");
		LanguageRegistry.addName(RadonSword, "Radon Sword");
		LanguageRegistry.addName(RadonSpade, "Radon Shovel");
		LanguageRegistry.addName(RadonAxe, "Radon Axe");
		LanguageRegistry.addName(RadonHoe, "Radon Hoe");
		LanguageRegistry.addName(RadonHelmet, "Radon Helmet");
		LanguageRegistry.addName(RadonChestplate,  "Radon Chestplate");
		LanguageRegistry.addName(RadonLeggins, "Radon Leggins");
		LanguageRegistry.addName(RadonBoots, "Radon Boots");
		//Xenon
		LanguageRegistry.addName(XenonPickaxe, "Xenon Pickaxe");
		LanguageRegistry.addName(XenonSword, "Xenon Sword");
		LanguageRegistry.addName(XenonSpade, "Xenon Shovel");
		LanguageRegistry.addName(XenonAxe, "Xenon Axe");
		LanguageRegistry.addName(XenonHoe, "Xenon Hoe");
		LanguageRegistry.addName(XenonHelmet, "Xenon Helmet");
		LanguageRegistry.addName(XenonChestplate,  "Xenon Chestplate");
		LanguageRegistry.addName(XenonLeggins, "Xenon Leggins");
		LanguageRegistry.addName(XenonBoots, "Xenon Boots");
		//Blocks
		LanguageRegistry.addName(BonyteOre, "Bonyte Ore");
		LanguageRegistry.addName(RadiumOre, "Radium Ore");
		LanguageRegistry.addName(RadonOre, "Radon Ore");
		LanguageRegistry.addName(SiliconOre, "Silicon Ore");
		LanguageRegistry.addName(XenonOre, "Xenon Ore");
		LanguageRegistry.addName(LithiumOre, "Lithium Ore") ;
		LanguageRegistry.addName(berliniumBrick, "Berlinium Brick");
		LanguageRegistry.addName(bromineBrick, "Bromine Brick");
		LanguageRegistry.addName(galliumBrick, "Gallium Brick");
		LanguageRegistry.addName(litiumBrick, "Litium Brick");
		LanguageRegistry.addName(radiumBrick, "Radium Brick");
		LanguageRegistry.addName(radonBrick, "Radon Brick");	
		LanguageRegistry.addName(xenonBrick, "Xenon Brick");
		LanguageRegistry.addName(berliniumBlock, "Berlinium Block");
		LanguageRegistry.addName(bromineBlock, "Bromine Block");
		LanguageRegistry.addName(galliumBlock, "Gallium Block");
		LanguageRegistry.addName(litiumBlock, "Litium Block");
		LanguageRegistry.addName(radiumBlock, "Radium Block");
		LanguageRegistry.addName(radonBlock, "Radon Block");	
		LanguageRegistry.addName(xenonBlock, "Xenon Block");
		LanguageRegistry.addName(berliniumBrickCarved, "Berlinium BrickCarved");
		LanguageRegistry.addName(bromineBrickCarved, "Bromine BrickCarved");
		LanguageRegistry.addName(galliumBrickCarved, "Gallium BrickCarved");
		LanguageRegistry.addName(litiumBrickCarved, "Litium BrickCarved");
		LanguageRegistry.addName(radiumBrickCarved, "Radium BrickCarved");
		LanguageRegistry.addName(radonBrickCarved, "Radon BrickCarved");	
		LanguageRegistry.addName(xenonBrickCarved, "Xenon BrickCarved");
		LanguageRegistry.addName(pneumansionPortal, "Pneumansion Portal");
		LanguageRegistry.addName(BerliniumOre,"Berlinium Ore");
		LanguageRegistry.addName(eternalPowerConduit,"Eternal Power Conduit");
	}
		
	//Radium,Gallium,Berlinium,Bromine,Lithium,Radon,Xenon
	//Tool material
	public static EnumToolMaterial toolRadium = EnumHelper.addToolMaterial("Radium", 3, 2000, 10.0F, 4, 25);
	public static EnumToolMaterial toolGallium = EnumHelper.addToolMaterial("Gallium", 3, 1500, 10.0F, 4, 25);
	public static EnumToolMaterial toolBerlinium = EnumHelper.addToolMaterial("Berlinium", 3, 1400, 10.0F, 4, 25);
	public static EnumToolMaterial toolBromine = EnumHelper.addToolMaterial("Bromine", 3, 1200, 10.0F, 4, 25);
	public static EnumToolMaterial toolLithium = EnumHelper.addToolMaterial("Lithium", 3, 200, 10.0F, 4, 25);
	public static EnumToolMaterial toolRadon = EnumHelper.addToolMaterial("Radon", 3, 500, 10.0F, 4, 25);
	public static EnumToolMaterial toolXenon = EnumHelper.addToolMaterial("Xenon", 3, 700, 10.0F, 4, 25);
		
	//Armor material
	public static EnumArmorMaterial armorRadium = EnumHelper.addArmorMaterial("Radium", 33, new int[]{3, 8, 6, 3},25);
	public static EnumArmorMaterial armorGallium = EnumHelper.addArmorMaterial("Gallium", 33, new int[]{3, 8, 6, 3},25);
	public static EnumArmorMaterial armorBerlinium = EnumHelper.addArmorMaterial("Berlinium", 33, new int[]{3, 8, 6, 3},25);
	public static EnumArmorMaterial armorBromine = EnumHelper.addArmorMaterial("Bromine", 33, new int[]{3, 8, 6, 3},25);
	public static EnumArmorMaterial armorLithium = EnumHelper.addArmorMaterial("Lithium", 33, new int[]{3, 8, 6, 3},25);
	public static EnumArmorMaterial armorRadon = EnumHelper.addArmorMaterial("Radon", 33, new int[]{3, 8, 6, 3},25);
	public static EnumArmorMaterial armorXenon = EnumHelper.addArmorMaterial("Xenon", 33, new int[]{3, 8, 6, 3},25);

	public void addRecipeSword(Item sword, Item ingot)
	{
		GameRegistry.addRecipe(new ItemStack(sword),"XRX","XRX","XSX", 'R', ingot, 'S', Item.stick);
	}
	
	public void addRecipeSpade(Item spade, Item ingot)
	{
		GameRegistry.addRecipe(new ItemStack(spade),"XRX","XSX","XSX", 'R', ingot, 'S', Item.stick);
	}
	
	public void addRecipeAxe(Item axe, Item ingot)
	{
		GameRegistry.addRecipe(new ItemStack(axe),"RRX","RSX","XSX", 'R', ingot, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(axe),"XRR","XSR","XSX", 'R', ingot, 'S', Item.stick);
	}
	
	public void addRecipeHoe(Item hoe, Item ingot)
	{
		GameRegistry.addRecipe(new ItemStack(hoe),"RRX","XSX","XSX", 'R', ingot, 'S', Item.stick);
		GameRegistry.addRecipe(new ItemStack(hoe),"XRR","XSX","XSX", 'R', ingot, 'S', Item.stick);
	}
	
	public void addRecipePickaxe(Item pickaxe, Item ingot)
	{
		GameRegistry.addRecipe(new ItemStack(pickaxe),"RRR","XSX","XSX", 'R', ingot, 'S', Item.stick);
	}
	
	public void addRecipeArmor(Item ingot, Item helmet, Item chestplate, Item leggins, Item boots)
	{
		GameRegistry.addRecipe(new ItemStack(helmet),"RRR","RXR", 'R', ingot);
		GameRegistry.addRecipe(new ItemStack(chestplate),"RXR","RRR","RRR", 'R', ingot);
		GameRegistry.addRecipe(new ItemStack(leggins),"RRR","RXR","RXR", 'R', ingot);
		GameRegistry.addRecipe(new ItemStack(boots),"RXR","RXR", 'R', ingot);
	}
}




