/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thevoxelbox.voxelsniper.brush.perform;

import com.boydti.fawe.bukkit.wrapper.AsyncBlock;
import com.thevoxelbox.voxelsniper.Message;
import com.thevoxelbox.voxelsniper.SnipeData;


public class pInkInk extends vPerformer {

    private int d;
    private int dr;

    public pInkInk() {
        name = "Ink-Ink";
    }

    @Override
    public void init(SnipeData v) {
        w = v.getWorld();
        d = v.getPropertyId();
        dr = v.getReplaceData();
    }

    @Override
    public void info(Message vm) {
        vm.performerName(name);
        vm.data();
        vm.replaceData();
    }

    @SuppressWarnings("deprecation")
    @Override
    public void perform(AsyncBlock b) {
        if (b.getPropertyId() == dr) {
            h.put(b);
            b.setPropertyId(d);
        }
    }

    @Override
    public boolean isUsingReplaceMaterial() {
        return true;
    }
}
