#loader gregtech
import mods.devtech.unification.IStoneType;
import mods.devtech.unification.IBlockStatePredicate;
import crafttweaker.block.IBlockState;
import mods.devtech.unification.IOrePrefix;
import mods.devtech.unification.IMaterialIconType;
import mods.devtech.unification.IMaterialPredicate;

var testOrePrefix = IOrePrefix.createOrePrefix("testOre", IMaterialIconType.get("ore"), 0, IMaterialPredicate.isDust & IMaterialPredicate.hasFlag("GENERATE_ORE"));
/*
The function is what scans through all the blocks in the world, deciding if it should/can be replaced by this block.
*/

var blockStateFunction = function(blockState as IBlockState) as bool {
		return blockState.block.definition.id == "minecraft:dirt";
	} as IBlockStatePredicate;

//this function checks for meta data is correct.
var blockStateFunctionWithMeta = function(blockState as IBlockState) as bool {
	return blockState.meta == 5 && blockState.block.definition.id == "minecraft:wool";
} as IBlockStatePredicate;

IStoneType.createStoneType(14, "dirt", "blocks/dirt", testOrePrefix, "iron", "pickaxe", 0, <blockstate:minecraft:dirt>, 
	blockStateFunction);