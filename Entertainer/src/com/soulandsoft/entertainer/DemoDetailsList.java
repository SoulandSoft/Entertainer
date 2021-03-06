/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.soulandsoft.entertainer;

import com.soulandsoft.entertainer.BasicMapDemoActivity;

import com.soulandsoft.entertainer.SaveStateDemoActivity;

/**
 * A list of all the demos we have available.
 */
public final class DemoDetailsList {

    /** This class should not be instantiated. */
    private DemoDetailsList() {}

    public static final com.soulandsoft.entertainer.DemoDetails[] DEMOS = {
        new com.soulandsoft.entertainer.DemoDetails(R.string.basic_map_demo_label,
                        R.string.basic_map_demo_description,
                        BasicMapDemoActivity.class),
        new com.soulandsoft.entertainer.DemoDetails(R.string.save_state_demo_label,
                        R.string.save_state_demo_description,
                        SaveStateDemoActivity.class),

    };
}
