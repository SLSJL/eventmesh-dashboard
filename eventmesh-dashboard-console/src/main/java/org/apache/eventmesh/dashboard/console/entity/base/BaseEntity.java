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

package org.apache.eventmesh.dashboard.console.entity.base;

import java.io.Serializable;
import java.sql.Timestamp;

import io.swagger.v3.oas.annotations.media.Schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Base Entity provide some basic fields that every Eventmesh Dashboard Entity would have
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, exclude = {"createTime", "updateTime"})
@Schema(name = "BaseEntity", description = "Base entity")
@SuperBuilder
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -2697805837923579585L;
    /**
     * Primary key
     */
    @Schema(name = "id", description = "primary key")
    protected Long id;

    protected Long clusterId;

    protected Timestamp createTime;

    protected Timestamp updateTime;
}
