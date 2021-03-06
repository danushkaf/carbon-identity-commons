///*
// * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package org.wso2.carbon.identity.common.internal.handler;
//
///**
// * Handler Config Key.
// */
//public class HandlerConfigKey {
//
//    private String type;
//    private String name;
//
//    public HandlerConfigKey() {
//    }
//
//    public HandlerConfigKey(String type, String name) {
//        this.type = type;
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//
//        HandlerConfigKey that = (HandlerConfigKey) o;
//
//        if (!type.equals(that.type)) {
//            return false;
//        }
//        return name.equals(that.name);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = type.hashCode();
//        result = 31 * result + name.hashCode();
//        return result;
//    }
//}
