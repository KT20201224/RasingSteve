package net.kyoungtae.rasingsteve.event;

import net.kyoungtae.rasingsteve.RasingSteve;
import net.kyoungtae.rasingsteve.entity.client.ModModelLayers;
import net.kyoungtae.rasingsteve.entity.client.TestModel;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RasingSteve.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.TEST_LAYER, TestModel::createBodyLayer);
    }
}
