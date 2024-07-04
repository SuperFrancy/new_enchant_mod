
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newenchantmentsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.registries.Registries;

import net.mcreator.newenchantmentsmod.enchantment.SmeltingEnchantment;
import net.mcreator.newenchantmentsmod.NewEnchantmentsModMod;

public class NewEnchantmentsModModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(Registries.ENCHANTMENT, NewEnchantmentsModMod.MODID);
	public static final DeferredHolder<Enchantment, Enchantment> SMELTING = REGISTRY.register("smelting", () -> new SmeltingEnchantment());
}
