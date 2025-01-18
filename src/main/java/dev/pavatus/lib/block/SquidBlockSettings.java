package dev.pavatus.lib.block;

import java.util.function.Function;
import java.util.function.ToIntFunction;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class SquidBlockSettings extends FabricBlockSettings {

    public static SquidBlockSettings create() {
        return new SquidBlockSettings();
    }

    private Item.Settings settings;

    public SquidBlockSettings itemSettings(Item.Settings settings) {
        this.settings = settings;
        return this;
    }

    @Override
    public SquidBlockSettings noCollision() {
        return (SquidBlockSettings) super.noCollision();
    }

    @Override
    public SquidBlockSettings nonOpaque() {
        return (SquidBlockSettings) super.nonOpaque();
    }

    @Override
    public SquidBlockSettings slipperiness(float value) {
        return (SquidBlockSettings) super.slipperiness(value);
    }

    @Override
    public SquidBlockSettings velocityMultiplier(float velocityMultiplier) {
        return (SquidBlockSettings) super.velocityMultiplier(velocityMultiplier);
    }

    @Override
    public SquidBlockSettings jumpVelocityMultiplier(float jumpVelocityMultiplier) {
        return (SquidBlockSettings) super.jumpVelocityMultiplier(jumpVelocityMultiplier);
    }

    @Override
    public SquidBlockSettings sounds(BlockSoundGroup group) {
        return (SquidBlockSettings) super.sounds(group);
    }

    @Override
    public SquidBlockSettings lightLevel(ToIntFunction<BlockState> levelFunction) {
        return (SquidBlockSettings) super.lightLevel(levelFunction);
    }

    @Override
    public SquidBlockSettings luminance(ToIntFunction<BlockState> luminanceFunction) {
        return (SquidBlockSettings) super.luminance(luminanceFunction);
    }

    @Override
    public SquidBlockSettings strength(float hardness, float resistance) {
        return (SquidBlockSettings) super.strength(hardness, resistance);
    }

    @Override
    public SquidBlockSettings breakInstantly() {
        return (SquidBlockSettings) super.breakInstantly();
    }

    @Override
    public SquidBlockSettings strength(float strength) {
        return (SquidBlockSettings) super.strength(strength);
    }

    @Override
    public SquidBlockSettings ticksRandomly() {
        return (SquidBlockSettings) super.ticksRandomly();
    }

    @Override
    public SquidBlockSettings dynamicBounds() {
        return (SquidBlockSettings) super.dynamicBounds();
    }

    @Override
    public SquidBlockSettings dropsNothing() {
        return (SquidBlockSettings) super.dropsNothing();
    }

    @Override
    public SquidBlockSettings dropsLike(Block block) {
        return (SquidBlockSettings) super.dropsLike(block);
    }

    @Override
    public SquidBlockSettings air() {
        return (SquidBlockSettings) super.air();
    }

    @Override
    public SquidBlockSettings allowsSpawning(AbstractBlock.TypedContextPredicate<EntityType<?>> predicate) {
        return (SquidBlockSettings) super.allowsSpawning(predicate);
    }

    @Override
    public SquidBlockSettings solidBlock(AbstractBlock.ContextPredicate predicate) {
        return (SquidBlockSettings) super.solidBlock(predicate);
    }

    @Override
    public SquidBlockSettings suffocates(AbstractBlock.ContextPredicate predicate) {
        return (SquidBlockSettings) super.suffocates(predicate);
    }

    @Override
    public SquidBlockSettings blockVision(AbstractBlock.ContextPredicate predicate) {
        return (SquidBlockSettings) super.blockVision(predicate);
    }

    @Override
    public SquidBlockSettings postProcess(AbstractBlock.ContextPredicate predicate) {
        return (SquidBlockSettings) super.postProcess(predicate);
    }

    @Override
    public SquidBlockSettings emissiveLighting(AbstractBlock.ContextPredicate predicate) {
        return (SquidBlockSettings) super.emissiveLighting(predicate);
    }

    @Override
    public SquidBlockSettings requiresTool() {
        return (SquidBlockSettings) super.requiresTool();
    }

    @Override
    public SquidBlockSettings mapColor(MapColor color) {
        return (SquidBlockSettings) super.mapColor(color);
    }

    @Override
    public SquidBlockSettings hardness(float hardness) {
        return (SquidBlockSettings) super.hardness(hardness);
    }

    @Override
    public SquidBlockSettings resistance(float resistance) {
        return (SquidBlockSettings) super.resistance(resistance);
    }

    @Override
    public SquidBlockSettings offset(AbstractBlock.OffsetType offsetType) {
        return (SquidBlockSettings) super.offset(offsetType);
    }

    @Override
    public SquidBlockSettings noBlockBreakParticles() {
        return (SquidBlockSettings) super.noBlockBreakParticles();
    }

    @Override
    public SquidBlockSettings requires(FeatureFlag... features) {
        return (SquidBlockSettings) super.requires(features);
    }

    @Override
    public SquidBlockSettings mapColor(Function<BlockState, MapColor> mapColorProvider) {
        return (SquidBlockSettings) super.mapColor(mapColorProvider);
    }

    @Override
    public SquidBlockSettings burnable() {
        return (SquidBlockSettings) super.burnable();
    }

    @Override
    public SquidBlockSettings liquid() {
        return (SquidBlockSettings) super.liquid();
    }

    @Override
    public SquidBlockSettings solid() {
        return (SquidBlockSettings) super.solid();
    }

    @Override
    public SquidBlockSettings notSolid() {
        return (SquidBlockSettings) super.notSolid();
    }

    @Override
    public SquidBlockSettings pistonBehavior(PistonBehavior pistonBehavior) {
        return (SquidBlockSettings) super.pistonBehavior(pistonBehavior);
    }

    @Override
    public SquidBlockSettings instrument(Instrument instrument) {
        return (SquidBlockSettings) super.instrument(instrument);
    }

    @Override
    public SquidBlockSettings replaceable() {
        return (SquidBlockSettings) super.replaceable();
    }

    @Override
    public SquidBlockSettings lightLevel(int lightLevel) {
        return (SquidBlockSettings) super.lightLevel(lightLevel);
    }

    @Override
    public SquidBlockSettings luminance(int luminance) {
        return (SquidBlockSettings) super.luminance(luminance);
    }

    @Override
    public SquidBlockSettings drops(Identifier dropTableId) {
        return (SquidBlockSettings) super.drops(dropTableId);
    }

    @Override
    public SquidBlockSettings materialColor(MapColor color) {
        return (SquidBlockSettings) super.materialColor(color);
    }

    @Override
    public SquidBlockSettings materialColor(DyeColor color) {
        return (SquidBlockSettings) super.materialColor(color);
    }

    @Override
    public SquidBlockSettings mapColor(DyeColor color) {
        return (SquidBlockSettings) super.mapColor(color);
    }

    @Override
    public SquidBlockSettings collidable(boolean collidable) {
        return (SquidBlockSettings) super.collidable(collidable);
    }

    public Item.Settings itemSettings() {
        return settings;
    }
}
