/*
 * Copyright (C) 2022 FlamingoOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.derpfest.settings.preference

import androidx.preference.Preference

import com.android.internal.logging.nano.MetricsProto
import com.android.settings.dashboard.DashboardFragment

abstract class DerpDashboardFragment: DashboardFragment() {
    override fun getMetricsCategory(): Int = MetricsProto.MetricsEvent.DERP

    override fun onDisplayPreferenceDialog(preference: Preference) {
        super.onDisplayPreferenceDialog(preference)
    }

    companion object {
        const val REQUEST_KEY = "DerpDashboardFragment#RequestKey"
    }
}
