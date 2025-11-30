package me.nathan.neotest.datagen;

import me.nathan.neotest.block.NTBlocks;
import me.nathan.neotest.item.NTItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    // if any questions watch https://www.youtube.com/watch?v=T-9h-FbAQH0

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NTBlocks.BLUE_STONE.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', NTItems.EXAMPLE_ITEM.get())
                .unlockedBy("has_example_item", has(NTItems.EXAMPLE_ITEM)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NTItems.EXAMPLE_ITEM.get(), 9)
                .requires(NTBlocks.BLUE_STONE)
                .unlockedBy("has_blue_stone_block", has(NTBlocks.BLUE_STONE)).save(recipeOutput);

        // in case of 2 or more crafts with the same output use
        /*
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NTItems.EXAMPLE_ITEM.get(), 9)
                .requires(NTBlocks.BLUE_STONE)
                .unlockedBy("has_blue_stone_block", has(NTBlocks.BLUE_STONE)).save(recipeOutput, "neotest:example_item_from_{other_item}");
         */



    }
}
