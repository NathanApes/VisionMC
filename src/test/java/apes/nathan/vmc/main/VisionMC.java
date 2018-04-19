package apes.nathan.vmc.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/*
 *
 * VisionMC: Minecraft the way it should be seen.
 *
 * This is a mod that changes Minecraft's gameplay for the better.
 * Makes better gameplay using everything you can mod with in FML.
 * All in all, this is what you want if you've been sick of Minecraft.
 * Believe in the Vision, and you'll see it differently...;)
 *
 * */

@Mod(modid = "vmc", name = "VisionMC", version = "0.1b", clientSideOnly = true)
public class VisionMC {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInit){
        //Start Functions Here
        preInit.getModLog().info("Initialization Test!");
    }
}
