// CHECKSTYLE:OFF Generated code
/*
 * Copyright (C) 2017 The Android Open Source Project
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

// automatically generated by the FlatBuffers compiler, do not modify

package androidx.text.emoji.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MetadataList extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static MetadataList getRootAsMetadataList(ByteBuffer _bb) { return getRootAsMetadataList(_bb, new MetadataList()); }
  public static MetadataList getRootAsMetadataList(ByteBuffer _bb, MetadataList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MetadataList __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int version() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public androidx.text.emoji.flatbuffer.MetadataItem list(int j) { return list(new androidx.text.emoji.flatbuffer.MetadataItem(), j); }
  public androidx.text.emoji.flatbuffer.MetadataItem list(androidx.text.emoji.flatbuffer.MetadataItem obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int listLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public androidx.text.emoji.flatbuffer.MetadataItem.Vector listVector() { return listVector(new androidx.text.emoji.flatbuffer.MetadataItem.Vector()); }
  public androidx.text.emoji.flatbuffer.MetadataItem.Vector listVector(androidx.text.emoji.flatbuffer.MetadataItem.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String sourceSha() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer sourceShaAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer sourceShaInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }

  public static int createMetadataList(FlatBufferBuilder builder,
      int version,
      int listOffset,
      int sourceShaOffset) {
    builder.startTable(3);
    MetadataList.addSourceSha(builder, sourceShaOffset);
    MetadataList.addList(builder, listOffset);
    MetadataList.addVersion(builder, version);
    return MetadataList.endMetadataList(builder);
  }

  public static void startMetadataList(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addVersion(FlatBufferBuilder builder, int version) { builder.addInt(0, version, 0); }
  public static void addList(FlatBufferBuilder builder, int listOffset) { builder.addOffset(1, listOffset, 0); }
  public static int createListVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startListVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addSourceSha(FlatBufferBuilder builder, int sourceShaOffset) { builder.addOffset(2, sourceShaOffset, 0); }
  public static int endMetadataList(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishMetadataListBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedMetadataListBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MetadataList get(int j) { return get(new MetadataList(), j); }
    public MetadataList get(MetadataList obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

