package me.nathan.neotest.datagen;

import me.nathan.neotest.Main;
import me.nathan.neotest.block.NTBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Main.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NTBlocks.BLUE_STONE.get())
                .add(NTBlocks.EXAMPLE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(NTBlocks.BLUE_STONE.get());

    }
}
