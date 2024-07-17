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

package org.apache.eventmesh.dashboard.console.function.metadata.syncservice.cluster;

import org.apache.eventmesh.dashboard.common.model.metadata.AclMetadata;
import org.apache.eventmesh.dashboard.common.model.remoting.acl.GetAclsRequest;
import org.apache.eventmesh.dashboard.console.function.metadata.syncservice.SyncDataService;
import org.apache.eventmesh.dashboard.service.remoting.AclRemotingService;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Setter;

@Service
public class AclSyncFromClusterService implements SyncDataService<AclMetadata> {

    @Setter
    private AclRemotingService aclRemotingService;

    @Override
    public List<AclMetadata> getData() {
        GetAclsRequest getAclsRequest = new GetAclsRequest();
        //        aclRemotingService.getAllAcls(getAclsRequest).
        return null;
    }
}