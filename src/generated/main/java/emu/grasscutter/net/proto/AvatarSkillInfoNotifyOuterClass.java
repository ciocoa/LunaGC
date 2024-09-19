// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSkillInfoNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarSkillInfoNotifyOuterClass {
  private AvatarSkillInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */
    int getSkillMapCount();
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */
    boolean containsSkillMap(
        int key);
    /**
     * Use {@link #getSkillMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
    getSkillMap();
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
    getSkillMapMap();
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */

    emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(
        int key,
        emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue);
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */

    emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(
        int key);

    /**
     * <code>uint64 guid = 4;</code>
     * @return The guid.
     */
    long getGuid();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 28799
   * </pre>
   *
   * Protobuf type {@code AvatarSkillInfoNotify}
   */
  public static final class AvatarSkillInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSkillInfoNotify)
      AvatarSkillInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSkillInfoNotify.newBuilder() to construct.
    private AvatarSkillInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSkillInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarSkillInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                skillMap_ = com.google.protobuf.MapField.newMapField(
                    SkillMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
              skillMap__ = input.readMessage(
                  SkillMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              skillMap_.getMutableMap().put(
                  skillMap__.getKey(), skillMap__.getValue());
              break;
            }
            case 32: {

              guid_ = input.readUInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetSkillMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.class, emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.Builder.class);
    }

    public static final int SKILL_MAP_FIELD_NUMBER = 2;
    private static final class SkillMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
    internalGetSkillMap() {
      if (skillMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SkillMapDefaultEntryHolder.defaultEntry);
      }
      return skillMap_;
    }

    public int getSkillMapCount() {
      return internalGetSkillMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */

    @java.lang.Override
    public boolean containsSkillMap(
        int key) {
      
      return internalGetSkillMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSkillMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap() {
      return getSkillMapMap();
    }
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap() {
      return internalGetSkillMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(
        int key,
        emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> map =
          internalGetSkillMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> map =
          internalGetSkillMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int GUID_FIELD_NUMBER = 4;
    private long guid_;
    /**
     * <code>uint64 guid = 4;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSkillMap(),
          SkillMapDefaultEntryHolder.defaultEntry,
          2);
      if (guid_ != 0L) {
        output.writeUInt64(4, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> entry
           : internalGetSkillMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
        skillMap__ = SkillMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, skillMap__);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, guid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify other = (emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify) obj;

      if (!internalGetSkillMap().equals(
          other.internalGetSkillMap())) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (!internalGetSkillMap().getMap().isEmpty()) {
        hash = (37 * hash) + SKILL_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSkillMap().hashCode();
      }
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 4.6.0
     * CmdId: 28799
     * </pre>
     *
     * Protobuf type {@code AvatarSkillInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillInfoNotify)
        emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetSkillMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetMutableSkillMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.class, emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        internalGetMutableSkillMap().clear();
        guid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.internal_static_AvatarSkillInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify build() {
        emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify result = new emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify(this);
        int from_bitField0_ = bitField0_;
        result.skillMap_ = internalGetSkillMap();
        result.skillMap_.makeImmutable();
        result.guid_ = guid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify.getDefaultInstance()) return this;
        internalGetMutableSkillMap().mergeFrom(
            other.internalGetSkillMap());
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> skillMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
      internalGetSkillMap() {
        if (skillMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SkillMapDefaultEntryHolder.defaultEntry);
        }
        return skillMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
      internalGetMutableSkillMap() {
        onChanged();;
        if (skillMap_ == null) {
          skillMap_ = com.google.protobuf.MapField.newMapField(
              SkillMapDefaultEntryHolder.defaultEntry);
        }
        if (!skillMap_.isMutable()) {
          skillMap_ = skillMap_.copy();
        }
        return skillMap_;
      }

      public int getSkillMapCount() {
        return internalGetSkillMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */

      @java.lang.Override
      public boolean containsSkillMap(
          int key) {
        
        return internalGetSkillMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSkillMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMap() {
        return getSkillMapMap();
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> getSkillMapMap() {
        return internalGetSkillMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrDefault(
          int key,
          emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> map =
            internalGetSkillMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo getSkillMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> map =
            internalGetSkillMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSkillMap() {
        internalGetMutableSkillMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */

      public Builder removeSkillMap(
          int key) {
        
        internalGetMutableSkillMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo>
      getMutableSkillMap() {
        return internalGetMutableSkillMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */
      public Builder putSkillMap(
          int key,
          emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableSkillMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 2;</code>
       */

      public Builder putAllSkillMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo> values) {
        internalGetMutableSkillMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 4;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 4;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AvatarSkillInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillInfoNotify)
    private static final emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify();
    }

    public static emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillInfoNotify>() {
      @java.lang.Override
      public AvatarSkillInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarSkillInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarSkillInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSkillInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSkillInfoNotifyOuterClass.AvatarSkillInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillInfoNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillInfoNotify_SkillMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AvatarSkillInfoNotify.proto\032\025AvatarSki" +
      "llInfo.proto\"\241\001\n\025AvatarSkillInfoNotify\0227" +
      "\n\tskill_map\030\002 \003(\0132$.AvatarSkillInfoNotif" +
      "y.SkillMapEntry\022\014\n\004guid\030\004 \001(\004\032A\n\rSkillMa" +
      "pEntry\022\013\n\003key\030\001 \001(\r\022\037\n\005value\030\002 \001(\0132\020.Ava" +
      "tarSkillInfo:\0028\001B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarSkillInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillInfoNotify_descriptor,
        new java.lang.String[] { "SkillMap", "Guid", });
    internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor =
      internal_static_AvatarSkillInfoNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarSkillInfoNotify_SkillMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillInfoNotify_SkillMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.AvatarSkillInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
