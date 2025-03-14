/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.test.infra.etcd3.services;

import org.apache.camel.test.infra.common.services.SimpleTestServiceBuilder;

public final class Etcd3ServiceFactory {

    private Etcd3ServiceFactory() {

    }

    public static SimpleTestServiceBuilder<Etcd3Service> builder() {
        return new SimpleTestServiceBuilder<>("etcd");
    }

    public static Etcd3Service createService() {
        return builder()
                .addLocalMapping(Etcd3LocalContainerTestService::new)
                .addRemoteMapping(Etcd3RemoteTestService::new)
                .build();
    }

    public static class Etcd3LocalContainerTestService extends Etcd3LocalContainerInfraService implements Etcd3Service {
    }

    public static class Etcd3RemoteTestService extends Etcd3RemoteInfraService implements Etcd3Service {
    }
}
