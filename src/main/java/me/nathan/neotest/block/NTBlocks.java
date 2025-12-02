package me.nathan.neotest.block;

import me.nathan.neotest.Main;
import me.nathan.neotest.block.machines.BasicMaceratorBlock;
import me.nathan.neotest.item.NTItems;
import net.minecraft.core.Holder;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NTBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Main.MODID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock("example_block",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> BLUE_STONE = registerBlock("blue_stone",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Supplier<BasicMaceratorBlock> BASIC_MACERATOR =
            registerBlock("basic_macerator", () ->
                    new BasicMaceratorBlock(BlockBehaviour.Properties.of()
                            .strength(3.5f)
                            .noLootTable()));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        NTItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

}
