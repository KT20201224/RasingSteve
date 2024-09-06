package net.kyoungtae.rasingsteve.entity;

import net.kyoungtae.rasingsteve.RasingSteve;
import net.kyoungtae.rasingsteve.entity.custom.RhinoEntity;
import net.kyoungtae.rasingsteve.entity.custom.TestEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RasingSteve.MOD_ID);


    public static final RegistryObject<EntityType<RhinoEntity>> RHINO =
            ENTITY_TYPES.register("rhino", () -> EntityType.Builder.of(RhinoEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("rhino"));

    public static final RegistryObject<EntityType<TestEntity>> TEST =
            ENTITY_TYPES.register("test", () -> EntityType.Builder.of(TestEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("test"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
