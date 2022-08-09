package me.trunk1738.unstable;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Unstable.MOD_ID)
public class Unstable {
    public static final String MOD_ID = "unstable";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Unstable() {

        MinecraftForge.EVENT_BUS.register(this);

    }

}
