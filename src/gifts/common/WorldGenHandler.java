package gifts.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if (world.provider.dimensionId == 0)
		{
			for (int i = 0; i < 10; i++)
			{
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = 30 + random.nextInt(100 - 30);
				int zCoord = chunkZ + random.nextInt(16);

				new WorldGenPresents().generate(world, random, xCoord, yCoord, zCoord);
			}
		}

	}

}
