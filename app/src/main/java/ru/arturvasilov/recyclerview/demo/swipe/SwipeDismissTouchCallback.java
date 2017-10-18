/*
 * This file is a part of the Yandex Search for Android project.
 *
 * (C) Copyright 2017 Yandex, LLC. All rights reserved.
 *
 * Author: Artur Vasilov <avasilov@yandex-team.ru>
 */
package ru.arturvasilov.recyclerview.demo.swipe;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

public abstract class SwipeDismissTouchCallback extends ItemTouchHelper.SimpleCallback {

    public SwipeDismissTouchCallback(int swipeDirs) {
        super(0, swipeDirs);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
                            float dX, float dY, int actionState, boolean isCurrentlyActive) {
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    @Override
    public void onChildDrawOver(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
                                float dX, float dY, int actionState, boolean isCurrentlyActive) {
        super.onChildDrawOver(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
    }
}
