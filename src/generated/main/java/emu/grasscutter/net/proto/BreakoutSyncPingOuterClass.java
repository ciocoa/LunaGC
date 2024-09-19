// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BreakoutSyncPing.proto

package emu.grasscutter.net.proto;

public final class BreakoutSyncPingOuterClass {
  private BreakoutSyncPingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutSyncPingOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutSyncPing)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 client_game_time = 13;</code>
     * @return The clientGameTime.
     */
    long getClientGameTime();

    /**
     * <code>uint64 server_game_time = 4;</code>
     * @return The serverGameTime.
     */
    long getServerGameTime();
  }
  /**
   * <pre>
   * Obf: LEPGDJGKNLI
   * </pre>
   *
   * Protobuf type {@code BreakoutSyncPing}
   */
  public static final class BreakoutSyncPing extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BreakoutSyncPing)
      BreakoutSyncPingOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BreakoutSyncPing.newBuilder() to construct.
    private BreakoutSyncPing(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BreakoutSyncPing() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BreakoutSyncPing();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BreakoutSyncPing(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 32: {

              serverGameTime_ = input.readUInt64();
              break;
            }
            case 104: {

              clientGameTime_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.internal_static_BreakoutSyncPing_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.internal_static_BreakoutSyncPing_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.class, emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.Builder.class);
    }

    public static final int CLIENT_GAME_TIME_FIELD_NUMBER = 13;
    private long clientGameTime_;
    /**
     * <code>uint64 client_game_time = 13;</code>
     * @return The clientGameTime.
     */
    @java.lang.Override
    public long getClientGameTime() {
      return clientGameTime_;
    }

    public static final int SERVER_GAME_TIME_FIELD_NUMBER = 4;
    private long serverGameTime_;
    /**
     * <code>uint64 server_game_time = 4;</code>
     * @return The serverGameTime.
     */
    @java.lang.Override
    public long getServerGameTime() {
      return serverGameTime_;
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
      if (serverGameTime_ != 0L) {
        output.writeUInt64(4, serverGameTime_);
      }
      if (clientGameTime_ != 0L) {
        output.writeUInt64(13, clientGameTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverGameTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, serverGameTime_);
      }
      if (clientGameTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, clientGameTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing other = (emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing) obj;

      if (getClientGameTime()
          != other.getClientGameTime()) return false;
      if (getServerGameTime()
          != other.getServerGameTime()) return false;
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
      hash = (37 * hash) + CLIENT_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getClientGameTime());
      hash = (37 * hash) + SERVER_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerGameTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing prototype) {
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
     * Obf: LEPGDJGKNLI
     * </pre>
     *
     * Protobuf type {@code BreakoutSyncPing}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutSyncPing)
        emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.internal_static_BreakoutSyncPing_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.internal_static_BreakoutSyncPing_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.class, emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.newBuilder()
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
        clientGameTime_ = 0L;

        serverGameTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.internal_static_BreakoutSyncPing_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing build() {
        emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing buildPartial() {
        emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing result = new emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing(this);
        result.clientGameTime_ = clientGameTime_;
        result.serverGameTime_ = serverGameTime_;
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
        if (other instanceof emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing) {
          return mergeFrom((emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing other) {
        if (other == emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing.getDefaultInstance()) return this;
        if (other.getClientGameTime() != 0L) {
          setClientGameTime(other.getClientGameTime());
        }
        if (other.getServerGameTime() != 0L) {
          setServerGameTime(other.getServerGameTime());
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
        emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long clientGameTime_ ;
      /**
       * <code>uint64 client_game_time = 13;</code>
       * @return The clientGameTime.
       */
      @java.lang.Override
      public long getClientGameTime() {
        return clientGameTime_;
      }
      /**
       * <code>uint64 client_game_time = 13;</code>
       * @param value The clientGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setClientGameTime(long value) {
        
        clientGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 client_game_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientGameTime() {
        
        clientGameTime_ = 0L;
        onChanged();
        return this;
      }

      private long serverGameTime_ ;
      /**
       * <code>uint64 server_game_time = 4;</code>
       * @return The serverGameTime.
       */
      @java.lang.Override
      public long getServerGameTime() {
        return serverGameTime_;
      }
      /**
       * <code>uint64 server_game_time = 4;</code>
       * @param value The serverGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setServerGameTime(long value) {
        
        serverGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 server_game_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerGameTime() {
        
        serverGameTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:BreakoutSyncPing)
    }

    // @@protoc_insertion_point(class_scope:BreakoutSyncPing)
    private static final emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing();
    }

    public static emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutSyncPing>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutSyncPing>() {
      @java.lang.Override
      public BreakoutSyncPing parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BreakoutSyncPing(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BreakoutSyncPing> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BreakoutSyncPing> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BreakoutSyncPingOuterClass.BreakoutSyncPing getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutSyncPing_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BreakoutSyncPing_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BreakoutSyncPing.proto\"F\n\020BreakoutSync" +
      "Ping\022\030\n\020client_game_time\030\r \001(\004\022\030\n\020server" +
      "_game_time\030\004 \001(\004B\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BreakoutSyncPing_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutSyncPing_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BreakoutSyncPing_descriptor,
        new java.lang.String[] { "ClientGameTime", "ServerGameTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
