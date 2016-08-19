/**
*    Copyright 2011,2012 Big Switch Networks, Inc. 
*    Originally created by David Erickson, Stanford University
* 
*    Licensed under the Apache License, Version 2.0 (the "License"); you may
*    not use this file except in compliance with the License. You may obtain
*    a copy of the License at
*
*         http://www.apache.org/licenses/LICENSE-2.0
*
*    Unless required by applicable law or agreed to in writing, software
*    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
*    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
*    License for the specific language governing permissions and limitations
*    under the License.
**/

package net.floodlightcontroller.core.web.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import net.floodlightcontroller.core.types.NodePortTuple;

/**
 * Serialize a NodePortTupleSerializer
 */
public class NodePortTupleSerializer extends JsonSerializer<NodePortTuple> {

    @Override
    public void serialize(NodePortTuple npt, JsonGenerator jGen,
                          SerializerProvider serializer)
                                  throws IOException, JsonProcessingException {
        serialize(npt, jGen);
    }
    
    public static void serialize(NodePortTuple npt, JsonGenerator jGen) throws IOException {
        jGen.writeStartObject();
        jGen.writeStringField("switch", npt.getNodeId().toString());
        jGen.writeStringField("port", npt.getPortId().toString());
        jGen.writeEndObject();
    }
}