// src/main/java/me/nathan/neotest/registry/NeotestBlockEntities.java
package me.nathan.neotest.block;

import me.nathan.neotest.Main;
import me.nathan.neotest.block.entity.BasicMaceratorBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NTBlockEntities {

    // This is the DeferredRegister for BlockEntityTypes
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Main.MODID);

    // Register your macerator block entity here
    public static final Supplier<BlockEntityType<BasicMaceratorBlockEntity>> BASIC_MACERATOR =
            BLOCK_ENTITIES.register("basic_macerator", () ->
                    BlockEntityType.Builder.of(
                            BasicMaceratorBlockEntity::new,
                            NTBlocks.BASIC_MACERATOR.get() // make sure this block is registered too
                    ).build(null));

    // Call this from your main mod class
    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITIES.register(modEventBus);
    }
}