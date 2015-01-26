package gifts.common;

import net.minecraft.item.ItemStack;

public class WeightedItemStack
{
	int weight;
	ItemStack stack;

	public WeightedItemStack(ItemStack stack, int weight)
	{
		this.weight = weight;
		this.stack = stack;
	}

	public int getWeight()
	{
		return weight;
	}

	public ItemStack getStack()
	{
		return stack;
	}
}