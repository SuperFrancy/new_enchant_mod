
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newenchantmentsmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.core.registries.Registries;

import net.mcreator.newenchantmentsmod.enchantment.SmeltingEnchantment;
import net.mcreator.newenchantmentsmod.enchantment.IceAspectEnchantment;
import net.mcreator.newenchantmentsmod.enchantment.BreakingCurseEnchantment;
import net.mcreator.newenchantmentsmod.NewEnchantmentsModMod;

public class NewEnchantmentsModModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(Registries.ENCHANTMENT, NewEnchantmentsModMod.MODID);
	public static final DeferredHolder<Enchantment, Enchantment> SMELTING = REGISTRY.register("smelting", () -> new SmeltingEnchantment());
	public static final DeferredHolder<Enchantment, Enchantment> BREAKING_CURSE = REGISTRY.register("breaking_curse", () -> new BreakingCurseEnchantment());
	public static final DeferredHolder<Enchantment, Enchantment> ICE_ASPECT = REGISTRY.register("ice_aspect", () -> new IceAspectEnchantment());
}
