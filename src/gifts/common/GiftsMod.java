package gifts.common;

import gifts.common.blocks.BlockPresent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "giftsmod", name = "Gifts Mod", version = "1.0.0")
public class GiftsMod
{
	public static Block blockPresent;

	@Instance("giftsmod")
	public static GiftsMod instance;

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event)
	{
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.apple, 16), 6);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.carrot, 8), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.potato, 8), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.baked_potato, 16), 6);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.poisonous_potato, 32), 4);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.cake, 2), 3);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.porkchop, 16), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.cooked_porkchop, 16), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.beef, 16), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.cooked_beef, 16), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.chicken, 16), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.cooked_chicken, 16), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.wheat_seeds, 4), 7);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.pumpkin_seeds, 4), 7);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.melon_seeds, 4), 7);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Blocks.pumpkin, 1), 8);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Blocks.melon_block, 1), 6);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.melon, 3), 6);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.golden_apple, 2), 2);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.golden_carrot, 1), 2);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.iron_shovel, 1), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.iron_hoe, 1), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.iron_pickaxe, 1), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.iron_sword, 1), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.iron_axe, 1), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.diamond_shovel, 1), 5);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.diamond_hoe, 1), 3);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.diamond_pickaxe, 1), 3);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.diamond_sword, 1), 3);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.diamond_axe, 1), 3);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.bow, 1), 6);
		WeightedRandomGift.addItemStackToGifts(new ItemStack(Items.arrow, 16), 6);

		blockPresent = new BlockPresent(Material.circuits).setBlockName("blockPresent");
		GameRegistry.registerBlock(blockPresent, "BlockPresent");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(blockPresent), new Object[] { "XXX", "XCX", "XXX", 'X', Blocks.wool, 'C', Blocks.chest });
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{

	}
}
