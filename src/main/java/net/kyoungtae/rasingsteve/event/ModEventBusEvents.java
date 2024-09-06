package net.kyoungtae.rasingsteve.event;

import net.kyoungtae.rasingsteve.RasingSteve;
import net.kyoungtae.rasingsteve.entity.ModEntities;
import net.kyoungtae.rasingsteve.entity.client.ModModelLayers;
import net.kyoungtae.rasingsteve.entity.client.RhinoModel;
import net.kyoungtae.rasingsteve.entity.custom.RhinoEntity;
import net.kyoungtae.rasingsteve.entity.custom.TestEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RasingSteve.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
        event.put(ModEntities.TEST.get(), TestEntity.createAttributes().build());
    }
}
