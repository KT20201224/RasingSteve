package net.kyoungtae.rasingsteve.entity.client;

import net.kyoungtae.rasingsteve.RasingSteve;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {

    public static final ModelLayerLocation RHINO_LAYER = new ModelLayerLocation(
            new ResourceLocation(RasingSteve.MOD_ID, "rhino_layer"), "main");

    public static final ModelLayerLocation TEST_LAYER = new ModelLayerLocation(
            new ResourceLocation(RasingSteve.MOD_ID, "test_layer"), "main");

}
