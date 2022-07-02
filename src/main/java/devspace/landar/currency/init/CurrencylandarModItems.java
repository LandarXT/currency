
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package devspace.landar.currency.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import devspace.landar.currency.item.CURRENCYItem;
import devspace.landar.currency.CurrencylandarMod;

public class CurrencylandarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CurrencylandarMod.MODID);
	public static final RegistryObject<Item> CURRENCY = REGISTRY.register("currency", () -> new CURRENCYItem());
}
