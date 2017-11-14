package nick.mod.world.biomes;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeWinter extends Biome 
{

	public BiomeWinter() 
	{
		super(new BiomeProperties("Winter").setBaseHeight(1.0F).setHeightVariation(0.9F).setTemperature(0.1F).setRainDisabled().setSnowEnabled());
		
		topBlock = (IBlockState) Blocks.SNOW;
		fillerBlock = (IBlockState) Blocks.SNOW;
		
		this.decorator.treesPerChunk = 2;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySnowman.class, 10, 1, 5));
	}
	
}
