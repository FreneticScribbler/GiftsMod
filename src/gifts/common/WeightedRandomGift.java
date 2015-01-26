package gifts.common;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

public class WeightedRandomGift
{
	private final static ArrayList<WeightedItemStack> stackArray = new ArrayList();

	public static void addItemStackToGifts(ItemStack stack, int weight)
	{
		if (weight > 0)
			stackArray.add(new WeightedItemStack(stack, weight));
	}

	public static ItemStack getWeightedRandomItemStack()
	{
		WeightedItemStack[] items = stackArray.toArray(new WeightedItemStack[stackArray.size()]);
		// Compute the total weight of all items together
		double totalWeight = 0.0d;
		for (WeightedItemStack i : items)
		{
			totalWeight += i.getWeight();
		}
		// Now choose a random item
		int randomIndex = -1;
		double random = Math.random() * totalWeight;
		for (int i = 0; i < items.length; ++i)
		{
			random -= items[i].getWeight();
			if (random <= 0.0d)
			{
				randomIndex = i;
				break;
			}
		}
		return items[randomIndex].getStack();
	}

}
