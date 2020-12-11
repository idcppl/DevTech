package com.zook.devtech.gregtech.unification.impl;

import com.zook.devtech.gregtech.unification.IBlockStateSupplier;
import net.minecraft.block.state.IBlockState;

import java.util.function.Supplier;

public class MCBlockStateSupplier implements IBlockStateSupplier {
    public final Supplier<IBlockState> supplier;

    MCBlockStateSupplier(Supplier<IBlockState> supplier) {
        this.supplier = supplier;
    }

    @Override
    public IBlockState get() {
        return supplier.get();
    }
}
