/*
 * Copyright (C) 2015 crDroid Android
 *
 * * Licensed under the GNU GPLv2 license
 *
 * The text of the license can be found in the LICENSE file
 * or at https://www.gnu.org/licenses/gpl-2.0.txt
 */

package com.crdroid.updater.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.crdroid.updater.service.CMDashClockExtension;

public class CheckFinishReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, CMDashClockExtension.class);
        i.setAction(CMDashClockExtension.ACTION_DATA_UPDATE);
        context.startService(i);
    }
}
