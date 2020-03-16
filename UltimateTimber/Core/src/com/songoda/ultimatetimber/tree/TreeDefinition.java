package com.songoda.ultimatetimber.tree;

import com.songoda.ultimatetimber.adapter.IBlockData;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;
import java.util.Set;

public class TreeDefinition {

    private final String key;
    private final Set<IBlockData> logBlockData, leafBlockData, plantableSoilBlockData;
    private final IBlockData saplingBlockData;
    private final double maxLogDistanceFromTrunk;
    private final int maxLeafDistanceFromLog;
    private final boolean detectLeavesDiagonally;
    private final boolean dropOriginalLog, dropOriginalLeaf;
    private final Set<TreeLoot> logLoot, leafLoot, entireTreeLoot;
    private final Set<ItemStack> requiredTools;

    public TreeDefinition(String key, Set<IBlockData> logBlockData, Set<IBlockData> leafBlockData, IBlockData saplingBlockData,
                          Set<IBlockData> plantableSoilBlockData, double maxLogDistanceFromTrunk, int maxLeafDistanceFromLog,
                          boolean detectLeavesDiagonally, boolean dropOriginalLog, boolean dropOriginalLeaf, Set<TreeLoot> logLoot,
                          Set<TreeLoot> leafLoot, Set<TreeLoot> entireTreeLoot, Set<ItemStack> requiredTools) {
        this.key = key;
        this.logBlockData = logBlockData;
        this.leafBlockData = leafBlockData;
        this.saplingBlockData = saplingBlockData;
        this.plantableSoilBlockData = plantableSoilBlockData;
        this.maxLogDistanceFromTrunk = maxLogDistanceFromTrunk;
        this.maxLeafDistanceFromLog = maxLeafDistanceFromLog;
        this.detectLeavesDiagonally = detectLeavesDiagonally;
        this.dropOriginalLog = dropOriginalLog;
        this.dropOriginalLeaf = dropOriginalLeaf;
        this.logLoot = logLoot;
        this.leafLoot = leafLoot;
        this.entireTreeLoot = entireTreeLoot;
        this.requiredTools = requiredTools;
    }

    /**
     * Gets the key of this TreeDefinition in the config
     *
     * @return The key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Gets a set of valid log block data for this TreeDefinition
     *
     * @return A Set of IBlockData
     */
    public Set<IBlockData> getLogBlockData() {
        return Collections.unmodifiableSet(this.logBlockData);
    }

    /**
     * Gets a set of valid leaf block data for this TreeDefinition
     *
     * @return A Set of IBlockData
     */
    public Set<IBlockData> getLeafBlockData() {
        return Collections.unmodifiableSet(this.leafBlockData);
    }

    /**
     * Gets the sapling block data of this TreeDefinition
     *
     * @return An IBlockData instance for the sapling
     */
    public IBlockData getSaplingBlockData() {
        return this.saplingBlockData;
    }

    /**
     * Gets a set of plantable soil block data for this TreeDefinition
     *
     * @return A Set of IBlockData
     */
    public Set<IBlockData> getPlantableSoilBlockData() {
        return Collections.unmodifiableSet(this.plantableSoilBlockData);
    }

    /**
     * Gets the max distance away a log can be from the tree trunk in order to be part of the tree
     *
     * @return The max distance a log can be from the tree trunk
     */
    public double getMaxLogDistanceFromTrunk() {
        return this.maxLogDistanceFromTrunk;
    }

    /**
     * Gets the max distance away a leaf can be from a log in order to be part of the tree
     *
     * @return The max distance a leaf can be from a log
     */
    public int getMaxLeafDistanceFromLog() {
        return this.maxLeafDistanceFromLog;
    }

    /**
     * Gets if tree detection should check for leaves diagonally
     *
     * @return True if leaves should be searched for diagonally, otherwise false
     */
    public boolean shouldDetectLeavesDiagonally() {
        return this.detectLeavesDiagonally;
    }

    /**
     * Gets if the logs of this tree should drop their original block
     *
     * @return True if the original log block should be dropped, otherwise false
     */
    public boolean shouldDropOriginalLog() {
        return this.dropOriginalLog;
    }

    /**
     * Gets if the leaves of this tree should drop their original block
     *
     * @return True if the original leaf block should be dropped, otherwise false
     */
    public boolean shouldDropOriginalLeaf() {
        return this.dropOriginalLeaf;
    }

    /**
     * Gets the log loot for this TreeDefinition
     *
     * @return A Set of TreeLoot
     */
    public Set<TreeLoot> getLogLoot() {
        return Collections.unmodifiableSet(this.logLoot);
    }

    /**
     * Gets the leaf loot for this TreeDefinition
     *
     * @return A Set of TreeLoot
     */
    public Set<TreeLoot> getLeafLoot() {
        return Collections.unmodifiableSet(this.leafLoot);
    }

    /**
     * Gets the loot for this TreeDefinition
     *
     * @return A Set of TreeLoot
     */
    public Set<TreeLoot> getEntireTreeLoot() {
        return Collections.unmodifiableSet(this.entireTreeLoot);
    }

    /**
     * Gets the tools that can be used to activate this tree topple
     *
     * @return A Set of ItemStacks
     */
    public Set<ItemStack> getRequiredTools() {
        return Collections.unmodifiableSet(this.requiredTools);
    }

}