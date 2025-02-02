/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.streams.common.channel.impl.memory;

import com.alibaba.fastjson.JSONObject;
import org.apache.rocketmq.streams.common.channel.split.ISplit;
import org.apache.rocketmq.streams.common.configurable.BasedConfigurable;

public class MemorySplit extends BasedConfigurable implements ISplit<MemorySplit, MemorySplit> {
    @Override
    public String getQueueId() {
        return 1 + "";
    }

    @Override
    public String getPlusQueueId() {
        return 2 + "";
    }

    @Override
    public MemorySplit getQueue() {
        return this;
    }

    @Override
    public int compareTo(MemorySplit o) {
        return 0;
    }

    @Override
    protected void getJsonObject(JSONObject jsonObject) {
        super.getJsonObject(jsonObject);

    }

    public MemorySplit() {
    }
}
