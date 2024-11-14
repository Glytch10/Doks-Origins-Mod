package net.noxaeterna.shatteredsoul.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.noxaeterna.shatteredsoul.effects.StasisEffect;
import net.noxaeterna.shatteredsoul.ShatteredSoul;

public class Effects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ShatteredSoul.MODID);
	public static final RegistryObject<MobEffect> STASIS = REGISTRY.register("stasis", () -> new StasisEffect());
}