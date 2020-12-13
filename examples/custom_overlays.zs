#loader gregtech
import mods.devtech.OverlayRenderer;
import mods.devtech.OverlayFace;
import mods.devtech.machines.RegisterMachine;
import mods.gregtech.recipe.RecipeMaps;
/*
To make custom overlay textures you need to be in the gregtech loader. You will also need a resource loader or resource pack for the texture to load.
You can add all 5 OverlayFace's to the method. All 5 are, TOP, BOTTOM, BACK, FRONT, SIDE
The textures go into gregtech/textures/blocks/machines/%MACHINE_NAME%/
If you want to see an example with resource location there is an example in this directory in the resource file.
*/
var textures = OverlayRenderer.newOverlay("machines/thingy", OverlayFace.FRONT, OverlayFace.SIDE, OverlayFace.TOP);

//Then you just slap that variable into the machine
RegisterMachine.CreateSimpleMachine(1987, "thingy.lv", RecipeMaps.COMPRESSOR_RECIPES, textures, 1);
